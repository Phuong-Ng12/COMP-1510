/**
 * 
 */

package ca.bcit.comp1510.lab01;

/**
 * Prints a Hello World message.
 *
 * @author BCIT
 * @version 2017
 */
public class Hello {

    /**
     * Prints the greeting.
     * 
     * @param args
     *              unused
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        //a. Delete one "l": Error: Could not find or load 
        //main class ca.bcit.comp1510.lab01.Hello in module Comp1510Lab01NguyenP
        
        //b. No error message because it's in the output. 
        //The printed line in Console changed.
        
        //c. No ending quotation mark in a string literal:
        //Exception in thread "main" java.lang.
        //Error: Unresolved compilation problem: 
        //String literal is not properly closed by a double-quote
        //at Comp1510Lab01NguyenP/ca.bcit.comp1510.
        //lab01.Hello.main(Hello.java:21)
        
        //d. No beginning quotation mark in a string literal:
        //Exception in thread "main" java.lang.
        //Error: Unresolved compilation problem: 
        //Syntax error, insert ";" to complete BlockStatements
        //at Comp1510Lab01NguyenP/ca.bcit.comp1510.
        //lab01.Hello.main(Hello.java:21)
        
        //e. Remove semicolon at the end: Error: Syntax error, 
        //insert ";" to complete BlockStatements 

    }

}
