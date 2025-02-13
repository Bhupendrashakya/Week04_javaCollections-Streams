package com.tit.javacollections.setInterface.symmetricdifference;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {
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
        System.out.println(   Difference.symmetricDifference(set1,set2));
    }
}
