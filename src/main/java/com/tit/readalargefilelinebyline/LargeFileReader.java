package com.tit.readalargefilelinebyline;

import java.io.*;


public class LargeFileReader {
    // Method to read a file line by line and print lines containing the word "error"
    public void readFileAndPrintErrorLines(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
