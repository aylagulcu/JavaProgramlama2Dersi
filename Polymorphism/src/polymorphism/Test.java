/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

import java.util.ArrayList;

/**
 *
 * @author ayla
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kare karem= new Kare(10);
        
        Ucgen ucgenim= new Ucgen(10, 5);
        
        Altigen altigenim= new Altigen(10);
        
        ArrayList<Cokgen> cokgenlerim= new ArrayList<Cokgen>();
        cokgenlerim.add(karem);
        cokgenlerim.add(ucgenim);
        cokgenlerim.add(altigenim);
        
        for (Cokgen c: cokgenlerim){
            System.out.println(c.getClass());
            System.out.println(c.kenarSayisi);
            System.out.println(c.alanHesapla());
            c.write();
        }
        
    }
    
}
