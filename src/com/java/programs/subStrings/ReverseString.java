package com.java.programs.subStrings;

public class ReverseString {

	public static void main(String[] args) {
		String s = "Sanjay";
		String reversed = "";
		
		for(int i = s.length(); i>0; i--) {
			reversed = reversed + s.substring(i-1, i);
			System.out.println(reversed);

		}
	}

}
