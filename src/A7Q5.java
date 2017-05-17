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
    public static void chaotic(int lines) {

        for (int a = 0; a < lines; a++) {
            int randNum = (int) (Math.random() * (5 - 1 + 1)) + 1;
            
            for (int x = 0; x < randNum; x++) {
                System.out.print("*");
            }   
            System.out.println();
        }
        




    }

    public static void main(String[] args) {
        chaotic(5);
    }
}
