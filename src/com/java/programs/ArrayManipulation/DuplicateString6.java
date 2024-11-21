package com.java.programs.ArrayManipulation;

import java.util.ArrayList;
import java.util.List;

public class DuplicateString6 {

	// This approach uses a List to track seen elements and uses the contains() method to detect 
	// duplicates.

    public static void main(String[] args) {
        String[] arr = {
            "apple", "banana", "cherry", "apple", "date",
            "fig", "banana", "grape", "apple", "date"
        };

        // List to track seen elements
        List<String> seen = new ArrayList<>();
        
        for (String str : arr) {
            // Check if the string is already in the list of seen strings
            if (seen.contains(str)) {
                System.out.println(str);
            } else {
                // Add the string to the seen list
                seen.add(str);
            }
        }
    }
}
