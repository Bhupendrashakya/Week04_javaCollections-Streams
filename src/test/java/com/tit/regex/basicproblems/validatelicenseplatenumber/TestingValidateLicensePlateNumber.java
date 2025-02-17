package com.tit.regex.basicproblems.validatelicenseplatenumber;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

// Class to test the Validate class methods for license plate number validation
public class TestingValidateLicensePlateNumber {

    // Test method to check the validation logic for different number plate inputs
    @Test
    public void Test1() {
        // Test case 1: Validate number plate "2285MP"
        String result1 = Validate.validateNumberPlate("2285MP");
        String expected1 = "Invalid"; // Expected result
        assertEquals(expected1, result1); // Assert if the actual result matches the expected result

        // Test case 2: Validate number plate "MP2285"
        String result2 = Validate.validateNumberPlate("MP2285");
        String expected2 = "Valid"; // Expected result
        assertEquals(expected2, result2); // Assert if the actual result matches the expected result

        // Print a message indicating the test is successful
        System.out.println("Test1 is Successful!");
    }
}
