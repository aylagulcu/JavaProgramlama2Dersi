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
    
    public Faculty() {
        // ilk olarak super class' ın constructor'ına gider!
        // Son olarak aşağıdaki kod çalışır!
        System.out.println("(4) Faculty's no-arg constructor is invoked");
    }
    
    public Faculty(String nm) {
        super(nm);
        System.out.println("Faculty' nin (String) alan constructor!ı çalıştı");
    }
    
    
    public void write(){
         System.out.println("Bu faculty nesnesinin adı: "+ this.getName());
    }

    @Override
    public String toString(){
        return "Faculty nesnesi, Object' in metodunu override etti!";
    }
    

    
    
}
