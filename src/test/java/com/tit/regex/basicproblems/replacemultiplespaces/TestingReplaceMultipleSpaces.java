package com.tit.regex.basicproblems.replacemultiplespaces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestingReplaceMultipleSpaces {

    @Test
    public void test() {
        // Input text containing multiple spaces
        String input = "This  is  an  example  with  multiple  spaces.";

        // Call the replaceSpaces method and store the result
        String result = ReplaceSpaces.replaceSpaces(input);

        // Expected result after replacing multiple spaces with a single space
        String expected = "This is an example with multiple spaces.";

        // Assert that the result matches the expected value
        assertEquals(expected, result);

        // Printing test success message
        System.out.println("Test is successful");
    }
}
