package com.tit.regex.basicproblems.extractallcapitalizedwordsfromsentence;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Extract {
    // Regular expression pattern for extracting capitalized words
    private static final String PATTERN = "\\b[A-Z][a-z]*\\b";

    // Precompiled pattern for efficiency
    private static final Pattern pattern = Pattern.compile(PATTERN);

    public static String extractCapitalizedWords(String input) {
        List<String> words=new ArrayList<>();
        // Create a matcher object from the input text
        Matcher matcher = pattern.matcher(input);

        // Loop through all matches found in the input text
        while (matcher.find()) {
            // Print the matched capitalized word
           words.add(matcher.group());
        }
        return words.toString();
    }
}
