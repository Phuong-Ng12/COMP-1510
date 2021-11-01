package ca.bcit.comp1510.lab05;

/** Class for MathematicsTest.
 * @author Phuong
 * @version 1.0
 */
public class Mathematics {
    /**
     * Private final instance variable represents PI value.
     */
    public static final double PI = Math.PI;
    
    /**
    * Returns the area of the circle with the specified radius.
    * @param d radius of the circle.
    * @return area as a double
    */
    public double getCircleArea(double d) {
        double area = PI * d * d;
        return area;
    }

    /**
    * Returns the sum of the positive integers between 0 and the specified
    * number inclusive. If the specified number is negative, returns zero.
    *
    * @param i number upper bound
    * @return sum as an integer
    */
    public int sumOfInts(int i) {
        int j = 0;
        int sum = 0;
        if (i > 0) {
            while (j <= i) {
                sum = sum + j;
                j++;
            }
        } else {
            sum = 0;
        }
        return sum;
    }

    /**
    * Returns true if the specified value is positive, else false.
    *
    * @param i number to test
    * @return true if number is positive, else false.
    */
    public boolean isPositive(int i) {
        if (i > 0) {
            return true;
        }
        return false;
    }

    /**
    * Returns true if the specified value is even, else false.
    *
    * @param i number to test
    * @return true if number is even, else false.
    */
    public boolean isEven(int i) {
        if (i % 2 == 0) {
            return true;
        }
        return false;
    }

    /**
    * Returns sum of the even numbers between 0 and the specified value,
    * inclusive. The value can be positive, negative, or zero.
    *
    * @param i number upper bound
    * @return sum of the even numbers between 0 and number
    */
    public int sumOfEvens(int i) {
        int j = 0;
        int sum = 0;
        if (i >= 0) {
            while (i >= j) {
                if (j % 2 == 0) {
                    sum = sum + j;
                }
                j++;
            }
        } else {
            while (i <= j) {
                if (j % 2 == 0) {
                    sum = sum + j;
                }
                j--;
            }
        }
        return sum;
    }

}
