package com.java.programs.ArrayManipulation;

public class DuplicateString1 {

	public static void main(String[] args) {
		String[] arr = { "apple", "banana", "cherry", "apple", "date", "fig", "banana", "grape", "apple", "date" };

		// Outer loop to check each string in the array
		for (int i = 0; i < arr.length; i++) {
			// Check if the current element has already been printed
			boolean alreadyPrinted = false;

			// Check if the current element is a duplicate
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					if (!alreadyPrinted) {
						// Print the first time we encounter a duplicate
						System.out.println(arr[i]);
						alreadyPrinted = true; // Mark that we have printed this string
					}
					break; // No need to check further once the duplicate is found
				}
			}
		}
	}

}
