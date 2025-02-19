package com.tit.regex.advanceproblems.extractprogramminglanguagenamesfromtext;

import java.util.List;

public class ExtractProgrammingLanguageNamesFromText {
    public static void main(String[] args) {
        // Example text for testing
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

        // Extract programming languages from the text
        List<String> languages = Extractor.extractProgrammingLanguages(text);

        // Print each extracted programming language name
        for (String language : languages) {
            System.out.println(language);
        }
    }
}
