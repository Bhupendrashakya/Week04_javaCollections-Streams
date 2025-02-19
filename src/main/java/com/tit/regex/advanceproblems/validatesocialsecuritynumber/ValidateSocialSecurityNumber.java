package com.tit.regex.advanceproblems.validatesocialsecuritynumber;

public class ValidateSocialSecurityNumber {
    public static void main(String[] args) {
        // Example SSNs for testing
        String[] ssns = {"123-45-6789", "123456789", "987-65-4321"};

        // Validate each SSN and print whether it is valid or invalid
        for (String ssn : ssns) {
            if (Validator.isValidSSN(ssn)) {
                System.out.println(ssn + " → Valid");
            } else {
                System.out.println(ssn + " → Invalid");
            }
        }
    }
}
