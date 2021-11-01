package ca.bcit.comp1510.lab04;

import java.util.Scanner;

/** Drive the MultiDie class.
 * 
 * @author Phuong
 * @version 1.0
 *
 */
public class RollingMultiDice {

    /**
     * Driver program creates two Die objects and rolls them.
     * @param args
     *          unused
     */
    public static void main(String[] args) {
        final int newFace = 4;
        MultiDie dieOne;
        MultiDie dieTwo;
        int sum;
        
        //Prompt user to input number of sides for Die One and Die Two:
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter Die One's number of sides: ");
        int numsides1 = scan.nextInt();
        System.out.println("Please enter Die Two's number of sides: ");
        int numsides2 = scan.nextInt();     
        
        //Create an object dieOne with number of sides of dieOne as 
        //user's input above.
        dieOne = new MultiDie(numsides1);
        
        //Create an object dieTwo with number of sides of dieTwo as 
        //user's input above.
        dieTwo = new MultiDie(numsides2);
        
        //Print the roll result of dieOne and dieTwo.
        System.out.println("Roll result of Die One: " + dieOne.roll());
        System.out.println("Roll result of Die Two: " + dieTwo.roll());
        
        //Roll dieOne again and set face value for dieTwo as 
        //constant newFace which is 4.
        dieOne.roll();
        dieTwo.setFaceValue(newFace);
        System.out.println("Die One: " + dieOne + ", Die Two: " + dieTwo);
        
        //Roll dieOne and dieTwo again
        //and calculate the sum of face value of dieOne 
        //and face value of dieTwo.
        sum = dieOne.getFaceValue() + dieTwo.getFaceValue();
        System.out.println("Sum: " + sum);
        
        //Roll dieOne and dieTwo again
        sum = dieOne.roll() + dieTwo.roll();
        
        //New sum of face value of dieOne and face value of dieTwo.
        System.out.println("Die One: " + dieOne + ", Die Two: " + dieTwo);
        System.out.println("New Sum: " + sum);
        
        scan.close();
    }

}
