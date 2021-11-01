package ca.bcit.comp1510.lab04;

/** Class for setting first name, middle name and last name.
 * @author Phuong
 * @version 1.0
 *
 */
public class Name {

    /** 
     * Private instance variable represents first name.
     */
    private String firstname;
    
    /**
     * Private instance variable represents middle name.
     */
    private String middlename;
    
    /**
     * Private instance variable represents last name.
     */
    private String lastname;
    
    /**
     * Public constructor which accepts three parameters for
     * the first, middle, and last name.
     * @param first a String
     * @param middle a String
     * @param last a String
     */
    public Name(String first, String middle, String last) {
        this.firstname = first;
        this.middlename = middle;
        this.lastname = last;   
    }
    
    /**
     * An accessor for firstname variable.
     * @return return firstname as a String
     */
    public String getFirst() {
        return firstname;
    }
    
    /**
     * A mutator for firstname variable.
     * @param first a String
     */
    public void setFirst(String first) {
        firstname = first;
    }
    
    /**
     * An accessor for middlename variable.
     * @return return middlename as a String
     */
    public String getMiddle() {
        return middlename;
    }
    
    /**
     * A mutator for middlename variable.
     * @param middle a String
     */
    public void setMiddle(String middle) {
        middlename = middle;
    }
    
    /**
     * An accessor for lastname variable.
     * @return return lastname as a String
     */
    public String getLast() {
        return lastname;
    }
    
    /**
     * A mutator for lastname variable.
     * @param last a String
     */
    public void setLast(String last) {
        lastname = getLast();
    }
    
    /**
     * Return a String representation of the first initial of each of the
     * instance variables upper case.
     * @return return toString description 
     */
    public String toString() {
        
        //Change first letter of first name to upper case.
        String firstUpper = firstname.substring(0, 1) .toUpperCase();
        
        //Get the rest of the first name letters without the 
        //first letter uppercased.
        String firstN = firstname.substring(1, firstname.length());
        
        //Change first letter of middle name to upper case.
        String middleUpper = middlename.substring(0, 1) .toUpperCase();
        
        //Get the rest of the middle name letters without the 
        //first letter uppercased.
        String middleN = middlename.substring(1, middlename.length());
        
        //Change first letter of last name to upper case.
        String lastUpper = lastname.substring(0, 1) .toUpperCase();
        
        //Get the rest of the last name letters without the 
        //first letter uppercased.
        String lastN = lastname.substring(1, lastname.length());
        
        //Concatenate the first letters in upper case with the rest letters
        //of the names and return the String. 
        return firstUpper + firstN + "\t" + middleUpper 
                + middleN + "\t" + lastUpper + lastN;
    }

}
