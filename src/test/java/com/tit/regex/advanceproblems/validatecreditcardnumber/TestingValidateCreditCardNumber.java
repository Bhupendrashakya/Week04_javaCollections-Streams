package com.tit.regex.advanceproblems.validatecreditcardnumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestingValidateCreditCardNumber {
    // Test method for valid Visa card numbers
    @Test
    void testValidVisaCardNumbers() {
        assertTrue(Validator.isValidCreditCard("4111111111111111"));
        assertTrue(Validator.isValidCreditCard("4012888888881881"));
    }

    // Test method for valid MasterCard card numbers
    @Test
    void testValidMasterCardNumbers() {
        assertTrue(Validator.isValidCreditCard("5111111111111111"));
        assertTrue(Validator.isValidCreditCard("5212345678901234"));
    }

    // Test method for invalid credit card numbers
    @Test
    void testInvalidCreditCardNumbers() {
        assertFalse(Validator.isValidCreditCard("6111111111111111")); // starts with 6
        assertFalse(Validator.isValidCreditCard("411111111111")); // too short
        assertFalse(Validator.isValidCreditCard("51111111111111111")); // too long
    }
}
