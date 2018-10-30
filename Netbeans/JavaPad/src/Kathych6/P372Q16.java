/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kathych6;

/**
 *
 * @author Oracle
 */

public class P372Q16  extends Tire{
  public static void main(String[] args){
//  try{
      new P372Q16().do_stuff();
//  }
//  catch (Exception e){
//    System.out.println(e.getMessage());
//    }
  }
  
  void do_stuff() throws  ArithmeticException{
     System.out.println(7/0);
   }
  
    
}

class Myexeption extends Exception{}

class Tire{
    void do_stuff() {
    System.out.println("In the Tire");
   // System.out.println(7/0);
    };
}


