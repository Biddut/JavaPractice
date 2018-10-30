/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kathych6;
import java.io.*; 
/**
 *
 * @author Oracle
 */
public class CheckedException {

    public static void main(String[] args) throws IOException { 
        FileReader file = new FileReader("C:\\test\\a.txt"); 
        BufferedReader fileInput = new BufferedReader(file); 
          
        // Print first 3 lines of file "C:\test\a.txt" 
        for (int counter = 0; counter < 3; counter++)  
            System.out.println(fileInput.readLine()); 
          
        fileInput.close(); 
    } 
}     

