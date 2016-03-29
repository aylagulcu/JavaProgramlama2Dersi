/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wrapperclasses;

public class WrapperClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String s1= new String("Aycan");
        String s2= "Aycan";
        
        Integer objectI= 55;
        Integer j= new Integer(55);
        
        int t= 55;
        Integer z= new Integer("145"); 
        System.out.println(z);
        // Integer z2= new Integer("1o45");
        // NumberFormatException - if the String does not contain a parsable integer.
        // System.out.println(z2);
        
        System.out.println("Integer max value: "+ Integer.MAX_VALUE);
        System.out.println("Integer min value: "+ Integer.MIN_VALUE);
        
        Integer a= Integer.valueOf("11");
        System.out.println(a);
        
        a= Integer.valueOf("11", 2); // radix or base
        System.out.println(a);
       
        Double d1= Double.valueOf("2.5");
        System.out.println(d1);
        
       int primitiveI= objectI.intValue();
       byte i1= objectI.byteValue();
       float i2= objectI.floatValue();
       
       int value1= Integer.valueOf("12345"); 
       // automatic type conversion occurs!
       
       int value2= Integer.parseInt("4789");
       
      
        
        
    }
    
}
