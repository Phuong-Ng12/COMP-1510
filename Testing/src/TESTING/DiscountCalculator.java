package TESTING;
import java.util.Scanner;

public class DiscountCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of cheese purchased: ");
        int numberOfCheese = scan.nextInt();
        System.out.println("Enter number of referals: ");
        int numberOfReferals = scan.nextInt();
        final int discount = 75;
        int realDiscount = Math.min(numberOfCheese + numberOfReferals, discount);
        System.out.println("The discount is: " + realDiscount + "%");
        
        scan.close();

    }

}
