package com.tit.regex.basicproblems.extractallemailaddressesfromtext;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestingExtractAllEmailAddressesFromText {

    @Test
    public void testExtractEmail() {
        // Input text containing multiple email addresses
        String input = "Contact us at support@example.com and info@company.org";

        // Expected result
        String expected = "[support@example.com, info@company.org]";

        // Call the extractEmail method and store the result
        String result = Extract.extractEmail(input);

        // Assert that the result matches the expected value
        assertEquals(expected, result);

        // Print test success message
        System.out.println("Test Successful");
    }
}
