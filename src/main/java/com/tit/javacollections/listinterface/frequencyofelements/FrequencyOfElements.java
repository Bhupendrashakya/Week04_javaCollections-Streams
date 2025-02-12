package com.tit.javacollections.listinterface.frequencyofelements;

import java.util.*;

public class FrequencyOfElements {

    // Method to calculate the frequency of each element in the list
    public static Map<String, Integer> frequency(List<String> list) {
        // Initialize a map to store the frequency of each element
        Map<String, Integer> map = new HashMap<>();

        // Loop through each element in the list
        for (int j = 0; j < list.size(); j++) {
            Integer counter = 0; // Counter to count occurrences of the element
            String element = list.get(j); // Get the current element

            // Inner loop to count occurrences of the current element
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).equalsIgnoreCase(element)) {
                    counter++; // Increment counter if the element matches
                }
            }

            // Add the element and its frequency to the map
            map.put(element, counter);
        }

        return map; // Return the map with frequencies
    }

    public static void main(String[] args) {
        // Create an array of strings
        String[] array = {"apple", "banana", "apple", "orange"};

        // Convert the array to a list
        List<String> list1 = new ArrayList<>(Arrays.asList(array));

        // Calculate and print the frequency of each element in the list
        System.out.println(frequency(list1));
    }
}
