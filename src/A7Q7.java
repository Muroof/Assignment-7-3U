/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ranam3235
 */
public class A7Q7 {

    /**
     * @param args the command line arguments
     */
    // input number as an integer
    public static void firstDigit(int number) {
        // if the number is negative, make it positive
        if (number < 0) {
            number = number * -1;
        }
        // while the number is greater than 10, keep dividing the number by 10 in order to isolate the first number
        while (number > 10) {
            number = number / 10;
        }

        // print the first number
        System.out.println("The first digit is:" + number);

    }

    // running the method
    public static void main(String[] args) {
        firstDigit(-45789);
    }
}
