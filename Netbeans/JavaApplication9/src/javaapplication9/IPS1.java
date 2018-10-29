/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author bhowmic.biddut
 */
public class IPS1 {
    

    // Complete the hourglassSum function below.
   static int maximumToys(int[] prices, int k) {
       
        int sum=0,count=0;
         Arrays.sort(prices);
         for (int i=0;i<prices.length;i++){
                sum=sum+prices[i];
                if(sum<=k){
                 count++;
                 System.out.println( sum+","+count);
                 
                 }
         }

        return count;
    }


    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));


        int prices[]={1,10,50,3,7,5,1,2,5,8,3};
        int k=40;

       // int result = hourglassSum(arr);

        int result = maximumToys(prices, k);

        System.out.println("\n"+result);


    }
}