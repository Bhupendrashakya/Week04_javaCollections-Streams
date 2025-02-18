package com.tit.regex.basicproblems.extractdates;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestingExtractDates {

    @Test
    public void Test() {
        // Input text containing multiple dates in dd/mm/yyyy format
        String result = Extract.extract("The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.");

        // Expected result as a string of date list
        String expected = "[12/05/2023, 15/08/2024, 29/02/2020]";

        // Assert that the result matches the expected value
        assertEquals(expected, result);

        // Print test success message
        System.out.println("Test is successful!");
    }
}
