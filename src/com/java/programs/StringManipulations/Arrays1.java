package com.java.programs.StringManipulations;

import java.util.Arrays;

public class Arrays1 {

	public static void main(String[] args) {
		String str = "The only way to do great work is to love what you do.";

		String[] wordList = str.split(" ");
		
        // Option 1: Use Arrays.toString() to print the array
		System.out.println(Arrays.toString(wordList));
		
		for(String s : wordList) {
			System.out.println(s);
		}
	}

}

//Note: From step number 13 if you do not convert from array to string then simply prints its 
//memory address, not the actual contents of the array.
