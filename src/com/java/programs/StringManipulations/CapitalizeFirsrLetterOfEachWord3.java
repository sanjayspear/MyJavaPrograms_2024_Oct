package com.java.programs.StringManipulations;

public class CapitalizeFirsrLetterOfEachWord3 {

	public static void main(String[] args) {
		String str = "The only way to do great work is to love what you do.";
		String result = "";
		
		String[] arr = str.split(" ");
		
		for(String s : arr) {
			result = result +" "+  s.toUpperCase().charAt(0) + s.substring(1);
		}
		System.out.println(result);
	}

}
