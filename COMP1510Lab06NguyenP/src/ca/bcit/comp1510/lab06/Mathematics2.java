package ca.bcit.comp1510.lab06;

import java.util.Random;

/** Methods for Mathematics2Test.
 * @author Phuong Nguyen
 * @version 1.0
 */
public class Mathematics2 {
    /**
     * Private final instance variable represents FOOT_TO_KILOMETRE_RATIO value.
     */
    public static final double FOOT_TO_KILOMETRE_RATIO = 0.0003048;
    
    /**
    * Returns the area of the square with the specified edge length.
    *
    * @param d edgeLength of the square.
    * @return area as a double
    */
    public double getSquareArea(double d) {
        double area = d * d;
        return area;
    }
    
    /**
    * Returns the sum of the specified values.
    *
    * @param d first operand
    * @param e second operand
    * @return sum of the operands
    */
    public double add(double d, double e) {
        double sum = d + e;
        return sum;
    }
    
    /**
    * Returns the product of the specified values.
    *
    * @param d first operand
    * @param e second operand
    * @return product of the operands
    */
    public double multiply(double d, double e) {
        double product = d * e;
        return product;
    }
    
    /**
    * Returns the difference of the specified values.
    *
    * @param d first operand
    * @param e second operand
    * @return difference of the operands
    */
    public double subtract(double d, double e) {
        double difference = d - e;
        return difference;
    }
    
    /**
    * Returns the quotient of the specified values. If the divisor is zero,
    * returns zero instead of NaN or infinity.
    *
    * @param i first operand
    * @param j second operand
    * @return quotient of the operands
    */
    public double divide(double i, double j) {
        double zero = 0.0;
        double quotient = i / j;
        if (j != 0) {
            return quotient;
        } else {
            return zero;
        }
    }
    
    /**
    * Returns the absolute value of the specified integer.
    *
    * @param i number to test
    * @return absolute value of number
    */
    public int absoluteValue(int i) {
        int abs = Math.abs(i);
        return abs;
    }
    
    /**
     * Returns a random number between 10 and 20 inclusive,
     * but NOT 15.
     * @return random number in range [10, 20] excluding 15.
     */
    public int getRandomNumberBetweenTenAndTwentyButNotFifteen() {
        Random ran = new Random();
        final int exludedNum = 15;
        final int rangemin = 10;
        final int rangemax = 11;
        
        int randomNumberBetweenTenAndTwentyButNotFifteen = 
                ran.nextInt(rangemax) + rangemin;
        
        while (randomNumberBetweenTenAndTwentyButNotFifteen == exludedNum) {
            randomNumberBetweenTenAndTwentyButNotFifteen = 
                    ran.nextInt(rangemax) + rangemin;
        }
        
        return randomNumberBetweenTenAndTwentyButNotFifteen;
    }
    
    /**
    * Converts the specified number of feet to kilometres.
    * @param d feet to convert
    * @return kilometres in the specified number of feet
    */
    public double convertFeetToKilometres(double d) {
        double convertFttoKm = d * FOOT_TO_KILOMETRE_RATIO; 
        return convertFttoKm;
    }
    
    /**
    * Returns the sum of the numbers between zero and the
    * first parameter that are divisible by the second
    * number. For example, sumOfProducts(10, 3) will return
    * 3 + 6 + 9 = 18, and sumOfProducts(10, 2) will return
    * 2 + 4 + 6 + 8 + 10 = 30 and sumOfProducts(-10, 2) will
    * return -2 + -4 + -6 + -8 + -10 = -30.
    * @param i bound the upper bound
    * @param j divisor the divisor
    * @return sum
    */
    public int sumOfProducts(int i, int j) {
        int sum = 0;
        int count = 0;
        if (i > 0) {
            do {
                sum = sum + count;
                count = count + j;
            }
            while (count <= i);
        } else {
            do {
                sum = sum + count;
                count = count - j;
            }
            while (count >= i);
        }
        return sum;
    }
   
}
