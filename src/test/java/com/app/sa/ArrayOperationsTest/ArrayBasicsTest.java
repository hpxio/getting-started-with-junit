package com.app.sa.ArrayOperationsTest;

import static org.junit.Assert.assertArrayEquals;

import com.app.sa.ArrayOperations.*;

import org.junit.Test;

public class ArrayBasicsTest {
    ArrayBasics insArrayBasics = new ArrayBasics();

    /**
     * 
     */
    @Test
    public void getStringToCharArrayTest() {
        char[] sample = { 'S', 'a', 'm', 'p', 'l', 'e' };
        assertArrayEquals(sample, insArrayBasics.getStringtoCharArray("Sample"));
    }
}