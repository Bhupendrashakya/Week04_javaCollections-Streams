package com.tit.javacollections.setInterface.unionandintersectionoftwosets;

import java.util.*;

public class UnionAndIntersection {

    // Method to compute the union of two sets
    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        // Create a new set for the union result
        Set<Integer> union = new HashSet<>();
        // Add all elements from set1 to the union set
        union.addAll(set1);
        // Add all elements from set2 to the union set
        union.addAll(set2);
        // Return the set containing the union of set1 and set2
        return union;
    }

    // Method to compute the intersection of two sets
    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
        // Convert set2 to an array
        Integer[] array = set2.toArray(new Integer[0]);
        // Create a new set for the intersection result
        Set<Integer> intersection = new HashSet<>();
        // Iterate through the elements of set2 and check if they are in set1
        for (Integer element : set2) {
            // If the element is present in set1, add it to the intersection set
            if (set1.contains(element)) {
                intersection.add(element);
            }
        }
        // Return the set containing the intersection of set1 and set2
        return intersection;
    }
}
