package com.app.sa.MatcherOperationsTest;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

/**
 * 
 */
public class CoreMatchersTest {

    /**
    * 
    */
    @Test
    public void isMatcher() {
        assertThat("123344", is("123344"));
    }
}