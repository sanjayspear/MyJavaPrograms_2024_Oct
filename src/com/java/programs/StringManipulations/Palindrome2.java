package com.java.programs.StringManipulations;

public class Palindrome2 {

	public static void main(String[] args) {
		String s = "madam";
		int l = 0; // Left index
		int r = s.length() - 1; // Right index
		boolean isPalindrome = true;

		// Iterate while the left index is less than the right index
		while (l < r) {
			// Compare the characters at the left and right indices
			if (s.charAt(l) != s.charAt(r)) {
				isPalindrome = false;
				break; // Exit loop if characters don't match
			}
			l++; // Move left index to the right
			r--; // Move right index to the left
		}

		// Print the result based on the palindrome check
		if (isPalindrome) {
			System.out.println(s + " is a palindrome");
		} else {
			System.out.println(s + " is not a palindrome");
		}
	}

}
