package com.tit.regex.basicproblems.extractlinksfromwebpage;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLink {

    // Regular expression pattern for extracting URLs
    // This pattern matches URLs that start with http or https, optionally include www,
    public static final String regex = "\\bhttps?://(www\\.)?[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}\\b";

    // Precompiled pattern for efficiency
    public static final Pattern pattern = Pattern.compile(regex);

    // Method to extract URLs from the input text
    public static String extract(String input) {
        // List to store all matched URLs
        List<String> links = new ArrayList<>();

        // Creating a matcher object from the input text
        Matcher matcher = pattern.matcher(input);

        // Loop through all matches found in the input text
        while (matcher.find()) {
            // Adding the matched URL to the list
            links.add(matcher.group());
        }

        // Return the list of URLs as a string
        return links.toString();
    }
}
