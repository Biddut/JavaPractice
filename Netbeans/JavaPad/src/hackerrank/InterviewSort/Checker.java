/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.InterviewSort;

import java.util.Comparator;

/**
 *
 * @author bhowmic.biddut
 */
class Checker implements Comparator<Player> {
  	// complete this method
	public int compare(Player a, Player b) {
        
         if(a.score==(b.score)) 
          return a.name.compareTo(b.name);     
         else 
           return b.score-a.score;   
    }
}
