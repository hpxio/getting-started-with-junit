package com.app.sa.StringOperationsTest;

import org.junit.*;

import static org.junit.Assert.assertEquals;

import com.app.sa.StringOperations.*;

/**
 * Test-Suite class for a basic type of JUnit Test. Testing of truth of the case
 * is done by simply using a assertEquals. There are several ways to write unit
 * tests which will be covered in the later part of the project.
 */

public class StringBasicsTest {

    StringBasics InsStringBasics = new StringBasics();

    /*
     * Methods marked as @Test as considered by the TestRunner as runnable unit
     * tests and are executed automatically
     */
    @Test
    /** */
    public void getRightPaddingTest() {
        /*
         * JUnit is kind of Black-Box Unit testing approach. Thus you provide required
         * inputs and check against expected values
         */
        String result = InsStringBasics.getRightPadding("Sample", '*', 3);

        /*
         * assertEquals() is one of the way to verify the above methods' output and
         * expected outcome. Other complex datatypes like arrays, collections, exception
         * handling, etc. can be handled separetely. The detailed demonstration of such
         * cases will be covered in the classes ahead.
         */
        assertEquals("Sample***", result);
    }

    /**
     * 
     */
    @Test
    public void getLeftPaddingTest() {
        String result = InsStringBasics.getLeftPadding("Sample", '*', 3);
        assertEquals("***Sample", result);
    }

    /**
     * 
     */
    @Test
    public void getCenterPaddingTest() {
        String result = InsStringBasics.getCenterPadding("Sample", '$', 5);
        assertEquals("$$$$$Sample$$$$$", result);
    }
}