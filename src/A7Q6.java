/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ranam3235
 */
public class A7Q6 {

    /**
     * @param args the command line arguments
     */
    // input number as an integer
    public static void lastDigit(int number) {
        // if the number is negative, make it postive
        if (number < 0) {
            number = number * -1;

        }

        number = number % 10;
        // printing the last digit
        System.out.println("The last digit is: " + number);



    }

    // calling the method
    public static void main(String[] args) {
        lastDigit(457894);


    }
}
