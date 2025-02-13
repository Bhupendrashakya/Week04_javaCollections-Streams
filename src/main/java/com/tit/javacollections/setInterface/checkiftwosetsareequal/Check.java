package com.tit.javacollections.setInterface.checkiftwosetsareequal;

import java.util.Set;

public class Check {

    // Generic method to check if two sets are equal
    public static <T> boolean check(Set<T> set1, Set<T> set2) {

        // Check if set2 contains all elements of set1
        if (set2.containsAll(set1)) {
            return true; // Return true if set2 contains all elements of set1
        } else {
            return false; // Return false otherwise
        }
    }
}
