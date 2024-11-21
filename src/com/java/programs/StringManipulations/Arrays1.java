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

/* 
 * In Java, when you try to print an array directly (e.g., System.out.println(arrayName);), 
 * it does not print the actual contents of the array. Instead, it prints the memory address
 * (reference) of the array object in the heap (represented as something like 
 * [Ljava.lang.String;@<hashcode>). This behavior happens because arrays do not override 
 * the toString() method from the Object class, which is what gets called by System.out.println().
 * 
 *  If you want to print the contents of the array, you need to use Arrays.toString()
 *  for a one-dimensional array. For example:
 *  
 *  System.out.println(Arrays.toString(words));

*/


