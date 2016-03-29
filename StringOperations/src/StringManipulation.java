/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ayla
 */
public class StringManipulation {

    public static void main(String[] args) {
        
        char karakter= 'A';
        System.out.println("A' nın ASCII kodu: "+(int)karakter);
  
        karakter= 'a';
        System.out.println("a' nın ASCII kodu: "+(int)karakter);
        
        karakter= 'B';
        System.out.println("B' nın ASCII kodu: "+(int)karakter);
        
        karakter= 'b';
        System.out.println("b' nın ASCII kodu: "+(int)karakter);
        
        String yazi1= "aba";
        String yazi2= "aBa";
        
        // CompareTo() metodu:
        int sonuc= yazi1.compareToIgnoreCase(yazi2); // possible return values: pozitif sayi/negatif sayı/ sıfır
        
        System.out.println("Işlem sonucu: "+ sonuc);
        if (sonuc < 0){
            System.out.println("Sözlükte Yazi 1 önce gelir");
        } // end if
        else if (sonuc== 0)
            System.out.println("Yazilar aynıdır");
        else
            System.out.println("Sözlükte Yazi 2 önce gelir");
    
        // charAt() metodu örnek: tersten yazdırma
        yazi1= "Istanbul";
        int uzunluk= yazi1.length();
        System.out.println("Verilen ilk string: " +yazi1);
        for (int i= uzunluk-1; i>=0; i-- )
            System.out.print(yazi1.charAt(i));
        System.out.println();
        
        // concat() metodu:
        yazi1= "Istanbul";
        yazi2= "Adana";
        System.out.println("Orijinal değerler");
        System.out.println("Yazi 1: " +yazi1);
        System.out.println("Yazi 2: " +yazi2);
        
        yazi1= yazi1.concat(yazi2);
        //System.out.println("Yazi 3: " +yazi3);
        System.out.println("Yazi 1: " +yazi1);
        System.out.println("Yazi 2: " +yazi2);
        System.out.println();
        
        
        System.out.println("Iki string birbirine kopyalanıyor");
        yazi1= "Istanbul";
        String yazi5= yazi1;
        
        for (int i= 0; i<2; i++){
            yazi1= yazi1+ yazi5;
            // concat() metodu ile:
            // yazi1= yazi1.concat(yazi5);
        }
        System.out.println("Yazi 1: " +yazi1);
        System.out.println("Yazi 5: " +yazi5);
        System.out.println();
        
        
        // substring() metodu:
        System.out.println("Substring metodu:");
        yazi1= "Istanbul"; yazi2= "Adana";
        System.out.println("Yazi 1: " +yazi1);
        System.out.println("Yazi 2: " +yazi2);
        
        String y1= yazi1.substring(0, 2);
        String y2= yazi2.substring(0, 2);
        
        System.out.println("Y 1: " +y1);
        System.out.println("Y 2: " +y2);
        
        // replace() metodu:
         yazi1= "Istanbula gidiyorum bu aksam";
         System.out.println("Yazi 1: " +yazi1);
         yazi1= yazi1.replace('s', 'ş');
         System.out.println("Yazi 1: " +yazi1);
         System.out.println("Yazi1'in 6. karakteri V yapılmak isteniyor");
         
         yazi1= yazi1.replace(yazi1.charAt(5), 'V');
         System.out.println("Yazi 1: " +yazi1);
         System.out.println("Sorun: replace metodu belirtilen karaktere eşleşen hepsini V ile değiştirdi ");
         // substring kullanılıyor:
         System.out.println();
         yazi1= "Istanbula gidiyorum bu aksam";
         System.out.println("Yazi 1: " +yazi1);
         String yazi3= yazi1.substring(0, 9); // Istanbula
         yazi3= yazi3.replace(yazi1.charAt(5), 'V');
         String yazi4= yazi1.substring(9);
         yazi1= yazi3.concat(yazi4);
         System.out.println("Yazi 1 F. Eren değiştirdikten sonra: " +yazi1);
         
         
         // split() metodu ve String diziler üzerinde işlemler
         String isimler= "Ahmet,   Furkan   ,   Ayşe,   Nurcan     , Furkan,      Emel, Zeynep,  Hasan, Emre, Furkan";
         System.out.println("Verilen isimler listesi: " + isimler);
         String[] isimlerDizisi= isimler.split(",");
         
         for (String s: isimlerDizisi)
             System.out.println(s);
         
         // Dizi elemlarının başlarındaki ve sonlarındaki boşluklar Trim metodu ile temizleniyor
         for (int i= 0; i< isimlerDizisi.length; i++){
            isimlerDizisi[i]= isimlerDizisi[i].trim();
         }
         
        for (String s: isimlerDizisi)
             System.out.println(s);
                 
        // Dizinin "Furkan" olan elemanları "Mehmet" olarak değiştiriliyor:
        String arananIsim= "Furkan";
        String yeniIsim= "Mehmet";
        //boolean degistir;
       
        for (int i= 0; i< isimlerDizisi.length; i++){
            if ((isimlerDizisi[i]).equals(arananIsim)){
                isimlerDizisi[i]= yeniIsim;
            }
        } // end i for
        
        for (String s: isimlerDizisi)
             System.out.println(s);
         
         
         
        
        
         
        
    }
    
}
