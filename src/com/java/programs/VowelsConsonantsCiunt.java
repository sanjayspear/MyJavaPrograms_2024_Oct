package com.java.programs;

public class VowelsConsonantsCiunt {

	public static void main(String[] args) {
		// Initialize the input string
		String str = "Sharath Chandra";

		// Convert the string to lower case to handle case-insensitive comparison
		String s = str.toLowerCase();

		// Initialize counters for vowels and consonants
		int vowels = 0;
		int consonants = 0;

		// Iterate through each character in the string
		for (int i = 0; i < s.length(); i++) {

			// Get the current character
			char ch = s.charAt(i);

			// Check if the character is a letter
			if (Character.isLetter(ch)) {

				// Check if the character is a vowel
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowels++; // Increment the vowel counter
				} else {
					consonants++; // Increment the consonant counter
				}
			}
		}

		// Print the number of vowels
		System.out.println("Number of vowels: " + vowels);

		// Print the number of consonants
		System.out.println("Number of consonants: " + consonants);
	}

}

/*
 * Here's a summary of the above program:

	1. Character is alphabetic: The Character.isLetter(ch) ensures that only valid letters are processed.
	2. Vowel check: The program checks if the letter is one of the vowels (a, e, i, o, u).
	3. Consonant check: If the letter is not a vowel but still a valid alphabetic character, it is 
	   counted as a consonant.
 * */
