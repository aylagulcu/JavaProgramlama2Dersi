

/*
 *
 * Ogrenci class' ı Katilimci class' ının bütün özelliklerini, metodlarını alıyor (inheritance)
 */


public class Ogrenci extends Katilimci{
    
    // Bu class için geçerli bir özellik (property):
    private int basariNotu;

    public Ogrenci(){
        super();
        System.out.println("Yeni bir öğrenci yaratılıyor...");
    }
    public void setBasariNotu(int n){
        if (n>= 0 && n<=100)
            basariNotu= n;
        else
          basariNotu= 0;  
    }
    
    public int getBasariNotu(){
        return this.basariNotu;
    }
    
    

  
    
  

   
    
}
