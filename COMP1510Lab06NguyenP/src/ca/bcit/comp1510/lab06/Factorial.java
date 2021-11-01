package ca.bcit.comp1510.lab06;

import java.util.Scanner;

/** Drive Factorial program.
 * @author Phuong Nguyen
 * @version 1.0
 */
public class Factorial {

    /** Drive Factorial programs.
     * @param args unused
     */
    public static void main(String[] args) {
        
        //Declare userInput variable as a String 
        //to scan for nextInt later.
        String userInput;
        
        //Declare an int variable for putting the integer that
        //the scanner can scan for from userInput.
        int findFactorial;
        
        //Declare a boolean variable as condition for the while loop
        //to break when an invalid input is entered by user.
        boolean isItInt = false;
        
        //Declare variable int i for counting in while loop.
        int i = 1;
        
        //Declare variable int factorial to calculate factorial.
        int factorial = 1;
        
        Scanner scan = new Scanner(System.in);
        
        //A while loop uses isItInt as condition to start a loop
        //to calculate factorial of userInput. The loop will keep 
        //continuing unless userInput is invalid, which means 
        //isItInt false.
        while (isItInt) {
            
            //Prompt user to enter an integer but scan it as a
            //String for scanning for an integer contains in it.
            System.out.println("Please enter an integer: ");
            userInput = scan.nextLine();
            
            //Instantiate factorialScan Scanner to scan for integer in
            //userInput.
            Scanner factorialScan = new Scanner(userInput);
            
            //A loop that returns "Invalid Input" when factorialScan Scanner 
            //cannot scan an integer in userInput. Otherwise, the loop will 
            //return a factorial of userInput. 
            while (factorialScan.hasNextInt()) {
                findFactorial = factorialScan.nextInt();
                if (findFactorial == 0) {
                    isItInt = true;
                    factorial = 1;
                    System.out.println("Factorial of 0 is always 1.");
                } else if (findFactorial > 0) {
                    isItInt = true;
                    while (i <= findFactorial) {
                        factorial = factorial * i;
                        i++;
                    }
                    System.out.println("The factorial of " + findFactorial 
                            + " is: " + factorial);
                } else {
                    System.out.println("Invalid Input.");
                }   
            }
            
            //Close factorialScan Scanner.
            factorialScan.close();
        
        }
        
        //Close the scan Scanner.
        scan.close();
        
    }

}
