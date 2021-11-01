package ca.bcit.comp1510.lab07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Version 1Buggy.
 *
 * This programs asks the user to enter a number "n" (bigger than 2).
 * It then prints out the first "n" numbers of the Fibonacci Sequence.
 * Each number is the sum of the two previous numbers.
 *
 * Example: The output for n=11 should look exactly like this: 
 *  
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...
 *
 * Fix all compile-time and run-time errors.
 *
 * @author Carly Orr
 * @version 1
 */



public class FibonacciBuggy {
    
    /**
     * Drive the FibonacciBuggy program.
     * @param args unused
     * @throws ArrayIndexOutOfBoundsException
     *      Exception.
     */
    public static void main(String[] args) 
        throws ArrayIndexOutOfBoundsException {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter a number: ");
        int n = scanner.nextInt(); 
        if (n < 2) {
            System.out.println("Enter a number bigger than 2: ");
            n = scanner.nextInt();
        } else {
            while (n > 2) {
                printList(getFiboList(n));
            }          
        }
    }

    private static List<Integer> getFiboList(int n) {
        List<Integer> f = new ArrayList<Integer>(n);
        f.add(0);
        f.add(1);
        int i = 2;
        while (i < n) {
            f.add(f.get(i - 1) + f.get(i - 1));
            i++;
        }
        return f;
    }

    private static void printList(List<Integer> fiboList) {
        int i = 2;
        try {
            while (i <= fiboList.size()) {
                System.out.print(fiboList.get(i));
                i++;
            } 
        } catch (Exception e) {
            System.out.println("...");
        }
    }
}