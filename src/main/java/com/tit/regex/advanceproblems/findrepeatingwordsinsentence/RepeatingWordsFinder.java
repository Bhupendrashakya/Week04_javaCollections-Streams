package com.tit.regex.advanceproblems.findrepeatingwordsinsentence;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepeatingWordsFinder {
    // Method to find repeating words in the given text
    public static Set<String> findRepeatingWords(String text) {
        Set<String> repeatingWords = new HashSet<>();
        // Regular expression for finding repeating words
        String regex = "\\b(\\w+)\\b(?=.*\\b\\1\\b)";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        // Find and add repeating words to the set
        while (matcher.find()) {
            repeatingWords.add(matcher.group(1).toLowerCase());
        }
        return repeatingWords;
    }
}
