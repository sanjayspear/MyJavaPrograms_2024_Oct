package com.java.programs;

public class Palindrome {

	public static void main(String[] args) {
		String s = "madam";
		String rev="";
		for(int i=s.length()-1; i>=0; i--) {
			rev=rev+s.charAt(i);
		}
		if(s.equalsIgnoreCase(rev)) {
			System.out.println("Given String is palindrome");
		}else {
			System.out.println("Given String is not palindrome");
		}
	}

}
