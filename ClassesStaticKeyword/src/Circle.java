

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ayla
 */
public class Circle {
    
    private double radius= 0;
    
    private static int count= 0;
    
    Circle(){
        Circle.count++;
    }
    
 
    public double getArea(){
        return this.radius* this.radius * 3.14;
    }
    
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius= radius;   
    }
    
    public void define(){
        System.out.println("Radius is: "+  this.radius);
    }
    
    
    public static int getCount(){
        return count;
    }
    
    
}
