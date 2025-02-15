package com.tit.filehandeling;

import java.util.*;

public class FileCopySimulation {
    public static void main(String[] args)
    {
        // Creating an object of FileHandler
        FileHandler fileHandler = new FileHandler();

        // Source and destination file paths
        String sourceFile = "src/main/resources/TextFile.txt";
        String destinationFile = "src/main/resources/CopiedTextFile.txt";

        // Copying the file
        fileHandler.copyFile(sourceFile, destinationFile);
    }

}
