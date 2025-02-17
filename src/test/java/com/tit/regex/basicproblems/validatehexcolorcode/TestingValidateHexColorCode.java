package com.tit.regex.basicproblems.validatehexcolorcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

// Class to test the Validate class methods for hexadecimal color code validation
public class TestingValidateHexColorCode {

    // Test method to check the validation logic for different hexadecimal color code inputs
    @Test
    public void Test() {
        // Test case 1: Validate hexadecimal color code "#FFA500"
        String result1 = Validate.validate("#FFA500");
        String expected1 = "Valid"; // Expected result for "#FFA500"

        // Test case 2: Validate hexadecimal color code "#450FF0"
        String result2 = Validate.validate("#450FF0");
        String expected2 = "Valid"; // Expected result for "#450FF0"

        // Test case 3: Validate hexadecimal color code "#123XYZ"
        String result3 = Validate.validate("#123XYZ");
        String expected3 = "Invalid"; // Expected result for "#123XYZ"

        // Assert if the actual results match the expected results
        assertEquals(expected1, result1);
        assertEquals(expected2, result2);
        assertEquals(expected3, result3);

        // Print a message indicating the test is successful
        System.out.println("Test is successful!");
    }
}
