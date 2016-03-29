/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ayla
 */
public class StringManipulation2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // indexOf metodu:
        
        String cumle1= "Bugun:hava.,güneşli.";
        
        // indexOf metodu:
        int sonuc= cumle1.indexOf('a');
        
        if (sonuc!= -1)
            System.out.println("Verilen stringde istenen karakterin konumu: "+
                sonuc);
        else
            System.out.println("Verilen stringde istenen karakter yok");
        
        
        // REGULAR EXPRESSIONS:
        // . ve veya:
        String word1= "istanful";
        System.out.println(word1+ " matches given string: "+ 
                word1.matches("istan.(u|o)l"));
        
        // [] :
        word1= "Astanbul";
        System.out.println(word1+ " matches given string: "+ 
                word1.matches("[Iİ]stanbul"));
        
        // [^]:
        word1= "pabak";
        System.out.println(word1+ " matches given string: "+ 
                word1.matches("[^tk]abak"));
        
        // [-]:
       
        int sifir= '0';
        System.out.println("Sifirin kodu"+sifir);
        
        char harf= '.';
        int kod= harf;
        System.out.println("harfin kodu: " +kod);
        
        word1= ".aman";
        System.out.println(word1+ " matches given string: "+ 
                word1.matches("[0-z]aman"));
        
        
        
        // \s: 
        word1= "a b ";
        System.out.println(word1+ " matches given string: "+ 
                word1.matches("a\\sb\\s"));
        
        // \\w   * ve + kullanımı
        word1= "afttttttttttta";
        System.out.println(word1+ " matches given string: "+ 
                word1.matches("a[\\w]*a"));
        
        cumle1= "Bugun, hava cok gunesli! ama: evde oturacagim.";
        String[] kelimeler= cumle1.split("[\\W]+");
        
        for (String s: kelimeler)
            System.out.println(s);
  
        
        // ?:
        word1= "aza";
        System.out.println(word1+ " matches given string: "+ 
                word1.matches("a[\\w]?a"));
        // {n}:
        word1= "ala";
        System.out.println(word1+ " matches given string: "+ 
                word1.matches("a[\\w]{2,}a"));
        
        
        // String s = "a+b$#c".replaceAll("[$+#]", "NNN");
        cumle1= "Bugün hava ççççFoooookkkk güneşli.";
        System.out.println("Cumle eski hali: "+ cumle1);
        cumle1= cumle1.replaceAll("[ç]+[o]+[k]+", "çok");
        System.out.println("Cumle yeni hali: "+ cumle1);
        
        
        String kelime= "A.tr@gmail.com"; // alfabe dışı karakterle başlayamaz
        System.out.println("F Karaçay "+ kelime+ " matches given string: "+ 
                kelime.matches("[A-z][\\w|\\W|\\d]*@gmail.com"));
        
        kelime= "f.1234soysal"; // alfabe dışı karakterle başlayamaz
        System.out.println("F Soysal "+ kelime+ " matches given string: "+ 
                kelime.matches("f[\\w&\\W|[\\d]{4,}&\\w]+l"));
        

        /*
        String str1= "Java";
        
        System.out.println(str1+ " mathes given: "+ str1.matches("Jav"));
        
        System.out.println(str1+ " mathes given: "+ str1.matches("Jav."));
        // .: any single character
        str1= "Javb";
        System.out.println(str1+ " mathes given: "+ str1.matches("Jav[a|b]"));
        // or in []
        
        str1= "Java";
        System.out.println(str1+ " mathes given: "+ str1.matches("J(av)a"));
        System.out.println(str1+ " mathes given: "+ str1.matches("J[aeioou]va"));
        
        
        /*
        // Check if the given string ends with a "d":
        str1= "Java is fun oh my god";
        System.out.println(str1+ " mathes given: "+ str1.matches("[\\w]"));
        
        str1= "Javaisfunohmygod";
        System.out.println(str1+ " mathes given: "+ str1.matches("[\\w]*"));
*/
    }
    
}
