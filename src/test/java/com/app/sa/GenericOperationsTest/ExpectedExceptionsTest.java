package com.app.sa.GenericOperationsTest;

import com.app.sa.GenericsOperations.ExpectedExceptions;

import org.junit.Test;

/**
 * 
 */
public class ExpectedExceptionsTest {

    private ExpectedExceptions InsExpectedExceptions = new ExpectedExceptions();

    /**
    * 
    */
    @Test(expected = IllegalArgumentException.class)
    public void createDirectoryTest() {
        String path = null;
        InsExpectedExceptions.createDirectory(path);
    }
}