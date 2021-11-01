/**
 * 
 */

package ca.bcit.comp1510.lab01;

/**
 * Program Names.
 * 
 * @author Phuong
 * @version 1.0
 * 
 */
public class Simple {

    /**
     * Valid or invalid program names.
     * 
     * @param args
     *              unused
     */
    public static void main(String[] args) {
        System.out.println("I love Java");
        
        // 1. simple: invalid because of the same type name 
        //but with different capitalization.
        
        // 2. SimpleProgram: valid but not a good choice to name 
        //the program because it is easy to mistake what letter is capitalized.
        
        // 3. 1 Simple: invalid because starting with a digit.
        
        // 4. _Simple_: valid but not a good choice to name
        //the program because it has redundant underscore and easy to forget.
        
        // 5. *Simple*: invalid because starting with * 
        //which means duplicates the * sign of notice of changes in java files.
        
        // 6. $123_45: not encouraged because by convention, 
        //java type names don't usually contain the $ character.
        
        // 7. Simple!: invalid because Java identifier only contains 
        //letters digits, underscore character and dollar sign.
        
    }

}
