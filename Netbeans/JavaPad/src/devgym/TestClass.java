/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * 
 * 
 */

/*33.QID - 2.1294 : Working with Methods*/

package devgym;

/**
 *
 * @author bhowmic.biddut
 */
public class TestClass{
    static class Wrapper{
        int w = 10;
    }
   
    static Wrapper changeWrapper(Wrapper w){
        w = new Wrapper();
        w.w += 9;
        return w;
    }
       
   
    public static void main(String[] args){
        Wrapper wb = new Wrapper();
        wb.w = 20;
        changeWrapper(wb);
        wb.w += 30;
        System.out.println(wb.w);
    wb = changeWrapper(wb);
        System.out.println(wb.w);
     }
}