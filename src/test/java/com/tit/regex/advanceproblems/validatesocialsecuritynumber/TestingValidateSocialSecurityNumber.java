package com.tit.regex.advanceproblems.validatesocialsecuritynumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestingValidateSocialSecurityNumber {
    // Test method for valid SSNs
    @Test
    void testValidSSNs() {
        assertTrue(Validator.isValidSSN("123-45-6789"));
        assertTrue(Validator.isValidSSN("987-65-4321"));
    }

    // Test method for invalid SSNs
    @Test
    void testInvalidSSNs() {
        assertFalse(Validator.isValidSSN("123456789")); // missing dashes
        assertFalse(Validator.isValidSSN("123-456-789")); // incorrect format
        assertFalse(Validator.isValidSSN("123-45-678")); // too short
    }
}
