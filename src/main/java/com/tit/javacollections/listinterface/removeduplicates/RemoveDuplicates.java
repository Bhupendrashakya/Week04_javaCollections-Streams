package com.tit.javacollections.listinterface.removeduplicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {

    public static void main(String[] args) {
        // Sample array
        Integer[] array = {8, 4, 7, 9, 4, 6, 7, 3, 4, 5};

        // Create an ArrayList from the array and print it
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(array));
        System.out.println("Original List: " + arrayList);

        // Remove duplicates from the ArrayList using the remove method
        ArrayList<Integer> result = Remove.remove(arrayList);

        // Print the list after removing duplicates
        System.out.println("List after removing duplicates: " + result);
    }
}
