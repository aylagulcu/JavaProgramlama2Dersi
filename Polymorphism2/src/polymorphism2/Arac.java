package polymorphism2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ayla
 */
public abstract class Arac {
   
    protected int maxHiz; // sub classlardan erişilebilir
    protected int agirlik; // sub classlardan erişilebilir
    
    private static int sayi= 0;
    

    public Arac(){  
        sayi++;
    }
  
    public Arac(int mH, int ag){
        this();
        this.maxHiz= mH;
        this.agirlik= ag;
    }

    public int get_maxHiz(){
        return this.maxHiz;
    }
    
    public static int get_sayi(){
        return sayi;
    }
    
    public int get_agirlik(){
        return this.agirlik;
    }
    
   
    public abstract void hizlan();
    
    public final void stop(){
        System.out.println("Durdu!");
    }
    
}
