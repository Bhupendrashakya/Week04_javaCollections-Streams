package com.tit.regex.advanceproblems.extractprogramminglanguagenamesfromtext;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Extractor {
    // Method to extract programming language names from the given text
    public static List<String> extractProgrammingLanguages(String text) {
        List<String> languages = new ArrayList<>();
        // Regular expression for matching programming language names (case-insensitive)
        String regex = "\\b(Java|Python|JavaScript|Go)\\b";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        // Find and add all matching programming language names to the list
        while (matcher.find()) {
            // Capitalize the matched group and add it to the list
            String language = capitalize(matcher.group());
            languages.add(language);
        }
        return languages;
    }

    // Method to capitalize the first letter of a word
    private static String capitalize(String word) {
        if (word == null || word.isEmpty()) {
            return word;
        }
        return word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
    }
}
