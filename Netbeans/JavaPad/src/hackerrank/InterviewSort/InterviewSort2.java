/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.InterviewSort;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author bhowmic.biddut
 */
public class InterviewSort2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();
/*
 5
amy 100
david 100
heraldo 75
heraldo 50
aleksa 150
*/
          System.out.printf("\n");
        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            
          
        
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
    
    
    

}


