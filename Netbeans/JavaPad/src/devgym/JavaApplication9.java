/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package devgym;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


/**
 *
 * @author bhowmic.biddut
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */

   private static final Scanner scanner = new Scanner(System.in);

   public static void main(String[] args) {
     //   int[][] arr = new int[6][6];
       int sum=0,temp=0;

//        for (int i = 0; i < 3; i++) {
//            String[] arrRowItems = scanner.nextLine().split(" ");
//         //   scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//            for (int j = 0; j < 3; j++) {
//                int arrItem = Integer.parseInt(arrRowItems[j]);
//                arr[i][j] = arrItem;
//            }
//        }

//        
// int[][] arr = {{1,1,1,0,0,0}, 
//                {0,1,0,0,0,0}, 
//                {1,1,1,0,0,0}, 
//                {0,0,2,4,4,0}, 
//                {0,0,0,2,0,0}, 
//                {0,0,1,2,4,0}};

int[][] arr={{-1, -1, 0, -9, -2 , -2},
{-2, -1, -6, -8, -2, -5},
{-1, -1, -1, -2, -3, -4},
{-1, -9, -2, -4, -4, -5},
{-7, -3, -3, -2, -9, -9},
{-1, -3, -1, -2, -4, -5}};
//
//     //   scanner.close();
        for (int i = 0; i < arr.length-2; i++){
            for (int j = 0; j < arr.length-2; j++){
             //   System.out.print(arr[i][j]+" ");
             sum= arr[i][j]+arr[i][j+1]+arr[i][j+2];
          //   System.out.println("\n"+sum);
             sum+=arr[i+1][j+1];
            // System.out.println("\n"+sum);
             sum+=arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
             System.out.println("\n"+sum);
              if (sum>temp){
         temp=sum;
             }   
        } 
            
      }
    System.out.println("\n"+temp);
  //   System.out.println("\n"+sum); 
     
     
    // System.out.println("\n"+temp);     
          
    }
}
