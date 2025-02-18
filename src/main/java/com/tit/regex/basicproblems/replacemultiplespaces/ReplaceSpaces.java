package com.tit.regex.basicproblems.replacemultiplespaces;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceSpaces {

    // Regular expression pattern to match one or more whitespace characters
    public static final String regex = "\\s+";
    // Precompiled pattern for efficiency
    public static final Pattern pattern = Pattern.compile(regex);

    // Method to replace multiple spaces with a single space
    public static String replaceSpaces(String input) {
        // Use the pattern to replace all occurrences of one or more whitespace characters with a single space
        return pattern.matcher(input).replaceAll(" ");
    }


}
