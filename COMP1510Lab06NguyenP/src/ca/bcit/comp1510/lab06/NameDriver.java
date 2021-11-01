package ca.bcit.comp1510.lab06;

import java.util.Scanner;

/**
 * Drive the Name program to test new modifications.
 * @author Phuong
 * @version 1.0
 */
public class NameDriver {
    
    /**
     * Drive the Name program.
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //Declare variables of names.
        String firstname;
        String middlename;
        String lastname;
        
        //Declare a constant for testing passing an integer
        //that exceeds the length of name.
        final int indexOfName = 100;
        
        //Declare a char variable to test passing an integer that exceeds the
        //length of the name, the character @ is returned instead. 
        char nthChar;
        
        //Names in lower case to upper case:
        firstname = "phuong";
        middlename = "mai";
        lastname = "nguyen";
        
        //Create new name object.
        Name nameNormal = new Name(firstname, middlename, lastname);
        
        String nameUpperCase = nameNormal.toString();
        
        System.out.println("Name with first letters "
                + "in Upper Case: " + nameUpperCase);
        
        //Names with empty or white space:
        String firstEmpty = "";
        String middleNormal = "mai";
        String lastWhiteSpace = "\s";
        
        Name nameWithEmpty = new Name(firstEmpty, middleNormal, lastWhiteSpace);
        
        String nameWithEmptyandWhitespace = nameWithEmpty.toString();
        
        System.out.println("Name with Empty first name and "
                + "Whitespace lastname: " + nameWithEmptyandWhitespace);
        
        //Passes an integer that exceeds the
        //length of the name, the character @ is returned instead.
        nthChar = nameNormal.nthChar(indexOfName);
        System.out.println("Character at n: " + nthChar);
        
        scan.close();
        
    }

}
