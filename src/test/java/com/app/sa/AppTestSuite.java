package com.app.sa;

import com.app.sa.ArrayOperationsTest.ArrayBasicsTest;
import com.app.sa.GenericOperationsTest.BooleanOperationsTest;
import com.app.sa.GenericOperationsTest.ExpectedExceptionsTest;
import com.app.sa.MatcherOperationsTest.ChainingMatchersTest;
import com.app.sa.MatcherOperationsTest.CoreMatchersTest;
import com.app.sa.StringOperationsTest.StringBasicsTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * RunWith() Annotation is one of the ways to use TestSuite approach where one
 * can include multiple classes for the execution of unit tests.
 */
@RunWith(Suite.class)
@SuiteClasses({ AppTest.class, StringBasicsTest.class, ArrayBasicsTest.class, BooleanOperationsTest.class,
        ExpectedExceptionsTest.class, ChainingMatchersTest.class, CoreMatchersTest.class })
/**
 * Suite approach of running the JUnit testcases. This class don't contain any
 * implementation. It is only used for the annotation purpose.
 */
public class AppTestSuite {
    /**
     * Constrcutor for Suite annotated class is not used.
     */
    public AppTestSuite() {
        /// Class created for mapping Test Suites ///
    }
}