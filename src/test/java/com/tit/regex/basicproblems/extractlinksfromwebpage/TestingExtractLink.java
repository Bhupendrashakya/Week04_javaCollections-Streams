package com.tit.regex.basicproblems.extractlinksfromwebpage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestingExtractLink {

    @Test
    public void test() {
        // Input text containing multiple URLs
        String result = ExtractLink.extract("Visit https://www.google.com and http://example.org for more info.");

        // Expected result as a string of URL list
        String expected = "[https://www.google.com, http://example.org]";

        // Assert that the result matches the expected value
        assertEquals(expected, result);

        // Print test success message
        System.out.println("Test is successful!");
    }
}
