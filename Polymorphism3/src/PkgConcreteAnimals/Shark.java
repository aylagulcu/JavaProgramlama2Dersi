/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgConcreteAnimals;

import PkgAnimals.Carnivore;
import PkgAnimals.Swimmable;

/**
 *
 * @author ayla
 */
public class Shark extends Carnivore implements Swimmable{
    
    public Shark(int w) {
        super(w);
    }

    @Override
    public void swim() {
        System.out.println(this.getClass().getName()+ " is swimming");
    }
    
    @Override
    public void catchAnimal() {
         System.out.println(this.getClass().getName()+ " is catching the animal in Shark's own way.");
    }

    @Override
    public void move() {
        System.out.println(this.getClass().getName()+ " is moving in Shark's own way."); 
    }
    
    
}
