package com.tit.javacollections.listinterface.reverselist;

// Importing necessary libraries for JUnit testing
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestingReverseAList {

    @Test // Annotation to specify this is a test method
    public void Test1() {
        // Creating an array of integers
        Integer[] array = {8, 4, 7, 9, 6, 3, 4, 5};

        // Reversing the array using the reverseLinkedList method
        List<Integer> reversedLinkedList = ReverseAList.reverseLinkedList(Arrays.asList(array));

        // Expected output list after reversing
        List<Integer> expectedList = Arrays.asList(5, 4, 3, 6, 9, 7, 4, 8);

        // Asserting that the reversed list is equal to the expected list
        assertEquals(expectedList, reversedLinkedList);
    }
}
