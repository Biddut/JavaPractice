/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kathych6;

import java.io.IOException;


/**
 *
 * @author Oracle
 */

public class P371Q15  {
  int x=0; 
  public static void main(String[] args) throws MyException  {
        
     new P371Q15().test();   
//      try{
//        
//       }
//       catch(Exception e){
//          System.out.println("This is an exception occured "+e.toString());
//       }
//       finally{
//          System.out.println("This is an finally executed");
//       }
    
  }
      void test() throws  MyException{
         if(x==0) {
            
             throw new MyException() ;   
            
           
         }
          System.out.println(7/x);
         
         
        }
      
      public class MyException extends Exception{
       MyException(){
       super();
       };

        private MyException(String x__0_is_not_allowd_here) {
            throw new UnsupportedOperationException("Not supported yet."); 
            //To change body of generated methods, choose Tools | Templates.
        }
      }
}  

//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at Kathych6.P371Q15.test(P371Q15.java:32)
//	at Kathych6.P371Q15.main(P371Q15.java:19)
 

