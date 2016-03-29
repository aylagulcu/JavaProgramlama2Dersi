/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Person {
    
    private String name= "";
    
    public Person() {
        // ilk olarak bu constructor çalıştı!
        System.out.println("(1) Person's no-arg constructor is invoked");
    }
    
    public Person(String s) {
        this.name= s;
        write();
    }
    
    public void write(){
        System.out.println("Bu Person nesnesinin adı: "+ this.name);
    }
    
    public void setName(String s){
        this.name= s;
    }
    
    public String getName(){
        return this.name;
    }

}
