/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ranam3235
 */
public class A7Q8 {

    /**
     * @param args the command line arguments
     */
    // input month and day as integers
    public static void season(int month, int day) {


        // if the inputed date falls between Dec 16 - Mar 15, output the season as Winter
        if (month == 3 && day <= 15 || month == 12 && day >= 16 || month >= 1 && month <= 2) {
            System.out.println("The Season is Winter");
            // if the inputed date falls between Mar 16 - Jun 15, output the season as Spring
        } else if (month == 6 && day <= 15 || month == 3 && day >= 16 || month >= 4 && month <= 5) {
            System.out.println("The Season is Spring");
            // if the inputed date falls between Jun 16 - Sep 15, output the season as Summer
        } else if (month == 9 && day <= 15 || month == 6 && day >= 16 || month >= 7 && month <= 8) {
            System.out.println("The Season is Summer");
            // if the inputed date falls between Seo 16 - Dec 15, output the season as Fall
        } else if (month <= 12 && day <= 15 || month == 9 && day >= 16 || month >= 10 && month <= 11) {
            System.out.println("The Season is Fall");
        }


    }

    // calling the method
    public static void main(String[] args) {
        season(12, 16);

    }
}