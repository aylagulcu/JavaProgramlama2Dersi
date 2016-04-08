package polymorphism;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ayla
 */
public class Ucgen extends Cokgen{
    
    int taban;
    int yukseklik;
    
    public Ucgen(){
        this(0,0);
    }
    
    public Ucgen(int tabanUzunluk, int yukseklik){
        this.kenarSayisi= 3;
        this.taban= tabanUzunluk;
        this.yukseklik= yukseklik;
    }
    
    
    public double alanHesapla(){
        return this.taban * this.yukseklik / 2;
    }
}
