package com.tit.javacollections.setinterface.checkiftwosetsareequal;

import com.tit.javacollections.setInterface.checkiftwosetsareequal.Check;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestingCheckTwoSeysAreEqual {

    @Test
    public void Test1() {
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

        // Check if the two sets are equal using the Check class
        boolean result = Check.check(set1, set2);
        boolean expected = true;

        // Assert that the result is as expected
        assertEquals(expected, result);
    }

}
