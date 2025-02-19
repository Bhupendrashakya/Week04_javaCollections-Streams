package com.tit.readalargefilelinebyline;

public class LargeFileReaderSimulation {
    public static void main(String[] args) {
        // Creating an object of LargeFileReader
        LargeFileReader fileReader = new LargeFileReader();

        // File path to read
        String filePath = "src/main/resources/TextFile.txt";

        // Reading the file and printing lines containing "error"
        fileReader.readFileAndPrintErrorLines(filePath);
    }


}
