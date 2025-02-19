package com.tit.regex.advanceproblems.validatesocialsecuritynumber;

import java.util.regex.Pattern;

public class Validator {
    // Method to validate the SSN based on the given criteria
    public static boolean isValidSSN(String ssn) {
        // Regular expression for validating SSN
        String regex = "^\\d{3}-\\d{2}-\\d{4}$";
        // Return whether the SSN matches the regular expression
        return Pattern.matches(regex, ssn);
    }
}
