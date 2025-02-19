package com.tit.regex.basicproblems.censorbadwordsinsentence;

import java.util.Arrays;
import java.util.List;

public class CensorBadWordsInSentence {

    public static void main(String[] args) {
        // Example text for testing
        String text = "This is a damn bad example with some stupid words.";

        // List of bad words to censor
        List<String> badWords = Arrays.asList("damn", "stupid");

        // Censor bad words in the text
        String result = Censor.censorBadWords(text, badWords);

        // Print the result
        System.out.println(result);
    }
}
