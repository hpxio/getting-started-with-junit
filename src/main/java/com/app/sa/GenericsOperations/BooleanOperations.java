package com.app.sa.GenericsOperations;

/**
 * 
 */
public class BooleanOperations {

    /**
     * 
     */
    public boolean getLogicalAnd(boolean truth, boolean falsey) {
        return (truth & falsey);
    }

    /**
     * 
     */
    public boolean getLogicalOr(boolean truth, boolean falsey) {
        return (truth | falsey);
    }
}