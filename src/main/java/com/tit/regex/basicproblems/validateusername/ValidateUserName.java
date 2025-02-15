package com.tit.regex.basicproblems.validateusername;
public class ValidateUserName {
    public static void main(String[] args) {
        // Example Inputs & Outputs
        System.out.println(Validate.validateUsername("user_123"));  // Valid
        System.out.println(Validate.validateUsername("123user"));   // Invalid (starts with a number)
        System.out.println(Validate.validateUsername("us"));        // Invalid (too short)
    }
}
