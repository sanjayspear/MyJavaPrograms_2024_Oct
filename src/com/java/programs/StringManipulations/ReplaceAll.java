package com.java.programs.StringManipulations;

public class ReplaceAll {

	public static void main(String[] args) {
		// Remove Digits: Replace all digits in a string with an empty string.
				// Where, \\d: Matches any digit.
				String input1 = "My number is 123456.";
				System.out.println(input1.replaceAll("\\d", ""));
				
				// Replace Non-Alphanumeric Characters: Replace all special characters with a space.
				String input2 = "Hello@World!#2024";
				System.out.println(input2.replaceAll("[^a-zA-Z0-9]", " ")); // [^...]: Matches anything not in the brackets.
				
				// Replace Multiple Spaces: Replace multiple spaces with a single space.
				String input3 = "I    love   programming.";
				System.out.println(input3.replaceAll("\\s+", " ")); // \\s+ matches one or more space
				
				String email = "user@example.com";
				String result = email.replaceAll("(?<=.{2}).(?=.*@)", "*");
				System.out.println(result); // Output: us***@example.com
				
				/**
				 *  \\d: Matches any digit.
					\\s: Matches any whitespace character.
					\\w: Matches any word character (alphanumeric and underscore).
					[^...]: Matches anything not in the brackets.
		            .: Matches any character.
		            +: Matches one or more of the preceding token.
				 */
				
				// The key difference between replace() and replaceAll() in Java lies in their functionality 
				// and use cases. Here’s a detailed breakdown:
				
				/*
				 *1. replace()
					 - Purpose: Replaces all occurrences of a specific character or substring in a 
					   string with another character or substring.

					 - Input: Does not use regular expressions. It works only with exact character or substring
					   matches.

		             - Output: Returns a new string with all specified replacements applied.

		           Usage
		             - Simple replacements of characters or substrings.
		             - More efficient than replaceAll() for literal replacements because it doesn't process regular expressions.
		             
		         2. replaceAll()
		              - Purpose: Replaces all substrings in a string that match a given regular expression 
		                (regex) with another substring.

		              - Input: Accepts a regex pattern as the first argument.

		              - Output: Returns a new string with all replacements applied based on the regex.

		          Usage
		             - For pattern-based replacements.
		             - Handles complex string manipulations involving regex.
				 * */
	}

}
