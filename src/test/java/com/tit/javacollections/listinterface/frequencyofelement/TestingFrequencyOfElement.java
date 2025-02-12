package com.tit.javacollections.listinterface.frequencyofelement;

// Importing necessary classes for testing
import com.tit.javacollections.listinterface.frequencyofelements.FrequencyOfElements;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestingFrequencyOfElement {

    @Test // Annotation to specify this is a test method
    public void Test1() {
        // Creating an array of strings
        String[] array = {"apple", "banana", "apple", "orange"};

        // Convert the array to a list and calculate the frequency of each element
        Map<String, Integer> map = FrequencyOfElements.frequency(Arrays.asList(array));

        // Creating an expected map with the correct frequencies
        Map<String, Integer> expectedMap = new HashMap<>();
        expectedMap.put("apple", 2); // "apple" appears 2 times
        expectedMap.put("banana", 1); // "banana" appears 1 time
        expectedMap.put("orange", 1); // "orange" appears 1 time

        // Asserting that the calculated frequencies match the expected frequencies
        assertEquals(expectedMap, map);
    }
}
