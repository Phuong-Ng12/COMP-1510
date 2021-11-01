package ca.bcit.comp1510.lab04;

/**
 * Represents one die (singular of dice) with faces showing any number of sides.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @author Phuong Nguyen
 * @version 2021
 */
public class MultiDie {
    
    /** Maximum face values.
     * 
     * 1. We don't need getters and setters for max and 
     * we shouldn't have getters and setters for max. Because
     * getters and setters are used to control access 
     * to an encapsulated variable,
     * especially how a variable is changed and who can change it. 
     * A constant has unchangeable value and is set 
     * as read-only on runtime so there is
     * no reason to create a property for it. 
     * 
     * 2. We can't have a setter and a getter for max 
     * because a constant cannot be changed, 
     * which means it doesn't need getters and setters 
     * to control how it is changed. Moreover,
     * max is a private constant which cannot be modified 
     * if you don't have access to the source code,
     * so there is no possible and necessity to 
     * have setters and getters for max.
     * 
     * 3. It makes sense to have max be final because 
     * the number of the sides of the die cannot be changed 
     * in any circumstances.
     * 
     * 4. "max" being final tells about the abstraction of 
     * the MultiDie object that is the user will have 
     * the information on what the object does (only the 
     * functionality will be provided to the user), not on 
     * how the object does it.
     * 
     * 5. "max" is an instance variable, it is a final instance variable 
     * which can be explicitly initialized
     * only once. "max" is an instance variable because 
     * it doesn't have a Static modifier.
     * */
    private final int max;

    /** Current value showing on the die. */
    private int faceValue;
    
    /**
     * Constructor sets the initial face value to number of sides input by user.
     * @param numSides an integer.   
     */
    public MultiDie(int numSides) {
        faceValue = roll();
        max = numSides;
    }

    /**
     * Rolls this Die and returns the result.
     * @return faceValue as an int.
     */
    public int roll() {
        faceValue = (int) (Math.random() * max) + 1;
        return faceValue;
    }

    /**
     * Sets the face value of this Die to the specified value.
     * @param value an int.
     */
    public void setFaceValue(int value) {
        faceValue = value;
    }

    /**
     * Returns the face value of this Die as an int.
     * @return faceValue as an int.
     */
    public int getFaceValue() {
        return faceValue;
    }

    /**
     * Returns a String representation of this Die.
     * @return toString description.
     */
    public String toString() {
        String result = Integer.toString(faceValue);

        return result;
    }
}

