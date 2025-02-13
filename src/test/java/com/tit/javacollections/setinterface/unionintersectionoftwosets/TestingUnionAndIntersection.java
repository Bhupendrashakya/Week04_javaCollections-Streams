package com.tit.javacollections.setinterface.unionintersectionoftwosets;

import com.tit.javacollections.setInterface.unionandintersectionoftwosets.UnionAndIntersection;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestingUnionAndIntersection {

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

        // Expected result of the union of set1 and set2
        Set<Integer> expected = new HashSet<>(Arrays.asList(1, 577, 2, 3, 4, 5, 24, 9, 477));

        // Call the union method and get the result
        Set<Integer> result = UnionAndIntersection.union(set1, set2);

        // Assert that the result is as expected
        assertEquals(expected, result);
        System.out.println("Test1 of union is successful!");
    }

    @Test
    public void Test2() {
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

        // Expected result of the intersection of set1 and set2
        Set<Integer> expected = new HashSet<>(Arrays.asList(3));

        // Call the intersection method and get the result
        Set<Integer> result = UnionAndIntersection.intersection(set1, set2);

        // Assert that the result is as expected
        assertEquals(expected, result);
        System.out.println("Test2 of intersection is successful!");
    }
}
