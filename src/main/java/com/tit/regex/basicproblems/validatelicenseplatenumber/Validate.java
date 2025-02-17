package com.tit.regex.basicproblems.validatelicenseplatenumber;

import java.util.regex.Pattern;

// Class to validate license plate numbers
public class Validate {

    // Regular expression pattern for license plate validation
    private static final String PlateNumber_PATTERN = "^[A-Z]{2}[0-9]{4}$";

    // Precompiled pattern for efficiency
    private static final Pattern pattern = Pattern.compile(PlateNumber_PATTERN);

    // Method to validate a given number plate against the pattern
    public static String validateNumberPlate(String numberPlate) {
        // Check if the number plate matches the pattern
        if (pattern.matcher(numberPlate).matches()) {
            return "Valid";  // Return "Valid" if it matches
        } else {
            return "Invalid";  // Return "Invalid" if it doesn't match
        }
    }
}
