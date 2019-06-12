package com.app.sa.GenericsOperations;

/**
 * 
 */
public class ExpectedExceptions {

    /**
    * 
    */
    public String createDirectory(String path) {

        if (path == null) {
            throw new IllegalArgumentException("Directory path cannot be null!!");
        }
        return path + " created!";
    }
}