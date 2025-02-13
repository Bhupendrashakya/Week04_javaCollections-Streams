package com.tit.javacollections.setInterface.unionandintersectionoftwosets;

import java.util.*;

public class UnionandIntersectionofTwoSets {
    public static void main(String[] args) {
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

        // Call the union method and print the result
        Set<Integer> union = UnionAndIntersection.union(set1, set2);
        System.out.println(union);

        // Call the intersection method and print the result
        Set<Integer> intersection = UnionAndIntersection.intersection(set1, set2);
        System.out.println(intersection);
    }
}
