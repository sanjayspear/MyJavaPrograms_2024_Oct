package com.java.programs;

public class ReverseString2 {

	public static void main(String[] args) {
		String s = "#$%Sanjay";
		StringBuilder rev = new StringBuilder();

		StringBuilder letter = new StringBuilder();

		// Collect the alphabetic characters in reverse order
		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			if (Character.isLetter(c)) {
				letter.append(c);
			}
		}

		int index = 0;
		// Rebuild the string with letters in reverse and special characters intact
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isLetter(c)) {
				rev.append(letter.charAt(index));
				index++;
			} else {
				rev.append(c);
			}
		}
		System.out.println("Reversed string: " + rev.toString());
	}

}
