/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package devgym;

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

public class IPK2 {

    // Complete the rotLeft function below.
//    static int[] rotLeft(int[] a, int d) {
//        int temp;
//        System.out.println("d:"+d);
//        for (int i=0;i<d;i++){
//       
//            temp=a[0];
//            System.out.println("Temp:"+temp+"for i:"+i);
//        
//            for (int j=0;j<a.length-1;j++){
//            a[j]=a[j+1];
//                   
//            }
//            a[a.length-1]=temp;
//        }
//        return a;
//
//
//    }
//    
    
        static int[] rotLeft(int[] a, int d) {
        int temp;
        int b[]=new int[a.length];
        System.out.println("d:"+d);
        for (int i=0;i<a.length;i++){
        temp=(i+d)%a.length;
        System.out.println("Temp:"+temp+"for i:"+i);
         b[i]=a[temp];
        }
        return b;


    }

//    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] nd = scanner.nextLine().split(" ");
//
//        int n = Integer.parseInt(nd[0]);
//
//        int d = Integer.parseInt(nd[1]);
//
//        int[] a = new int[n];
//
//        String[] aItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < n; i++) {
//            int aItem = Integer.parseInt(aItems[i]);
//            a[i] = aItem;
//        }
       
        int[] a = {1,2,3,4,5,6,7,8,9};
        int d=20;
       // int[] result = a;// rotLeft(a, d);
        int[] result =  rotLeft(a, d);

        for (int i = 0; i < result.length; i++) {
            System.out.print(String.valueOf(result[i]));

            if (i != result.length - 1) {
                System.out.print(" ");
            }
        }

        System.out.println("\n");

    }
}
