package com.tit.regex.advanceproblems.findrepeatingwordsinsentence;

import java.util.Set;

public class FindRepeatingWordsInSentence {
    public static void main(String[] args) {
        // Example text for testing
        String text = "This is is a repeated repeated word test.";

        // Find repeating words in the text
        Set<String> repeatingWords = RepeatingWordsFinder.findRepeatingWords(text);

        // Print each repeating word
        for (String word : repeatingWords) {
            System.out.println(word);
        }
    }
}
