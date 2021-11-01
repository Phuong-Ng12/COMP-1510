/**
 * 
 */

package ca.bcit.comp1510.lab02;

import java.util.Scanner;
/** Circle.
 * @author Phuong
 * @version 1.0
 *
 */

public class Circle {

    /**
     * Drives the program.
     * @param args
     *          unused
     */
    public static void main(String[] args) {
        final double PI = 3.14159;
        double radius;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter radius:");
        radius = myScanner.nextDouble();
        double Circumference = 2 * PI * radius;
        System.out.println("The circumference is: " + Circumference);
        double Area = PI * radius * radius;
        System.out.println("The area is: " + Area);
        
        double doubleRadius = radius * 2;
        System.out.println("The double radius is: " + doubleRadius);
        double doubleCir = 2 * PI * doubleRadius;
        System.out.println("The double circumference is: " + doubleCir);
        double doubleArea = PI * doubleRadius * doubleRadius;
        System.out.println("The double area is: " + doubleArea);
        
        double increaseCir = doubleCir / Circumference;
        double increaseArea = doubleArea / Area;
        System.out.println("The circumference increases " + increaseCir 
                            + " times when the radius doubles.");
        System.out.println("The area increases " + increaseArea 
                            + " times when the radius is double");
        

    }

}
