package com.tit.javacollections.setinterface.symmetricdifference;

import com.tit.javacollections.setInterface.symmetricdifference.Difference;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestingSymmetricDifference {
    @Test
    public void Test1() {
        // Create two sets of integers
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Add elements to set1
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        // Add elements to set2
        set2.add(9);
        set2.add(24);
        set2.add(3);
        set2.add(477);
        set2.add(577);

        // Expected result after finding symmetric difference
        Set<Integer> expected = Set.of(1, 577, 2, 4, 5, 24, 9, 477);

        // Calculate the symmetric difference using the Difference class
        Set<Integer> result = Difference.symmetricDifference(set1, set2);

        // Assert that the expected result matches the actual result
        assertEquals(expected, result);

        // Print a message indicating the test is successful
        System.out.println("Test1 is finished successfully");
    }
}
