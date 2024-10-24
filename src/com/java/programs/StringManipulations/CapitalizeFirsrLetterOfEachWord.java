package com.java.programs.StringManipulations;

// Write a Java program to capitalize the first letter of each word in a string.

public class CapitalizeFirsrLetterOfEachWord {

	public static void main(String[] args) {
		// Input string with words to capitalize
		String inputString = "The only way to do great work is to love what you do.";

		// StringBuffer to hold the final capitalized sentence
		StringBuffer capitalizedSentence = new StringBuffer();
		StringBuffer finalResult = null; // Will store the final result after processing

		// Split the input string into an array of words using space as the delimiter
		String[] words = inputString.split(" ");

		// Loop through each word in the array
		for (String word : words) {
			// Capitalize the first letter of the word and concatenate the rest of the word
			String firstLetterCapitalized = word.toUpperCase().charAt(0) + word.substring(1);

			// Append the capitalized word and a space to the StringBuffer
			finalResult = capitalizedSentence.append(firstLetterCapitalized).append(" ");
		}

		// Print the final result, which is the sentence with capitalized words
		System.out.println(finalResult);
	}

}
