package com.tit.regex.basicproblems.extractdates;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Extract {
    // Precompiled pattern for extracting dates in dd/mm/yyyy format
    public static final Pattern pattern = Pattern.compile("\\b\\d{2}/\\d{2}/\\d{4}\\b");

    // Method to extract dates from the input text
    public static String extract(String input) {
        // List to store all matched dates
        List<String> dates = new ArrayList<>();

        // Create a matcher object from the input text
        Matcher matcher = pattern.matcher(input);

        // Loop through all matches found in the input text
        while (matcher.find()) {
            // Add the matched date to the list
            dates.add(matcher.group());
        }

        // Return the list of dates as a string
        return dates.toString();
    }
}
