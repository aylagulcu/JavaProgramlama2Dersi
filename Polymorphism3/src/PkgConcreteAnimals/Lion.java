/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgConcreteAnimals;

import PkgAnimals.Carnivore;

/**
 *
 * @author ayla
 */
public class Lion extends Carnivore{
    
    public Lion(int w) {
        super(w);
    }

    @Override
    public void catchAnimal() {
         System.out.println(this.getClass().getName()+ " is catching the animal in Lion's own way.");
    }

    @Override
    public void move() {
        System.out.println(this.getClass().getName()+ " is moving in Lion's own way."); 
    }
    
}
