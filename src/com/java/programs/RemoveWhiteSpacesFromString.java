package com.java.programs;

public class RemoveWhiteSpacesFromString {

	public static void main(String[] args) {
		// Write a Java program to remove all white spaces from a string.
		
		String stringWithSpace = "The only way to do great work is to love what you do.";
		String stringWithoutSpace = "";
		
		String[] arr = stringWithSpace.split(" ");
		
		for(int i=0; i<arr.length; i++) {
		    String s = arr[i];
		    stringWithoutSpace+=s;
		}
		
		System.out.println(stringWithoutSpace);
	}

}

/*
 * NOTE: The provided Java program to remove all white spaces from a string has a fundamental logic
 *  	 that works, but it can be simplified. The current implementation splits the string by spaces, 
 *  	 then concatenates the parts back together without spaces, which is valid. However, it might not 
 *  	 handle multiple spaces between words effectively. So refer the program RemoveWhiteSpacesFromString2 
 *       which uses regular expression and This approach is more efficient because it does not involve 
 *       creating multiple intermediate strings during the split and concatenation process.
 *  */
