/**
 * 
 */

package ca.bcit.comp1510.lab03;

import java.util.Scanner;

import java.text.DecimalFormat;

/** Calculate the Distance.
 * @author Phuong
 * @version 1.0
 */

public class Distance {

    /** 
     * Calculate the Distance.
     * @param args
     *          unused
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter x and y value of the 1st point: ");
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        System.out.println("Enter x and y value of the 2nd point: ");
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) 
                            + Math.pow((y2 - y1), 2));
        
        DecimalFormat decFor = new DecimalFormat("#.##");
        System.out.println("The Distance between two points: " 
                            + decFor.format(distance));
        
        scan.close();

    }

}
