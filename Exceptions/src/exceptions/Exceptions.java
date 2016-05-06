/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.util.ArrayList;
import java.util.Scanner;

public class Exceptions {

    public static void main(String[] args) {

        // Ornek 1: java.lang.ArrayIndexOutOfBoundsException
        System.out.println("*****Ornek 1******");
        int isimSayisi= 3;
        String[] isimler= { "Ayse", "Ali", "Ahmet" };
        System.out.println("İsimler ekrana yazılıyor:");
        
        try{
            for (int i=0; i< 5; i++)
                System.out.println("İsimler eman ekrana yazılıyor: "+ isimler[i]);
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Dizi indexlerinin aşılması hatası oluştu!");
        }
        catch(Exception ex){
            System.out.println("Kalan işlemler yapılamıyor, hata oluştu: "+ ex.toString());
        }
        finally{
             System.out.println("Dizi elemanları yazdırma işlemi başarılı ya da başarısız olarak tamamalandı");
        }
         
        
        // Ornek 2: java.lang.ClassCastException
        System.out.println("*****Ornek 2******");
        ArrayList<Object> objeler = new ArrayList<Object>();
        objeler.add(new Integer(55));
        objeler.add(new String("İstanbul"));
        objeler.add(new Integer(2));
        objeler.add(new Double(2.15));

        System.out.println("Integer objeler ekrana yazdırılıyor:");
        // instanceof operatorunu kullanmadan type cast yapıyoruz, hata!
        try {
            for (Object o : objeler) {
                System.out.println("Sayi integer değeri: " + (Integer) o);
            }
        } catch (ClassCastException except) {
            System.out.println("Tip dönüşümü hatası, kalan işlemler yapılamıyor!");
        } catch (Exception ex) {
            System.out.println("Hata, kalan işlemler yapılamıyor!" + ex.toString());
        }
        
        
        // Her bir eleman yazdırırken ayrı try bloğu içinde, 
        // böylece hatasız olanları yazdırmaya devam eder.
        System.out.println();
        System.out.println("Integer objeler ekrana yazdırılıyor:");
        for (Object o : objeler) {
            try{
                System.out.println("Sayi integer değeri: " + (Integer) o);
            }
            catch (ClassCastException except) {
                System.out.println("Tip dönüşümü hatası, diğer objeden devam ediliyor");
            } 
            catch (Exception ex) {
                System.out.println("Hata, diğer objeden devam ediliyor" + ex.toString());
            }
        } // end for each
        
        // Ornek 3: Klavyeden okunan sayılar Integer' a çeviriliyor:
        // Olası hatalar: 
        // NumberFormatException
        // ArithmeticException: / by zero
        System.out.println("*****Ornek 3******");
        int sayi1= 0, sayi2= 0;
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Birinci sayiyi giriniz...:");
        String s1= sc.next();
        System.out.println("İkinci sayiyi giriniz...:");
        String s2= sc.next();
        boolean basarili= true;
        String hataMesaji="";
       
        try{
            sayi1= Integer.parseInt(s1);
            sayi2= Integer.parseInt(s2);
            System.out.println("İki sayının bölümü: "+ (sayi1 / sayi2));
        }
        catch (NumberFormatException e1){
            basarili= false;
            hataMesaji= e1.toString();
            System.out.println(hataMesaji);
        }
        catch (ArithmeticException e2){
            basarili= false;
            hataMesaji= e2.toString();
            System.out.println(hataMesaji);
        }
        catch (Exception e){
            basarili= false;
            hataMesaji= e.toString();
            System.out.println(hataMesaji);
        }
        finally{
            System.out.println(basarili ? "İşlem başarılı" : "İşlem başarısız");
        }
        
        // Ornek 4: Bölme işlemi metod ile yapılıyor:
        // Gelen Exception tutulmak zorunda:
        System.out.println("*****Ornek 4******");
        double n1= 55;
        double n2= 0;
        try {
            double bolum= bol(n1, n2);
            System.out.println("İki sayının bölümü: "+ bolum);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        finally{
            System.out.println("İşlem bitti.");
        }
        
        
        
    }

    private static double bol(double a, double b) throws Exception{
        double bolum;
        try{
            bolum= a / b;
        }
        catch (Exception e){
            String hataMesaji= e.toString();
            System.out.println(hataMesaji);
            throw e;
        }
        return bolum;
    }

}
