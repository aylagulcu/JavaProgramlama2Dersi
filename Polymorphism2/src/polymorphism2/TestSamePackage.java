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
public class TestSamePackage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Araba araba1= new Araba(200, 950, 11); // hiz, ağırlık, yakıt tüketimi
      
         araba1.agirlik= 500;
         araba1.kapiSayisi= 5;
         araba1.maxHiz= 250;
       
    }
    
}
