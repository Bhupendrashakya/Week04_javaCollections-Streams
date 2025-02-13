package com.tit.javacollections.setInterface.symmetricdifference;

import java.util.HashSet;
import java.util.Set;

public class Difference {
    public static <T> Set<T> symmetricDifference(Set<T> set1, Set<T> set2) {
        Set<T> symmetricDifference = new HashSet<>(set1); // Create a new set for the symmetric difference result

        for (T element : set2) {
            if (symmetricDifference.contains(element)) {
                symmetricDifference.remove(element); // Remove element if it is already in the set
            } else {
                symmetricDifference.add(element); // Add element if it is not in the set
            }
        }

        return symmetricDifference; // Return the set containing the symmetric difference of set1 and set2
    }

}
