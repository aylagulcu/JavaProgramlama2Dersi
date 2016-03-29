/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Employee extends Person{
    
    public Employee() {
        this("(2) Invoke Employee’s overloaded constructor");
        System.out.println("(3) Employee's no-arg constructor is invoked");
    }
    
    public Employee(String s) {
        super(s);
        write();
        
        System.out.println("Employee' nin (String) alan constructor!ı çalıştı");
        System.out.println(s);
    }
    
    public void write(){
        System.out.println("Bu Employee nesnesinin adı: "+ this.getName());
    }
}
