package TESTING;
import java.util.Scanner;
import java.text.NumberFormat;
public class Testclass2driver {

    public static void main(String[] args) {
        
        System.out.println("Please enter last & first: "); 
        Scanner scan = new Scanner(System.in);
        String last = scan.nextLine();
        String first = scan.nextLine();
        
        Testclass2 fullname = new Testclass2(last, first);
        String full = fullname.toString();
        System.out.println("New string here: " + full);
        
         
        int b = 3; 
        int a = 1;
        a += b;
        System.out.println("a = " + a);
        
        
        
        double num = 234.58;
        
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        System.out.println(fmt.format(num));
        
        int numofLetters = last.length();
        System.out.println(numofLetters);

    }

}
