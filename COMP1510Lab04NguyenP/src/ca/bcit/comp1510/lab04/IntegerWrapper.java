package ca.bcit.comp1510.lab04;

import java.util.Scanner;

/** Using Integer Wrapper.
 * 
 * @author Phuong Nguyen
 * @version 1.0
 */
public class IntegerWrapper {
    
    /** Drives the progam.
     * @param args
     *          unused
     */
    public static void main(String[] args) {
        
        //Prompt the user to input an integer:
        System.out.println("Please enter a number: ");
        Scanner scan = new Scanner(System.in);
        int numInput = scan.nextInt();
        
        //Print the binary representations of the user's input integer: 
        String toBin = Integer.toBinaryString(numInput);
        System.out.println("Binary of " + numInput + " is " + toBin);
        
        //Print the octal representations of the user's input integer:
        String toOct = Integer.toOctalString(numInput);
        System.out.println("Octal of " + numInput + " is " + toOct);
        
        //Print the hexadecimal representations of the user's input integer:
        String toHex = Integer.toHexString(numInput);
        System.out.println("Hexadecimal of " + numInput + " is " + toHex);
        
        //Print the minimum possible Java integer values:
        System.out.println("Minimum of Java integer values: " 
                            + Integer.MIN_VALUE);
        
        //Print the maximum possible Java integer values:
        System.out.println("Maximum of Java integer values: " 
                            + Integer.MAX_VALUE);
        
        
        //Prompt the user to enter two integers: 
        System.out.println("Please enter two integer numbers: ");
        String num1 = scan.next();
        String num2 = scan.next();
        
        //Convert the String num1 and String num2 to integers
        //add them together and print: 
        System.out.println("Sum of num1 and num2 is: " 
                + (Integer.parseInt(num1) + Integer.parseInt(num2)));
        
        //Close the Scanner:
        scan.close();
    }

}
