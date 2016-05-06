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
public abstract class Herbivore extends Animal {

    public Herbivore(int w) {
        super(w);
    }
    
    public void eatPlant(){
         System.out.println(this.getClass().getName()+ " is eating plant");
    }
    
    public abstract void getPlant();
}
