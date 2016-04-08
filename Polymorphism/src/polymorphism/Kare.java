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
public class Kare extends Cokgen{
    
    int kenarUzunlugu;
    
    public Kare(){
        this(0);
    }
    
    public Kare(int uzunluk){
        this.kenarSayisi= 4;
        this.kenarUzunlugu= uzunluk;
    }
    
    public double alanHesapla(){
        return this.kenarUzunlugu * this.kenarUzunlugu;
    }
    
    
}
