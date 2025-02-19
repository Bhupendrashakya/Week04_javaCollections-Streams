package com.tit.countwordsinfile;

public class WordCounterSimulation {
    public static void main(String[] args) {
        // Creating an object of WordCounter
        WordCounter wordCounter = new WordCounter();

        // File path to read
        String filePath = "src/main/resources/TextFile.txt";

        // Counting words and displaying the top 5 most frequent words
        wordCounter.countWordsAndDisplayTop5(filePath);
    }

}
