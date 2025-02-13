package com.tit.javacollections.listinterface.findNthElementfromEnd;

// Importing necessary classes for testing
import com.tit.javacollections.listinterface.findtheNthelementfromEnd.FindNthElement;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindNthElementfromEnd {

    @Test // Annotation to specify this is a test method
    public void Test1() {
        // Sample array of integers
        Integer[] array = {8, 4, 7, 9, 6, 3, 4, 5};

        // Create an ArrayList from the array
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(array));

        // Find the 3rd element from the end of the list
        int result = FindNthElement.findNthElement(arrayList, 3);

        // Expected value of the 3rd element from the end
        int expected = 3;

        // Asserting that the result matches the expected value
        assertEquals(expected, result);
    }
}
