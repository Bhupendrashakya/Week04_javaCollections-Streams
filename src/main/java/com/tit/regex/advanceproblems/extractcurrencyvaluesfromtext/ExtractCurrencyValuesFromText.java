package com.tit.regex.advanceproblems.extractcurrencyvaluesfromtext;

import java.util.List;

public class ExtractCurrencyValuesFromText {
    public static void main(String[] args) {
        // Example text for testing
        String text = "The price is $45.99, and the discount is 10.50.";

        // Extract currency values from the text
        List<String> values = CurrencyExtractor.extractCurrencyValues(text);

        // Print each extracted currency value
        for (String value : values) {
            System.out.println(value);
        }
    }
}
