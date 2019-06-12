package com.app.sa.StringOperations;

/**
 * 
 */
public class StringBasics {

    /**
     * Get Right padded String with given character of given length.
     * 
     * @param seed         Base String to append padding characters
     * @param padCharacter Padding character
     * @param padLength    Number of padding charcaters to be added to the seed
     *                     String
     * @return Padded String
     */
    public String getRightPadding(String seed, char padCharacter, int padLength) {
        while (padLength-- != 0) {
            seed = seed + padCharacter;
        }
        return seed;
    }

    /**
     * Get Left padded String with given character of given length.
     * 
     * @param seed         Base String to append padding characters
     * @param padCharacter Padding character
     * @param padLength    Number of padding charcaters to be added to the seed
     *                     String
     * @return Padded String
     */
    public String getLeftPadding(String seed, char padCharacter, int padLength) {
        String temp = "";
        while (padLength-- != 0) {
            temp = temp + padCharacter;
        }
        seed = temp + seed;
        return seed;
    }

    /**
     * 
     * @param seed
     * @param padCharacter
     * @param padLength
     * @return
     */
    public String getCenterPadding(String seed, char padCharacter, int padLength) {
        String temp;
        temp = getLeftPadding(seed, padCharacter, padLength);
        temp = getRightPadding(temp, padCharacter, padLength);
        return temp;
    }
}