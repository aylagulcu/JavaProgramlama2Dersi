/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgConcreteAnimals;

import PkgAnimals.Herbivore;

/**
 *
 * @author ayla
 */
public class Cow extends Herbivore{
    
    public Cow(int w) {
        super(w);
    }

    @Override
    public void getPlant() {
         System.out.println(this.getClass().getName()+ " is getting the plant in Cow's own way.");
    }

    @Override
    public void move() {
        System.out.println(this.getClass().getName()+ " is moving in Cow's own way.");    
    }
    
}
