
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ranam3235
 */
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    // input mark as a double
    public static void examGrade(double mark) {
        // if the mark is greater than or equal to an 80, the mark is an A and therefore should be printed to the user
        if (mark >= 80) {
            System.out.println("Grade: A");
        }
        // if the mark is between 70 and 79 the mark is a B and therefore should be printed to the user
        if (mark >= 70 && mark < 80) {
            System.out.println("Grade: B");

        }
        // if the mark is between 60 and 69, the mark is a C and therefore should be printed to the user
        if (mark >= 60 && mark < 70) {
            System.out.println("Grade: C");
        }
        // if the mark is between 50 and 59, the mark is a D and therefore should be printed to the user
        if (mark >= 50 && mark < 60) {
            System.out.println("Grade: D");
        }
        // if the mark is less than a 50, the mark is a F and therefore should be printed to the user
        if (mark < 50) {
            System.out.println("Grade: F");

        }



    }

    // calling the method
    public static void main(String[] args) {
        examGrade(45);
    }
}
