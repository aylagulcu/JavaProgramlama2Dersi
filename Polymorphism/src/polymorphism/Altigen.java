/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author ayla
 */
public class Altigen extends Cokgen{
    
    public int uzunluk;
    
    public Altigen(){
        this(0);
    }
    
    public Altigen(int uzunluk){
        this.kenarSayisi= 6;
        this.uzunluk= uzunluk;
    }
    
    
    public double alanHesapla(){
        return 6 * this.uzunluk * this.uzunluk * Math.sqrt(3) / 4;
    }

    
    
}
