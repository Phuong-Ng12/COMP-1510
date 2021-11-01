package ca.bcit.comp1510.lab05;

import java.util.Scanner;

/**
 * Drive the Name program.
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
        String threeInitials;
        int lengthOfName;
        char nthChar;
        
        System.out.println("Please enter your firstname: "); 
        firstname = scan.nextLine();
        System.out.println("Please enter your middlename: "); 
        middlename = scan.nextLine();
        System.out.println("Please enter your lastname: "); 
        lastname = scan.nextLine();
        
        //Create new name object.
        Name name = new Name(firstname, middlename, lastname);
        
        //Call lengthOfName() method on name object to get
        //length of the name.
        lengthOfName = name.lengthOfName();
        System.out.println("Length of Name: " + lengthOfName);
        
        //Call threeInitials() method on name object to get
        //three initials of first, middle and last names.
        threeInitials = name.threeInitials();
        System.out.println("Three initials of first, middle and last names: " 
                + threeInitials);
        
        //Prompt user to input n integer for the position of character
        //wants to extract from fullname String.
        System.out.println("Please enter the number of the position "
                + "of the character you want to extract "
                + "from fullname String: ");
        int n = scan.nextInt();
        
        //Call nthChar() method on name object to get the nth
        //character of the name.
        nthChar = name.nthChar(n);
        System.out.println("Character at n: " + nthChar);
        
        //Call lastNameCommaFirstName() method on name object to get
        //last name followed by comma followed by first name followed by 
        //middle name. Then print out the result.
        System.out.println("Your name as last name then comma then first and "
                + "middle names: " + name.lastNameCommaFirstName());
       
        //Prompt the user to input new first name.
        System.out.println("Enter a new first name: ");
        
        //Create a String variable for new first name that
        //reads from keyboard.
        String newFirstname = scan.next();
        
        //Call equalFristName() method on name object to check if the new 
        //first name is the same as the old one. Return true/false value.
        System.out.println("Is the new first name same as yours? " 
                + name.equalFirstname(newFirstname));
        
        //Prompt the user to input new full name with first, middle
        //and last names, each separate by a space.
        System.out.println("Enter a new full name with first, "
                + "middle, last names (each separate by one space): ");
        
        //Create a String variable for new full name that 
        //reads from keyboard.
        String newFullname = scan.next();
        
        //Call equalName() method on name object to check if the new 
        //full name is the same as the old one. Return true/false value.
        System.out.println("Is the new full name same as the old one? "
                + name.equalName(newFullname));
       
        scan.close();
    }

}
