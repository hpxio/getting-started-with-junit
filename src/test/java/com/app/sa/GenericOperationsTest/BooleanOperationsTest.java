package com.app.sa.GenericOperationsTest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.app.sa.GenericsOperations.BooleanOperations;

import org.junit.Test;

/**
 * 
 */
public class BooleanOperationsTest {

    private BooleanOperations InsBooleanOperation = new BooleanOperations();

    /**
     * 
     */
    @Test
    public void getLogicalAndTest() {
        assertTrue(InsBooleanOperation.getLogicalAnd(true, true));
    }

    /**
     * 
     * NOTE: Bound to fail test scenario. Just for testing reporting & logging.
     */
    @Test(expected = AssertionError.class)
    public void getLogicalAndFalseTest() {
        assertFalse(InsBooleanOperation.getLogicalAnd(true, true));
    }
}