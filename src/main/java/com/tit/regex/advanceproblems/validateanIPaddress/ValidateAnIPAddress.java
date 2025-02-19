package com.tit.regex.advanceproblems.validateanIPaddress;

public class ValidateAnIPAddress {
    public static void main(String[] args) {
        // Example IP addresses for testing
        String[] ipAddresses = {"192.168.0.1", "255.255.255.255", "256.256.256.256", "1.45.67.89"};

        // Validate each IP address and print whether it is valid or invalid
        for (String ipAddress : ipAddresses) {
            if (Validator.isValidIPAddress(ipAddress)) {
                System.out.println(ipAddress + " → Valid");
            } else {
                System.out.println(ipAddress + " → Invalid");
            }
        }
    }
}
