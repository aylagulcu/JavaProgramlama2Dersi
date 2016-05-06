/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgConcreteAnimals;

import PkgAnimals.Omnivore;

public class Lizard extends Omnivore {
    
    public Lizard(int w) {
        super(w);
    }

    @Override
    public void move() {
        System.out.println(this.getClass().getName()+ " is moving in Lizard's own way."); 
    }
    
}
