package com.tit.javacollections.listinterface.removeduplicates;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Remove {

    // Method to remove duplicates from a list
    public static <T> ArrayList<T> remove(List<T> list) {
        // Initialize a HashSet to keep track of seen elements
        HashSet<T> seen = new HashSet<>();

        // Initialize an ArrayList to store the result without duplicates
        ArrayList<T> result = new ArrayList<>();

        // Loop through each element in the list
        for (int i = 0; i < list.size(); i++) {
            // If the element is added to the HashSet (not a duplicate)
            if (seen.add(list.get(i))) {
                // Add the element to the result list
                result.add(list.get(i));
            }
        }

        return result; // Return the list without duplicates
    }
}
