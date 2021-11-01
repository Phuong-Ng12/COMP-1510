/**
 * 
 */

package ca.bcit.comp1510.lab01;

/**
 * Demonstrate the different behaviours of the + operator.
 * @author BCIT
 * @version 2021
 */
public class Plus {

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        System.out.println("This is a long string that is the"  
                            + " concatenation of two shorter strings.");
        System.out.println("The first computer was invented about "   
                            + 70 + " years ago");
        
        //If the string comes before int in the operation, String conversion is 
        //used and all the rest of the operands will be treated as strings.
        System.out.println("8 plus 5 is " + 8 + 5);
        
        //String is concatenated with an integer but the parenthesis makes 
        //8 + 5 executed first, the output will have the string  
        //concatenate with the result which is done first in the parenthesis.
        System.out.println("8 plus 5 is " + (8 + 5));
        
        //If the int comes first in the operation it will be treated as int, 
        //8 + 5 + " " gives 13 because String is in the end of the operation.
        System.out.println(8 + 5 + " equals 8 plus 5.");
        

    }

}
