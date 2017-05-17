/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ranam3235
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void circleArea(double radius) {
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("The area is:" + area);
    }
    
    
    public static void main(String[] args) {
        circleArea(5);
    }
}
