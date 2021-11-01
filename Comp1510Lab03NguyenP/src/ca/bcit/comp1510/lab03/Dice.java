/**
 * 
 */

package ca.bcit.comp1510.lab03;

import java.util.Random;

/** Dice.
 * @author Phuong
 * @version 1.0
 *
 */

public class Dice {

    /** 
     * D&D Dice.
     * @param args
     *          unused
     */
    
    public static void main(String[] args) {
        Random generator = new Random();
        
        
        //4-sided die
        int n4; 
        final int four = 4;
        n4 = generator.nextInt(four) + 1;
        

        System.out.println("4-sided Die: " + n4);
        
        //6-sided die
        int n6; 
        final int six = 6;
        n6 = generator.nextInt(six) + 1;
        
        System.out.println("6-sided Die: " + n6);
        
        //8-sided die
        int n8; 
        final int eight = 8;
        n8 = generator.nextInt(eight) + 1;
        
        System.out.println("8-sided Die: " + n8);
        
        //10-sided die
        int n10;
        final int ten = 10;
        n10 = generator.nextInt(ten) + 1;
        
        System.out.println("10-sided Die: " + n10);
        
        //12-sided die
        int n12;
        final int twelve = 12;
        n12 = generator.nextInt(twelve) + 1;
        
        System.out.println("12-sided Die: " + n12);
        
        //20-sided die
        int n20;
        final int twenty = 20;
        n20 = generator.nextInt(twenty) + 1;
        
        System.out.println("20-sided Die: " + n20);
        
        //Total roll
        System.out.println("Total roll: " + (n4 + n6 + n8 + n10 + n12 + n20));
        
    }

}
