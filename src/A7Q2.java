
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
    public static void examGrade(double mark) {

        if (mark >= 80) {
            System.out.println("Grade: A");
        }

        if (mark >= 70 && mark < 80) {
            System.out.println("Grade: B");

        }

        if (mark >= 60 && mark < 70) {
            System.out.println("Grade: C");
        }

        if (mark >= 50 && mark < 60) {
            System.out.println("Grade: D");
        }

        if (mark < 50) {
            System.out.println("Grade: F");

        }



    }

    public static void main(String[] args) {
        examGrade(45);
    }
}
