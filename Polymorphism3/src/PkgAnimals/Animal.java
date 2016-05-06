/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgAnimals;

/**
 *
 * @author ayla
 */
public abstract class Animal {
    private int weightKG;
    
    public Animal(int w){
        this.weightKG= w;
    }
    
    public void eat(){
        System.out.println(this.getClass().getName()+ " is eating...");
    }
    
    public abstract void move();
    
    
    
}
