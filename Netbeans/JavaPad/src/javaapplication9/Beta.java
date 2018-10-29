/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

/**
 *
 * @author bhowmic.biddut
 */
public class Beta extends Baap  {
    public int h=44;
    public int getH(){
        System.out.println("Beta   "+h);
        return h;
        
    }
    public static void main(String args[]) {
       
       Baap b= new Beta();  
       System.out.println(b.h+"   ");
       System.out.println(b.h+"   "+b.getH());
       
//         Beta bb= (Beta)b;  
//       System.out.println(bb.h+"   "+bb.getH());
//       
    }
}


