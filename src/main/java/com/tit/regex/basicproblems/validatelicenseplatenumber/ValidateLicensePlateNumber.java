package com.tit.regex.basicproblems.validatelicenseplatenumber;



public class ValidateLicensePlateNumber {

    public static void main(String[] args) {
        // Example Inputs & Outputs
        System.out.println(Validate.validateNumberPlate("user_123"));  // Invalid
        System.out.println(Validate.validateNumberPlate("2285MP"));        // Invalid
        System.out.println(Validate.validateNumberPlate("MP2285"));   // Valid
    }


}
