
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ranam3235
 */
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    // input number wished to be factored as an integer
    public static void factors(int integer) {

        System.out.println("The factors are:");

        for (int a = 1; a <= integer; a++) {

            if (integer % a == 0) {

                System.out.println(a);
            }
        }


    }

    // calling the method
    public static void main(String[] args) {
        factors(43);
    }
}
