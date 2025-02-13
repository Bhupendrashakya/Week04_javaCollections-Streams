package com.tit.javacollections.listinterface.removeduplicates;

// Importing necessary classes for testing
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestingRemoveDuplicate {

    @Test // Annotation to specify this is a test method
    public void Test1() {
        // Sample array with duplicates
        Integer[] array = {8, 4, 7, 9, 4, 6, 7, 3, 4, 5};

        // Expected array without duplicates
        Integer[] array2 = {8, 4, 7, 9, 6, 3, 5};

        // Convert the sample array to a list
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(array));

        // Remove duplicates from the list
        ArrayList<Integer> result = Remove.remove(arrayList);

        // Convert the expected array to a list
        List<Integer> expected = new ArrayList<>(Arrays.asList(array2));

        // Asserting that the result list is equal to the expected list
        assertEquals(expected, result);
    }
}
