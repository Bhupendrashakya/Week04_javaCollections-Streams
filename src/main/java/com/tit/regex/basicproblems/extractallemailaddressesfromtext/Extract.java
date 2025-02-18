package com.tit.regex.basicproblems.extractallemailaddressesfromtext;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Extract {

    // Regular expression pattern for email address validation
    private static final String PATTERN = "[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}";

    // Precompiled pattern for efficiency
    private static final Pattern pattern = Pattern.compile(PATTERN);

    // Method to extract email addresses from the input text
    public static String  extractEmail(String input) {
        List<String> match=new ArrayList<>();
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
           match.add(matcher.group());
        }
        return match.toString();
    }
}
