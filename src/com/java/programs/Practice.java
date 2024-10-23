package com.java.programs;

public class Practice {

	public static void main(String[] args) {
		 String str = "The only way to do great work is to love what you do.";
	        String longest = "";

	        String[] wordList = str.split(" ");

	        // Iterate through each word in the word list
	        for (int i = 0; i < wordList.length; i++) {
	            // Check if the current word is longer than the longest found so far
	            if (wordList[i].length() > longest.length()) {
	                longest = wordList[i]; // Update longest
	            }
	        }
	        System.out.println("Longest word: " + longest);
	    }
}
