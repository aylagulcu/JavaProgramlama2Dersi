/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ayla
 */
public class Faculty extends Employee{

    
    public static void main(String[] args) {
        Faculty f1= new Faculty("Ayse");
        f1.write();
        // f1.setName("Ahmet Bey");
        
        // System.out.println("Faculty's name: "+ f1.getName());
        // f1.setName("Muhammed");
        // System.out.println("Faculty's name: "+ f1.getName());

    }
    
    public Faculty() {
        // ilk olarak super class' ın constructor'ına gider!
        // Son olarak aşağıdaki kod çalışır!
        System.out.println("(4) Faculty's no-arg constructor is invoked");
    }
    
    
    public void write(){
         System.out.println("Bu faculty nesnesinin adı: "+ this.getName());
    }

    
    public Faculty(String nm) {
        super(nm);
        System.out.println("Faculty' nin (String) alan constructor!ı çalıştı");
    }
    
    
}
