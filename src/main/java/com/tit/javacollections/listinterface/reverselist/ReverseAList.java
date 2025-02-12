package com.tit.javacollections.listinterface.reverselist;

// Importing necessary libraries
import org.w3c.dom.Node; // Unused import, consider removing it
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ReverseAList {

    // Method to reverse an ArrayList in place
    public static void reverseArrayList(List<Integer> list) {
        int n = list.size();
        if (n <= 0) { // Check if the list is empty
            System.out.println("List is empty!");
            return;
        }
        int i = 0, j = n - 1;

        // Loop to swap elements from both ends of the list
        for (i = 0, j = n - 1; i < n / 2; i++) {
            if (i == j) return; // If pointers meet, stop swapping
            Integer temp = list.get(i); // Temporary variable for swapping
            list.set(i, list.get(j)); // Swap elements
            list.set(j, temp);
            j--; // Move the end pointer left
        }
    }

    // Method to reverse a LinkedList and return the reversed list
    public static List<Integer> reverseLinkedList(List<Integer> list) {
        int n = list.size();

        if (list.isEmpty()) { // Check if the list is empty
            System.out.println("List is empty!");
            return list;
        }
        List<Integer> reversed = new LinkedList<>();
        // Add elements in reverse order to the new list
        for (int i = n - 1; i >= 0; i--) {
            reversed.add(list.get(i));
        }
        return reversed;
    }

    public static void main(String[] args) {
        // Sample array
        Integer[] array = {8, 4, 7, 9, 6, 3, 4, 5};

        // Create an ArrayList from the array and reverse it
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(array));
        reverseArrayList(arrayList);
        System.out.println(arrayList); // Print the reversed ArrayList

        // Create a LinkedList from the array and reverse it
        List<Integer> linkedList = new LinkedList<>(Arrays.asList(array));
        System.out.println(reverseLinkedList(linkedList)); // Print the reversed LinkedList
    }
}
