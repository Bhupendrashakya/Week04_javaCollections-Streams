package com.tit.regex.advanceproblems.validatecreditcardnumber;

import java.util.regex.Pattern;

public class Validator {
    // Method to validate the credit card number based on the given criteria
    public static boolean isValidCreditCard(String cardNumber) {
        // Regular expression for validating Visa and MasterCard numbers
        String visaRegex = "^4[0-9]{15}$";
        String masterCardRegex = "^5[1-5][0-9]{14}$";

        // Return whether the card number matches either Visa or MasterCard regular expression
        return Pattern.matches(visaRegex, cardNumber) || Pattern.matches(masterCardRegex, cardNumber);
    }
}
