package com.tit.regex.basicproblems.validateusername;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestingValidateUsername {

    // Test case 1: Valid username
    @Test
    public void Test1() {
        String expected = "Valid";
        String result = Validate.validateUsername("user_123");
        System.out.println("Test1 is Successful");
        assertEquals(expected, result);
    }

    // Test case 2: Invalid username (starts with a number)
    @Test
    public void Test2() {
        String expected = "Invalid";
        String result = Validate.validateUsername("123user");
        System.out.println("Test2 is Successful");
        assertEquals(expected, result);
    }

    // Test case 3: Invalid username (too short)
    @Test
    public void Test3() {
        String expected = "Invalid";
        String result = Validate.validateUsername("us");
        System.out.println("Test3 is Successful");
        assertEquals(expected, result);
    }
}
