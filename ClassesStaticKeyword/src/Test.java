/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ayla
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Circle.count= 5;
        
        
        Circle c1= new Circle();

        c1.setRadius(10);
        System.out.println("Area is:\t"+ c1.getArea());
        System.out.println("Number of total circles created:\t"+ Circle.getCount() ); // 1
       
        
        Circle c2= new Circle();
        c2.setRadius(5);
        System.out.println("Area is:\t"+ c2.getArea());
        System.out.println("Number of total circles created:\t"+ Circle.getCount()); // 2
        
        
        Circle[] circleArr= new Circle[3];
        System.out.println(circleArr);
        
        circleArr[0]= new Circle();
        circleArr[0].setRadius(5.0);
        
        
        circleArr[1]= new Circle();
        circleArr[1].setRadius(10.0);
        
        circleArr[2]= new Circle();
        circleArr[2].setRadius(15.0);
        
        for (int i=0; i< circleArr.length; i++){
            circleArr[i].define();
        }
        
        String s1= new String("Circles");
        String s2= "Circles";
        // String s3= "Circles";
 
        System.out.println(s1);
        for (int i=0; i< s1.length(); i++)
            System.out.println(s1.charAt(i));
        
        
        for (int i= s1.length()-1; i>=0; i--)
            System.out.print(s1.charAt(i));
        
        System.out.println();
        
        
        if (s1.equals(s2))
            System.out.println("Strings are equal");
        else
            System.out.println("Strings are not equal");
        

        String[] isinler= {"Esra", "Seyma", "Aycan", "Ali", "Furkan", "Tugba"};
        
        int[] dizi= {100, 15, 66, 55, 78, 1 };
        for (int i: dizi)
            System.out.print(i+ " ");
        System.out.println();
        int temp;
        for (int i=0; i< dizi.length-1; i++){
            for (int j= i+1; j< dizi.length; j++){
                if (dizi[j]<dizi[i]){
                    temp= dizi[i];
                    dizi[i]= dizi[j];
                    dizi[j]= temp;                
                } // end if
            } // end j for
        } // end i for
             
        for (int i: dizi)
            System.out.print(i+ " ");
        System.out.println();
        

    }
    
}
