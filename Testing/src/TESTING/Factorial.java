package TESTING;
import java.util.Scanner;
public class Factorial {

    public static void main(String[] args) {
        String userInput;
        int findFactorial;
        boolean isItInt = false; 
        Scanner readInput = new Scanner(System.in);
        
        while(isItInt == false) {
            System.out.println("Please enter a positive integer: ");
            userInput = readInput.nextLine();
            
            
            Scanner factorialScan = new Scanner(userInput);
            while(factorialScan.hasNextInt()) {
                findFactorial = factorialScan.nextInt();
                if (findFactorial > 0) {
                    isItInt = true;

                    int index = 0;
                    int factorial = 1;
                    while (index < findFactorial) {
                        factorial = factorial * (findFactorial - index);
                        index++;
                    }
                    System.out.println("The factorial of " + findFactorial + " is " + factorial);
                }
                else if (findFactorial == 0) {
                    System.out.println("Factorial of 0 is always 1.");
                    isItInt = true;
                }
                
                else {
                    System.out.println("Invalid Input");
                }
            }
            
            factorialScan.close();
        }
    }

}
