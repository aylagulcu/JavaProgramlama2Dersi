package PkgAnimals;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ayla
 */
public abstract class Carnivore extends Animal {

    public Carnivore(int w) {
        super(w);
    }
    
    public final void eatMeat(){
        System.out.println(this.getClass().getName()+ " is eating meat");
    }
    
    public abstract void catchAnimal();
    
}
