/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ranam3235
 */
public class A7Q9 {

    /**
     * @param args the command line arguments
     */
    // int number as an integer
    public static void allDigitsOdd(int number) {
        // int in order to distinguish between false and true outcomes 
        int check = 0;
        // while the number is greater than two digits
        while (number > 10) {
            // using the operator to determine wether the number is divisible by 2
            int even = number % 2;
            // if the operator returns 0, print false as the number is even
            if (even == 0) {
                System.out.println("False");
                // assign value 1 to check
                check = 1;
                break;
            }
            // divide inputed number by 10
            number = number / 10;


        }
        // if number is a single digit even number, print false
        if (number == 2 || number == 4 || number == 6 || number == 8) {
            System.out.println("False");
            // otherwise print true
        } else if (check == 0) {
            System.out.println("True");
        }





    }

    // calling the method
    public static void main(String[] args) {
        allDigitsOdd(395759);
    }
}
