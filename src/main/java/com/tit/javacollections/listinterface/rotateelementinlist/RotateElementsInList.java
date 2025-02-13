package com.tit.javacollections.listinterface.rotateelementinlist;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RotateElementsInList {

    public static void main(String[] args) {
        // Creating an object of RotateList
        RotateList rotator = new RotateList();

        // List of integers
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

        // Taking input for the number of positions to rotate
        System.out.print("Enter the number of positions to rotate:");
        Scanner sc = new Scanner(System.in);
        int positions = sc.nextInt();

        // Rotating the list by 2 positions
        List<Integer> rotatedList = rotator.rotateList(list, positions);


        // Printing the rotated list
        System.out.println("Original list: " + list);
        System.out.println("Rotated list: " + rotatedList);
    }
}


