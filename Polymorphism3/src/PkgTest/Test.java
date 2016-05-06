/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgTest;

import PkgAnimals.Animal;
import PkgAnimals.Carnivore;
import PkgAnimals.Swimmable;
import java.util.ArrayList;
import PkgConcreteAnimals.Bear;
import PkgConcreteAnimals.Cow;
import PkgConcreteAnimals.Elephant;
import PkgConcreteAnimals.Shark;

/**
 *
 * @author ayla
 */
public class Test {


    public static ArrayList<Animal> animalList;
            
    public static void main(String[] args) {
        animalList= new ArrayList<Animal>();
        
        Cow cow1= new Cow(100);
        animalList.add(cow1);
        
        Bear bear1= new Bear(150);
        animalList.add(bear1);
        
        Elephant elephant1= new Elephant(200);
        animalList.add(elephant1);
        
        Shark shark1= new Shark(120);
        animalList.add(shark1);
        
        Shark shark2= new Shark(110);
        animalList.add(shark1);
        
        System.out.println("********************************");
        System.out.println("Eat method of all Carnivores");  
        System.out.println("Each animal is allowed to implement its own eat method. ");  
        for (Animal an: animalList)
            an.eat();
        
        System.out.println("********************************");
        System.out.println("EatMeat method of all Carnivores");
        for (Animal an: animalList)
            if (an instanceof Carnivore){
                ((Carnivore) an).catchAnimal();
                ((Carnivore) an).eatMeat();
            }
        
        System.out.println("********************************");
        System.out.println("Swim method of all Swimmable Animals");
        for (Animal an: animalList)
            if (an instanceof Swimmable)
                ((Swimmable) an).swim();
    }
    
}
