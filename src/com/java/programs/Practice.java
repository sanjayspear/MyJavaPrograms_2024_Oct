package com.java.programs;

public class Practice {

	public static void main(String[] args) {
		String s = "Sa#$nja&(y";
		String rev = "";

		StringBuffer letter = new StringBuffer();

		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			if (Character.isLetter(c)) {
				letter.append(c);
			}
		}

		int index = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isLetter(c)) {
				rev = rev + letter.charAt(index);
				index++;
			} else {
				rev = rev + c;
			}
		}
		System.out.println("Reverese of the string " + s + " is " + rev);
	}
}
