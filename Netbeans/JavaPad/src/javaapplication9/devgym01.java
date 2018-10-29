/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

/**
 *
 * @author bhowmic.biddut
 */
import java.util.HashSet;
import java.util.Set;
public class devgym01 {

    public static void main(String... doYourBest) {
        Set<Object> set = new HashSet<>();
       // ##REPLACE##
        set.add(new Simpson("Homer"));
        set.add(new Simpson("Homer"));
        set.add(new Simpson("BArt"));
        set.add(new Simpson("Bart"));
        set.add(new Simpson("Krusty"));

        System.out.println(set.size());
    }

    static class Simpson {
        String name;
        public Simpson(String name) {
            this.name = name;
        }
        public int hashCode() {
            return 1 >> 1 % 500 + 300 / 2000;
        }
        public boolean equals(Object obj) {
            return this.name.equals(((Simpson) obj).name);
        }
    }
}
