package com.tit.regex.basicproblems.validatehexcolorcode;

import java.util.regex.Pattern;

// Class to validate hexadecimal color codes
public class Validate {

    // Regular expression pattern for hexadecimal color code validation
    private static final String PATTERN = "^#[0-9A-Fa-f]{6}$";  // Correct pattern

    // Precompiled pattern for efficiency
    private static final Pattern pattern = Pattern.compile(PATTERN);

    // Method to validate a given input against the pattern
    public static String validate(String input) {
        // Check if the input matches the pattern
        if (pattern.matcher(input).matches()) {
            return "Valid";  // Return "Valid" if it matches
        } else {
            return "Invalid";  // Return "Invalid" if it doesn't match
        }
    }
}
