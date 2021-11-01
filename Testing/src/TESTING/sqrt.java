package TESTING;
import java.util.Scanner;

public class sqrt {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double a = scan.nextDouble();
        double s1 = (a + 1) / 2;
        double s2 = (s1 + a / s1) /2;
        double s3 = (s2 + a / s2) /2;
        double s4 = (s3 + a / s3) /2;
        double s5 = (s4 + a / s4) /2;
        double s6 = (s5 + a / s5) /2;
        double s7 = (s6 + a / s6) /2;
        double s8 = (s7 + a / s7) /2;
        double s9 = (s8 + a / s8) /2;
        double s10 = (s9 + a / s9) /2;
        System.out.println("Square root Estimation 1: " + s1);
        System.out.println("Square root Estimation 2: " + s2);
        System.out.println("Square root Estimation 3: " + s3);
        System.out.println("Square root Estimation 4: " + s4);
        System.out.println("Square root Estimation 5: " + s5);
        System.out.println("Square root Estimation 6: " + s6);
        System.out.println("Square root Estimation 7: " + s7);
        System.out.println("Square root Estimation 8: " + s8);
        System.out.println("Square root Estimation 9: " + s9);
        System.out.println("Square root Estimation 10: " + s10);
        
        scan.close();
    }

}
