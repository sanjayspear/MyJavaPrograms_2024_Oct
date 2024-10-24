package com.java.programs.StringManipulations;

public class ReverseString {

	public static void main(String[] args) {

		// Approach 1 ==> But Inefficient
		String revStr = "";
		String s = "Sanjay";
		for (int i = s.length() - 1; i >= 0; i--) {
			revStr = revStr + s.charAt(i);
		}
		System.out.println("Reverse of the string " + s + " is " + revStr);

		// Approach 2
		StringBuilder revStr1 = new StringBuilder();

		for (int i = s.length() - 1; i >= 0; i--) {
			revStr1.append(s.charAt(i));
		}

		System.out.println("Reverse of the string " + s + " is " + revStr);

		// Approach 3:
		// Alternatively, using StringBuilder's built-in reverse() method simplifies the
		// task:

		String revStr2 = new StringBuilder(s).reverse().toString();

		System.out.println("Reverse of the string " + s + " is " + revStr2);
	}

}
