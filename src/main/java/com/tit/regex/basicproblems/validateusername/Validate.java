package com.tit.regex.basicproblems.validateusername;

import java.util.regex.Pattern;

public class Validate {

    // Define the regex pattern for a valid username
    private static final String USERNAME_PATTERN = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
    private static final Pattern pattern = Pattern.compile(USERNAME_PATTERN);

    // Method to validate username
    public static String validateUsername(String username) {
        if (pattern.matcher(username).matches()) {
            return "Valid";
        } else {
            return "Invalid";
        }
    }
}