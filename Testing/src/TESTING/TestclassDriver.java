package TESTING;
import java.util.Scanner;
public class TestclassDriver {

    public static void main(String[] args) {
        String name;
        System.out.println("Enter your last name:");
        Scanner scan = new Scanner (System.in);
        String lastname = scan.nextLine();
        
        System.out.println("Enter your first name: ");
        String firstname = scan.nextLine();
        
        if (!firstname.equals(" ") && !firstname.equals("\s")) {
            
            name = firstname.substring(0,1).toUpperCase() + firstname.substring(1);
            System.out.println("one: " + name);
        }
        
        
    }

}
