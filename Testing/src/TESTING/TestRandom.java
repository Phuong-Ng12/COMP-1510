/**
 * 
 */
package TESTING;

import java.util.Random;

/**
 * @author Phuong
 *
 */
public class TestRandom {

    /**
     * @param args
     */
    public static void main(String[] args) {
        double a = Math.random() * 6;
        System.out.println("a = " + a );
        
        Random random = new Random();
        System.out.println("The random number is: " + random.nextFloat());
    }

}
