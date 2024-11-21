package com.java.programs.ArrayManipulation;

import java.util.Arrays;

public class DuplicateString4 {
//This approach sorts the array first and then compares adjacent elements to detect duplicates.

	public static void main(String[] args) {
		String[] arr = { "apple", "banana", "cherry", "apple", "date", "fig", "banana", "grape", "apple", "date" };

		// Sort the array first
		Arrays.sort(arr);

		// Compare adjacent elements to find duplicates
		for (int i = 1; i < arr.length; i++) {
			if (arr[i].equals(arr[i - 1])) {
				// Print only the first occurrence of a duplicate
				if (i == 1 || !arr[i].equals(arr[i - 2])) {
					System.out.println(arr[i]);
				}
			}
		}
	}
}
