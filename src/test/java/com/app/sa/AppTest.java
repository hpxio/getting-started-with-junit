package com.app.sa;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(AppTestSuite.class);
        for (Failure failCase : result.getFailures()) {
            System.err.println("!!! TEST FAILED !!!");
            System.err.println("Failure Descriptrion:: " + failCase.getDescription());
            System.err.println("Test Case Header:: " + failCase.getTestHeader());
            System.err.println("Exception Type::" + failCase.getException());
        }

        System.out.println("Testing suite execution completed!!");
    }
}
