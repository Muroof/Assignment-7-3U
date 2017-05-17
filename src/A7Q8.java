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
    public static void season(int month, int day) {



        if (month == 3 && day <= 15 || month == 12 && day >= 16 || month >=1 && month <= 2) {
            System.out.println("The Season is Winter");
        } else if (month == 6 && day <= 15 || month == 3 && day >= 16 || month >= 4 && month <=5) {
            System.out.println("The Season is Spring");
        } else if (month == 9 && day <= 15 || month == 6 && day >= 16 || month >= 7 && month <= 8) {
            System.out.println("The Season is Summer");
        } else if (month <= 12 && day <= 15 || month == 9 && day >= 16 || month >= 10 && month <= 11) {
            System.out.println("The Season is Fall");
        }


    }

    public static void main(String[] args) {
        season(12, 16);

    }
}