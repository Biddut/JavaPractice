/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kathych6;

/**
 *
 * @author Oracle
 */
public class CatchThrow {

private static void throwsMethod()  {
    String  intNumber = "5A";

    Integer.parseInt(intNumber);
}

private static void catchMethod() {
    try {

        throwsMethod();

    } catch (NumberFormatException e) {
        System.out.println("Convertion Error");
    }

}

public static void main(String[] args) {
    // TODO Auto-generated method stub

    catchMethod();
}

}