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
    public static void compoundInterest(double principle, double interest, int years) {

        double balance = principle * Math.pow(1 + interest, years);

        System.out.println("Balance =" + balance);
    }

    public static void main(String[] args) {

        compoundInterest(90, 0.10, 12);
    }
}
