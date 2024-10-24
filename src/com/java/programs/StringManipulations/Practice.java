package com.java.programs.StringManipulations;

public class Practice {

	public static void main(String[] args) {
		String str = "The only way to do great work is to love what you do.";
		 
		String[] word = str.split(" ");
		
		String temp = "";
		
		for(int i=0; i<word.length; i++) {
			String s = word[i].toUpperCase().charAt(0) + word[i].substring(1);
			temp = temp+s+" ";
		}
		System.out.println(temp);
	}
}
