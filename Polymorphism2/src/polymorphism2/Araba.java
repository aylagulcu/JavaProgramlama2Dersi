/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism2;

/**
 *
 * @author ayla
 */
public class Araba extends Arac {
    
    private int yakitTuketimi;
    
    int kapiSayisi;
    
    public Araba(){
        // super();
    }
    
    
    public Araba(int h, int a, int y){
        // super(h, a);
    
        this.
        yakitTuketimi= y;
    }


    public int get_yakit(){
        return this.yakitTuketimi;
    }
    
    
    public void hizlan(){
        System.out.println("Araba hızlanıyor");
    }
    
    /* Araba base class ile aynı stop metodunu override edemez
    public void stop(){
        System.out.println("Araba böyle durdu!");
    }
    */
    
    public void vitesDegistir(){
        System.out.println("Araba vites değiştiriyor");
    }
    
    
}
