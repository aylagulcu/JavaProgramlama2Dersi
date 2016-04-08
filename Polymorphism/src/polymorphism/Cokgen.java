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
public abstract class Cokgen { 
// alanHesapla isimli abstract metod tanımlandığı için class'ın da abstract olması gereklidir!
// Ancak abstract class içinde abstract olmayan metodlar da olabilir!
    
    protected int kenarSayisi= 0; // protected: türeyen class' lar erişebilir.

    public int getKenarSayisi() {
        return kenarSayisi;
    }

    public abstract double alanHesapla(); // türeyen class abstract metodu implement etmelidir!

    // türeyen class'ların metodu override edememesi isteniyor:
    public final void write(){
        System.out.printf("Bu nesnenin kenar sayısı %d' dir.\n", kenarSayisi);
    }
    
    //"final" keyword' u class' lar için de kullanılır!
    


}
