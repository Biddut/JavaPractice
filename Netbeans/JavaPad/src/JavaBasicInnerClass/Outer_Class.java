/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBasicInnerClass;

/**
 *
 * @author Oracle
 */


public class Outer_Class {
   // instance method of the outer class 
   int num =30;
   void my_Method() {
      int num = 25;

      // method-local inner class
     
      // Accessing the inner class
      MethodInner_Demo inner = new MethodInner_Demo();
      inner.print();
   }
   
    class MethodInner_Demo {
         public void print() {
            System.out.println("This is method inner class "+num);	   
         }   
      } // end of inner class
	   
   
   public static void main(String args[]) {
      Outer_Class outer = new Outer_Class();
      outer.my_Method();	   	   
   }
}