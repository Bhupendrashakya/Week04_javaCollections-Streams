package com.tit.regex.advanceproblems.validateanipaddress;

import com.tit.regex.advanceproblems.validateanIPaddress.Validator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestingValidateAnIPAddress {
    // Test method for valid IP addresses
    @Test
    void testValidIPAddresses() {
        assertTrue(Validator.isValidIPAddress("192.168.0.1"));
        assertTrue(Validator.isValidIPAddress("255.255.255.255"));
        assertTrue(Validator.isValidIPAddress("0.0.0.0"));
    }

    // Test method for invalid IP addresses
    @Test
    void testInvalidIPAddresses() {
        assertFalse(Validator.isValidIPAddress("256.256.256.256")); // out of range
        assertFalse(Validator.isValidIPAddress("192.168.0")); // missing one group
        assertFalse(Validator.isValidIPAddress("192.168.0.999")); // out of range
    }
}
