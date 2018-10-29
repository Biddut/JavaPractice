/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBasicInnerClass;


/**
 *
 * @author Oracle
 */

   
public class My_Class {

 private abstract static class Inner_Demo2 {
   
      public  void print(){} ;
   }
 
   public static void main(String args[]) {
      // Instantiating the outer class 
      Outer_Demo outer = new Outer_Demo();
      
      Inner_Demo2 inner=new Inner_Demo2() {
      public void print() {
              System.out.println("This is test of both baic inner class and annonymous inner class2");
               }    
        };
        
      // Accessing the display_Inner() method.
      inner.print();
      
   }
}

class Outer_Demo {
   int num;
   
   // inner class
   public abstract class Inner_Demo {
   
      public  void print(){} ;
   }
   
   // Accessing he inner class from the method within
   void display_Inner() {
      Inner_Demo inner = new Inner_Demo(){

         // @Override
          public void print() {
              System.out.println("This is test of both baic inner class and annonymous inner class");
             // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          }
      };
      inner.print();
   }
}


