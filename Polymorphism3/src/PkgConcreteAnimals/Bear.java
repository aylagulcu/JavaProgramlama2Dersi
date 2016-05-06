/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgConcreteAnimals;

import PkgAnimals.Omnivore;
import PkgAnimals.Swimmable;

public class Bear extends Omnivore implements Swimmable{
    
    public Bear(int w) {
        super(w);
    }

    @Override
    public void swim() {
       System.out.println(this.getClass().getName()+ " is swimming");
    }

    @Override
    public void move() {
        System.out.println(this.getClass().getName()+ " is moving");
    }
    
}
