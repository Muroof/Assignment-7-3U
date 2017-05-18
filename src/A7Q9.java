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
    public static void allDigitsOdd(int number) {
        
        int check = 0;

        while (number > 10) {

            int even = number % 2;

            if (even == 0) {
                System.out.println("False");
                check = 1;
                break;
            }
            number = number / 10;


        }
        if (check == 0) {
            System.out.println("True");
        }
        




    }
    
    public static void main(String[] args) {
        allDigitsOdd(395);
    }
}
