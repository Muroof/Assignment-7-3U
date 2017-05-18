/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ranam3235
 */
public class A7Q5 {

    /**
     * @param args the command line arguments
     */
    // input lines as an integer
    public static void chaotic(int lines) {
        // for the amount of lines requested, a random number of asterisks between 1 - 5 will be printed
        for (int a = 0; a < lines; a++) {
            int randNum = (int) (Math.random() * (5 - 1 + 1)) + 1;

            for (int x = 0; x < randNum; x++) {
                System.out.print("*");
            }
            System.out.println();
        }





    }

    // calling the method
    public static void main(String[] args) {
        chaotic(5);
    }
}
