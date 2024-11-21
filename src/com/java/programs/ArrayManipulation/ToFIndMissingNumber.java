package com.java.programs.ArrayManipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToFIndMissingNumber {

	// To find and update a missing numbers from the given array
	public static void main(String[] args) {
		int[] arr = { 1, 3, 4, 6, 7, 9, 11 }; // Given array
		List<Integer> missingNumbers = new ArrayList<>();

		// Iterate through the range 1 to 11
		for (int i = 1; i <= 11; i++) {
			boolean isMissing = true;

			// Check if the number is in the given array
			for (int num : arr) {
				if (num == i) {
					isMissing = false;
					break;
				}
			}

			// If number is missing, add it to the missingNumbers list
			if (isMissing) {
				missingNumbers.add(i);
			}
		}

		// Print the missing numbers
		System.out.println("Missing numbers: " + missingNumbers);
	}
}
