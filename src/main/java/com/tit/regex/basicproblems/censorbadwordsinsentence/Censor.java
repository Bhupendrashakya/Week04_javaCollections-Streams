package com.tit.regex.basicproblems.censorbadwordsinsentence;

import java.util.List;

public class Censor {
    // Method to censor bad words in the given text
    public static String censorBadWords(String text, List<String> badWords) {
        // Regular expression for matching bad words
        String regex = String.join("|", badWords);
        // Replace bad words with ****
        return text.replaceAll("(?i)\\b(" + regex + ")\\b", "****");
    }
}
