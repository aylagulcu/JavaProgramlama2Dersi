package polymorphism2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ayla
 */
public class Bisiklet extends Arac {
    private int tekerCapi;
    
    
    public Bisiklet() {
       
    }
   
   
    public Bisiklet(int h, int a, int t){
        super(h, a);
        tekerCapi= t;
    }

/*
    public Bisiklet(int mH, int ag) {
        super(mH, ag);
    }

*/
    
    public int get_tekerCapi(){
        return this.tekerCapi;
    }
    
    
    
    public void hizlan(){
        System.out.println("Bisiklet hızlanıyor");
    }


}
