package ca.bcit.comp1510.lab04;

import java.util.Scanner;

/** Drive the Name program.
 * @author Phuong
 * @version 1.0
 */
public class Names {

    /** Drive the Name program.
     * @param args
     *          unused
     */
    public static void main(String[] args) {
        
        //Prompt the user to input their first name,
        //middle name and last name.
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your first name: ");
        String firstname = scan.nextLine();
        
        System.out.println("Please enter your middle name: ");
        String middlename = scan.nextLine();
        
        System.out.println("Please enter your last name: ");
        String lastname = scan.nextLine();
        
        //Create an object of Name.
        Name name = new Name(firstname, middlename, lastname);
        
        //Declare a fullName String variable and
        //call toString() method on name object. 
        String fullName = name.toString();
        
        //Print fullName.
        System.out.println("Your full name is: " + fullName);
        
        //Close Scanner.
        scan.close();
    }

}
