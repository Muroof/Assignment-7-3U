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
    // input radius as a double
    public static void circleArea(double radius) {
        // calculating the area of the circle using A = πr^2
        double area = Math.PI * Math.pow(radius, 2);
        // printing the area
        System.out.println("The area is:" + area);
    }

    // calling the method
    public static void main(String[] args) {
        circleArea(5);
    }
}
