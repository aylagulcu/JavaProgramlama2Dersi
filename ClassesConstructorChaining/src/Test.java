/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ayla
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Person p1 = new Person(); // Person no-arg constructor çalışıyor
        p1.setName("Ali"); // p1' in name field' ı değiştiriliyor
        System.out.println(p1.getName()); // p1' in name' i alınıyor
        */
        
        /*
        Person p2 = new Person("Ahmet"); 
        // Person String alan constructor çalışıyor, 
        // bu constructor write metodunu da çalıştırıyor
        */
        
        /*
        Employee e1= new Employee();        
        Employee e2= new Employee("Can");
        */
                 
        /*
        Faculty f1= new Faculty();
         // 1 Faculty no-arg constructor' a gider, ama önce 
         // 2 Employee no-arg constructor' a gider, ama önce
         // 3 Employee String alan constructor' a gider, ama önce
         // 4 Person no-arg constructor' a gider; 
         // Person kimseden türemediği için no-arg constructor çalışır
         // Dikkat! Person super class' ının constructor' ı mutlaka çalışır, 
         // no-arg ya da başka bir constructor
         // 5 Employee String alan constructor' ı çalıştırır
         // 6 Employee no-arg constructor' ı çalıştırır
         // 7 Faculty no-arg constructor' ı çalıştırır
        System.out.println(f1.getName()); // name alanı boş!
        */ 
        
     
        Faculty f2 = new Faculty("Ayse");
       
        // toString() metodu çağırılıyor:
        System.out.println(f2.toString());
        
        
        
    }
    
}
