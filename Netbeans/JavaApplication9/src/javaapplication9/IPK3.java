/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

/**
 *
 * @author bhowmic.biddut
 */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class IPK3 {

    // Complete the minimumSwaps function below.
//    static int minimumSwaps(int[] arr) {
//       int temp;
//       int swapcounter=0;
//              int[] arr = {2,4,3,1,6,5,9,7,8}; 
//       for(int i=0;i<arr.length;i++){
//           
//           System.out.print("i+1= "+(i+1));
//           System.out.println(" ,arr[i]= "+arr[i]);
//           if((i+1)!=arr[i]){
//           
//               for(int j=i+1;j<arr.length;j++){
//               
//                System.out.print("j= "+(j));
//                System.out.println(" ,arr[j]= "+arr[j]);
//                      if((i+1)==arr[j]){
//                          System.out.println("swap start: i= "+i+", j= "+j+" ,arr[i]=" +arr[i]+" ,arr[j]=" +arr[j]);
//                          temp=arr[i];
//                          arr[i]=arr[j];
//                          arr[j]=temp;
//                          swapcounter++;
//                          break; 
//                      }
//                     
//               }
//              System.out.println("After swap: "+Arrays.toString(arr));  
//              
//           }
//       }
//       System.out.println(Arrays.toString(arr)); 
//        
//        return swapcounter;
//
//
//    }
    
//    
//   static int minimumSwaps(int[] arr) {
//        int swaps = 0; 
//        int tmp;
//       //   int[] arr = {3,4,2,1};
//        //{3,4,2,1};
//        for(int i = 0; i< arr.length-1; i++) {
//            while(arr[i]!=i+1) {
//                System.out.println("i= "+i+" ,arr[i]: "+arr[i]+", arr[i]-1 :"+(arr[i]-1)+", arr[arr[i]-1]: "+arr[arr[i]-1]);
//                tmp = arr[arr[i]-1];
//                
//                arr[arr[i]-1] = arr[i];
//                arr[i] = tmp;
//                swaps++;
//                System.out.println(Arrays.toString(arr)); 
//            }
//        }
//         System.out.println(Arrays.toString(arr)); 
//        return swaps;
//    }

    static void countSwaps(int[] a) {
        int count=0;
        int tmp;    
        for (int i = 0; i < a.length; i++) {
    
        for (int j = 0; j < a.length - 1; j++) {
        // Swap adjacent elements if they are in decreasing order
        if (a[j] > a[j + 1]) {
            
            tmp = a[j];
            a[j]=a[j + 1];      
            a[j + 1] = tmp;
            count++;
           
         }
    }
    
}
//System.out.println("count: "+count); 
    }
    
  //  private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        int[] arr = new int[n];
//
//        String[] arrItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < n; i++) {
//            int arrItem = Integer.parseInt(arrItems[i]);
//            arr[i] = arrItem;
//        }
        int[] arr = {3,4,2,1};
      //  int res = minimumSwaps(arr);

//        bufferedWriter.write(String.valueOf(res));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
        countSwaps(arr);
        
       
    }
}