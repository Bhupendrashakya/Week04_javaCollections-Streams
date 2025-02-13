package com.tit.javacollections.listinterface.findtheNthelementfromEnd;

import java.util.ArrayList;
import java.util.List;

public class FindNthElement {

    // Method to find the Nth element from the end of the list
    public static <T> T findNthElement(List<T> list, int n) {
        // Return the element at the position (size - n) from the list
        return list.get(list.size() - n);
    }
}
