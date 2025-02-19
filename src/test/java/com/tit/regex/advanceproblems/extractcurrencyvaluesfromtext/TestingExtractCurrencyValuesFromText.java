package com.tit.regex.advanceproblems.extractcurrencyvaluesfromtext;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestingExtractCurrencyValuesFromText {
    // Test method for extracting currency values
    @Test
    void testExtractCurrencyValues() {
        // Example text
        String text = "The price is $45.99, and the discount is 10.50.";
        // Expected output
        List<String> expectedValues = Arrays.asList("$45.99", "10.50");
        // Asserting the extracted currency values
        assertEquals(expectedValues, CurrencyExtractor.extractCurrencyValues(text));
    }

    // Test method for text without currency values
    @Test
    void testNoCurrencyValues() {
        // Example text without currency values
        String text = "No currency values here!";
        // Expected output
        List<String> expectedValues = Arrays.asList();
        // Asserting the extracted currency values
        assertEquals(expectedValues, CurrencyExtractor.extractCurrencyValues(text));
    }

    // Test method for text with multiple currency formats
    @Test
    void testVariousCurrencyFormats() {
        // Example text with various formats of currency values
        String text = "Prices: $20.00, 15.75, and $100.00.";
        // Expected output
        List<String> expectedValues = Arrays.asList("$20.00", "15.75", "$100.00");
        // Asserting the extracted currency values
        assertEquals(expectedValues, CurrencyExtractor.extractCurrencyValues(text));
    }
}
