package com.app.sa.MatcherOperationsTest;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Test;

/**
 * 
 */
public class ChainingMatchersTest {

    /**
     * 
     */
    @Test
    public void isNotChainningMatcher() {
        assertThat("This is sample String!!", not(is("Done!!")));
    }
}