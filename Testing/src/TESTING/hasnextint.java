package TESTING;

import java.util.Scanner;

public class hasnextint {

    public static void main(String[] args) {
        String s = "Hello World! 3 + 3.0 = 6 ";
        
        // create a new scanner with the specified String Object
        Scanner scanner = new Scanner(s);

        while (scanner.hasNext()) {
           
         // check if the scanner's next token is an int
            System.out.println("" + scanner.hasNextInt());

           // print what is scanned
           System.out.println("" + scanner.next());
        }
        System.out.println("-------------");
        
        int i = 1;
        int factorial = 1;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter value: ");
        /*
        if (scan.hasNextInt()) {
            int x = scan.nextInt();
            System.out.println("You entered value: " + x);
            while (i <= x) {
                factorial = factorial * i;
                i++;
            }
            System.out.println("Factorial: " + factorial);
        } */
        System.out.println("-------------");
           if (scan.hasNextInt() == false) {
               int x = scan.nextInt();
               System.out.println("x: " + x);
           }
           
         
        
        
        // close the scanner
        scanner.close();
        /*
        String a;
        Scanner scan = new Scanner(System.in);
        System.out.println("a: ");
        a = scan.nextLine();
        while (scan.hasNext()) {
            System.out.println(" .. " + scan.hasNextInt());
            
            System.out.println(" 3 " + scan.next());
        }
        scan.close();
        */
        
    } 

}

