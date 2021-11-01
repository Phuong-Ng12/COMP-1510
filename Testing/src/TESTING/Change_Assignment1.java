package TESTING;

import java.util.Scanner;
/**
 * This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.
 *
 * @author Your Name goes here
 * @version 1.0
 */
public class Change_Assignment1 {
    /**
     * This is the entry point that gets called to run the program.
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a monetary amount: ");
        double money = scan.nextDouble();
        
        final int ten = 10;
        final int five = 5;
        final int toonies = 2;
        final int loonies = 1;
        final double quarters = 0.25;
        final double dimes = 0.10;
        final double nickles = 0.05;
        final double pennies = 0.01;
        
        int tenDollarBills = (int) money / ten;
        int realtenDollarBills = (int) tenDollarBills;
        int fiveDollarBills = (int) (money % ten) / five;
        int realfiveDollarBills = (int) fiveDollarBills;
        int numOfToonies = (int) ((money % ten) % five) / toonies;
        int realnumOfToonies = (int) numOfToonies;
        int numOfLoonies = (int) (((money % ten) % five) % toonies) / loonies;
        double numOfQuarters = ((((money % ten) % five) % toonies) % loonies) / quarters;
        int realnumOfQuarters = (int) numOfQuarters;
        double numOfDimes = (((((money % ten) % five) % toonies) % loonies) % quarters) / dimes;
        int realnumOfDimes = (int) numOfDimes;
        double numOfNickles = ((((((money % ten) % five) % toonies) % loonies) % quarters) % dimes) / nickles;
        int realnumOfNickles = (int) numOfNickles;
        double numOfPennies = (((((((money % ten) % five) % toonies) % loonies) % quarters) % dimes) % nickles) / pennies;
        int realnumOfPennies = (int) numOfPennies;
        System.out.println("The bills are: ");
        System.out.println(realtenDollarBills + " ten dollar bills");
        System.out.println(realfiveDollarBills + " five dollar bills");
        System.out.println(realnumOfToonies + " toonies");
        System.out.println(numOfLoonies + " loonies");
        System.out.println(realnumOfQuarters + " quarters");
        System.out.println(realnumOfDimes + " dimes");
        System.out.println(realnumOfNickles + " nickles");
        System.out.println(realnumOfPennies + " pennies");
        
        scan.close();
    }

}
