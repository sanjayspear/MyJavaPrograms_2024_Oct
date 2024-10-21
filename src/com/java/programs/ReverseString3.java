package com.java.programs;

/*
 * To reverse a string using an array without altering special characters, we can follow this approach:

		1. Convert the string into a character array.
		2. Use two pointers: one starting at the beginning and the other at the end.
		3. Swap the alphabetic characters while skipping the special characters.
		4. Continue swapping until the two pointers meet.
 * */

public class ReverseString3 {

	public static void main(String[] args) {
		String s = "!@#Sanjay";

		// Convert the string to a character array
		char[] arr = s.toCharArray();

		int left = 0; // Left Pointer
		int right = arr.length - 1; // Right Pointer

		// Loop to reverse the string by swapping only alphabetic characters
		while (left < right) {
			// Skip non-alphabetic characters on the left
			if (!Character.isLetter(arr[left])) {
				left++;
			}
			// Skip non-alphabetic characters on the right
			else if (Character.isLetter(arr[right])) {
				right--;
			}
			// Both arr[left] and arr[right] are letters, swap them
			else {
				char temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}

		// Convert the character array back to a string
		String reversedString = new String(arr);
		System.out.println("Reversed string: " + reversedString);
	}

}
