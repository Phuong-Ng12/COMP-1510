package TESTING;

import java.util.Scanner;

public class Packtesting {

    public static void main(String[] args) {
        
        //Prompt for and read the input string into a variable.
        System.out.println("Please enter a string using 5 letters from A to I: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        
        //Exact the nth character from the string.
        char c1 = input.charAt(0);
        char c2 = input.charAt(1);
        char c3 = input.charAt(2);
        char c4 = input.charAt(3);
        char c5 = input.charAt(4);
        
        //Convert each character to its numeric value.
        int valueC1 = c1 - 'A' + 1;
        int valueC2 = c2 - 'A' + 1;
        int valueC3 = c3 - 'A' + 1;
        int valueC4 = c4 - 'A' + 1;
        int valueC5 = c5 - 'A' + 1;
        
        //Use the 5 values as “digits” in a base 56 number and calculate the resulting value.
        int value = valueC1 * 56*56*56*56 + valueC2 * 56*56*56 + valueC3 * 56*56 + valueC4 * 56 + valueC5;
        
        //Print the encoded integer.
        
        System.out.println(value);
        
        //Decode the value by using remainder to extract the least significant digit and
        //integer division to move all the remaining digits down one place.
        
        int place0; 
        int place1;
        int place2;
        int place3;
        int place4;
        final int base = 56;
        
        
        place0 = value % base;
        
        int quotient0 = value / base;
        
        place1 = quotient0 % base;
        
        int quotient1 = quotient0 / base;
        
        place2 = quotient1 % base;
        int quotient2 = quotient1 / base;
        
        
        place3 = quotient2 % base;
        int quotient3 = quotient2 / base;
        
        place4 = quotient3 % base;
        
        //To get each digit, d, back to a character, use the formula (char)(d – 1 + 'A').
        char d1 = (char)(place4 - 1 + 'A');
        char d2 = (char)(place3 - 1 + 'A');
        char d3 = (char)(place2 - 1 + 'A');
        char d4 = (char)(place1 - 1 + 'A');
        char d5 = (char)(place0 - 1 + 'A');
        
        //Print the five decoded characters.
        System.out.println(place4 + ""+ place3 + "" + place2 + "" + place1 + "" + place0);
        System.out.println(d1 + ""+ d2 + "" + d3 + "" + d4 + "" + d5);
       
       
       
    }
       
}
