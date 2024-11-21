package com.java.programs.ArrayManipulation;

public class DuplicateString2 {

	//In this approach, we use the indexOf() method to check if an element appears again after its 
	//first occurrence.

    public static void main(String[] args) {
        String[] arr = {
            "apple", "banana", "cherry", "apple", "date",
            "fig", "banana", "grape", "apple", "date"
        };

        // Outer loop to go through each element
        for (int i = 0; i < arr.length; i++) {
            // Skip if the element has already been printed
            if (i != indexOf(arr, arr[i])) {
                continue;
            }
            
            // Find duplicates
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    System.out.println(arr[i]);
                    break; // Break when we find the first duplicate
                }
            }
        }
    }

    // Custom function to get index of first occurrence of an element
    public static int indexOf(String[] arr, String element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(element)) {
                return i;
            }
        }
        return -1; // Element not found
    }
}
