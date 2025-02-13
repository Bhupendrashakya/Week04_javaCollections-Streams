package com.tit.javacollections.setInterface.checkiftwosetsareequal;
import java.util.HashSet;
import java.util.Set;

public class CheckTwoSetsAreEqual {
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
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);

        // Check if the two sets are equal and print the result
        System.out.println(Check.check(set1, set2));
    }
}
