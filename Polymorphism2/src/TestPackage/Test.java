/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestPackage;

import java.util.ArrayList;
import polymorphism2.Araba;
import polymorphism2.Arac;
import polymorphism2.Bisiklet;
import polymorphism2.DagBisikleti;

/**
 *
 * @author ayla
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Araba araba1= new Araba(200, 950, 11); // hiz, ağırlık, yakıt tüketimi
        Araba araba2= new Araba(100, 850, 14); // hiz, ağırlık, yakıt tüketimi
               
        Bisiklet bisiklet1= new Bisiklet(12, 10, 0);

        Arac araba3= new Araba(200, 950, 11);
        
        // Araba' ya cast ediliyor:
        Araba a3= (Araba)araba3;
        
        Araba a50= a3;
       
        // Aşağıdaki cast run-time'da hata verir!!! Uygunsuz tip dönüşümü
        /*
        Bisiklet b3= (Bisiklet)araba3;
        */
       
        // Arac abstract class' tır; yeni nesne yaratılamaz.
        /*
        Arac arac= new Arac(200,665);
        Arac arac= new Arac();
        */
        
        Araba aarbaParametresiz1= new Araba();
        Araba aarbaParametresiz2= new Araba();
        
        int aracSayisi= Arac.get_sayi();
        System.out.printf("Toplam %d tane araç yaratıldı\n", aracSayisi );
        System.out.println(araba3);
        System.out.println(a3);
        System.out.println(a50);
        
        /*
        araba1.hizlan();
        bisiklet1.hizlan();
        */
      
     
        ArrayList<Arac> araclar= new ArrayList<Arac>();
        araclar.add(araba1);
        araclar.add(araba2);
        araclar.add(bisiklet1);
        
        for (Arac ar : araclar)
            ar.hizlan();
        
         for (Arac ar : araclar){
            if (ar instanceof Araba)
                ((Araba)ar).vitesDegistir();
            ar.stop();
            
         }
         
         DagBisikleti dBisiklet1= new DagBisikleti();
         
         
    }
    
}
