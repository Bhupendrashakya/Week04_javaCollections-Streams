package com.tit.regex.basicproblems.validatehexcolorcode;

// Main class to validate hexadecimal color codes
public class validatehexcolorcode {
    public static void main(String[] args) {
        // Test cases for validating hexadecimal color codes
        System.out.println(Validate.validate("#FFA500"));  // Valid: Correct 6-digit hex color code
        System.out.println(Validate.validate("#450FF0"));  // Valid: Correct 6-digit hex color code
        System.out.println(Validate.validate("#123"));     // Invalid: Only 3 digits, not 6
        System.out.println(Validate.validate("#123XYZ"));  // Invalid: Contains non-hex characters
        System.out.println(Validate.validate("FFA500"));   // Invalid: Missing '#' symbol
    }
}
