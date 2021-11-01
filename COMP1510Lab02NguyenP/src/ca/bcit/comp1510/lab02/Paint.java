/**
 * 
 */


package ca.bcit.comp1510.lab02;

import java.util.Scanner;

/**
 * Paint a Room.
 * @author Phuong
 * @version 1.0
 *
 */


public class Paint {

    /**
     * Paint a Room.
     * @param args
     *          unused
     */
    public static void main(String[] args) {
        final int COVERAGE = 400;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter length of room (ft): ");
        double length = myScanner.nextDouble();
        System.out.println("Enter width of room (ft): ");
        double width = myScanner.nextDouble();
        System.out.println("Enter height of room (ft): ");
        double height = myScanner.nextDouble();
        System.out.println("Enter number of coats: ");
        double coats = myScanner.nextDouble();
        double surfaceArea = length * width * height;
        double coverageNeeded = surfaceArea * coats; 
        double cansOfPaintNeeded = coverageNeeded / COVERAGE;
        System.out.println("Number of cans needed: " + cansOfPaintNeeded);
        
    }

}
