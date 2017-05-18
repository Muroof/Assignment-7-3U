/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ranam3235
 */
public class A7Q4 {

    /**
     * @param args the command line arguments
     */
    // gather the principle, and interest as a double, and amount of years as an integer 
    public static void compoundInterest(double principle, double interest, int years) {
        // calculating the balance using this formula: B=P(1+r)^n
        double balance = principle * Math.pow(1 + interest, years);
        // printing the balance
        System.out.println("Balance =" + balance);
    }

    // calling the method
    public static void main(String[] args) {

        compoundInterest(90, 0.10, 12);
    }
}
