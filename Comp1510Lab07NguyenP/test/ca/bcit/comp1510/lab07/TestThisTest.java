package ca.bcit.comp1510.lab07;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import java.util.Arrays;

/**
 * TestThisTest.
 * 
 * @author Phuong Nguyen
 * @version 1.0
 */
class TestThisTest {
    
    /**
     * The TestThis object to test.
     */
    private TestThis test;
    
    /**
     * Creates a new TestThis objects before each test is executed.
     * 
     * @throws Exception
     *             if a TestThis object cannot be created.
     */
    @BeforeEach
    public void setUp() throws Exception {
        test = new TestThis();
    }
    
    /**
     * Test largest method to see which number is the largest.
     */
    @Test
    void testLargestIntIntInt1() {
        int largest1 = test.largest(2,5,6);
        assertEquals(6, largest1);
    }
    
    /**
     * Test largest method to see which number is the largest.
     */
    @Test
    void testLargestIntIntInt2() {
        int largest = test.largest(78,12,0);
        assertEquals(78, largest);
    }
    
    /**
     * Test largest method to see which number is the largest.
     */
    @Test
    void testLargestIntIntInt3() {
        int largest = test.largest(12467,39082,230596);
        assertEquals(230596, largest);
    }
    
    /**
     * Test largest method with a list of integers to see which number is the largest.
     */
    @Test
    void testLargestListOfInteger1() {
        ArrayList<Integer> arrayListOfIntegers1 = new ArrayList<>(Arrays.asList(4,6,8));
        int max = test.largest(arrayListOfIntegers1);
        assertEquals(8, max);
    }
    
    /**
     * Test largest method with a list of integers to see which number is the largest.
     */
    @Test
    void testLargestListOfInteger2() {
        ArrayList<Integer> arrayListOfIntegers2 = new ArrayList<>(Arrays.asList(90,23,74));
        int max = test.largest(arrayListOfIntegers2);
        assertEquals(90, max);
    }
    
    /**
     * Test largest method with a list of integers to see which number is the largest.
     */
    @Test
    void testLargestListOfInteger3() {
        ArrayList<Integer> arrayListOfIntegers3 = new ArrayList<>(Arrays.asList(183257,93257,2378968));
        int max = test.largest(arrayListOfIntegers3);
        assertEquals(2378968, max);
    }

}
