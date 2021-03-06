package ca.bcit.comp1510.lab05;

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
    
    /**
     * A method that accepts no parameters and returns the length of the name.
     * @return integer value of length of name
     */
    public int lengthOfName() {
        return firstname.length() + middlename.length() + lastname.length();
    }
    
    /**
     * A method that accepts no parameters and returns a String 
     * consisting of the three initials IN UPPERCASE.
     * @return a String of three initials of the name
     */
    public String threeInitials() {
        String firstUpper = firstname.substring(0, 1) .toUpperCase();
        
        String middleUpper = firstname.substring(0, 1) .toUpperCase();
        
        String lastUpper = lastname.substring(0, 1) .toUpperCase();
        
        return firstUpper + "\s" + middleUpper + "\s" + lastUpper;
    }
    
    /**
     * A method that accepts an integer n and returns the nth character 
     * in the full three part name.
     * @param n integer value input by user to tell the position 
  of the extracted character.
     * @return nFull as char value 
     */
    public char nthChar(int n) {
        String full = firstname + middlename + lastname;
        char nFull = full.charAt(n);
        return nFull;
    }
    
    /**
     * A method that accepts no parameters and returns a 
     * String consisting of the last name followed by 
     * a comma followed by the first name followed by the middle name.
     * @return a String concatenation of lastname, comma, first and middle name
     */
    public String lastNameCommaFirstName() {
        return lastname + "," + "\s" + firstname + "\s" + middlename;
    }
    
    /**
     * A method that accepts a String and returns true 
     * if the String is equal to the first name.
     * @param a String value of the new name
     * @return a boolean value
     */
    public boolean equalFirstname(String a) {
        return firstname.equals(a); 
    }
    
    /**
     * A method that accepts a Name object and returns true if the three parts 
     * of the name object are the same as the three parts of ?this? Name object.
     * @param name a String value of the new name
     * @return a boolean value
     */
    public boolean equalName(String name) {
        String fullOrgName = firstname + "\s" + middlename + "\s" + lastname;
        return fullOrgName.equals(name);
    }

}
