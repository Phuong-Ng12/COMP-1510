/**
 * 
 */

package ca.bcit.comp1510.lab03;

import java.util.Scanner;

/** Fun with Strings.
 * @author Phuong
 * @version 1.0
 */

public class FunWithStrings {

    /**
     * Drives the program.
     * @version 1.0
     * @param args
     *          unused
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your favourite book: ");
        String yourFavBook;
        yourFavBook = scan.nextLine();
        
        //9: Yes, printing the value stored in the String variable works.
        System.out.println("You have entered your favourite book is \"" 
                            + yourFavBook + "\"");
        
        //10: It still works when using the Scanner's next() method. 
        //When running the program using nextLine() method, 
        //the program will not terminate until the user 
        //inputs value from the keyboard, while nextLine() will terminate
        //and the scanner cursor moves to the next line
        
        //12
        System.out.println("The length of the title: " + yourFavBook.length());
        
        //13
        String str = new String();
        boolean checkStartWithThe = str.startsWith("The");
        System.out.println("Does the title of the book start with "
                            + "the word \"The\"? " + checkStartWithThe);
        
        //14: The method toUpperCase() does not change a String permanently
        //because a String value is immutable which means does not change.
        System.out.println("Your favourite book Upper Case: " 
                            + yourFavBook.toUpperCase());
        
        //15, 16: When assigning the result to a new String variable, 
        //the user's input remains upper case because the new String variable
        //holds an address point to the result of the toUpperCase() method
        String copyofBook =  yourFavBook.toUpperCase();
        System.out.println("Copy of book Upper Case: " + copyofBook);
        
        //17
        System.out.println("Your favourite book Upper Case: " 
                            + yourFavBook.toUpperCase());
        
        System.out.println("Your favourite book Lower Case: " 
                            + yourFavBook.toLowerCase());
        
        //18
        String trimmedUserInput = yourFavBook.trim();
        int lengthtrimmed = trimmedUserInput.length();
        System.out.println("Length of trimmed input: " + lengthtrimmed);
        
        //19
        
        String first = trimmedUserInput.substring(0, 1).toUpperCase();
        String last = trimmedUserInput.substring((lengthtrimmed - 1),
                      lengthtrimmed).toUpperCase();
        String middle = trimmedUserInput.substring(1, 
                       lengthtrimmed - 1).toLowerCase();
        System.out.println("Fully trimmed User Input with first "
                + "and last letter capitalized: " + first + middle + last);
    
        scan.close();
        
        
    }

}
