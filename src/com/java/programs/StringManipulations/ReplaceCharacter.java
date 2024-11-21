package com.java.programs.StringManipulations;

public class ReplaceCharacter {

    public static void main(String[] args) {
        String input = "hello world";
        char targetChar = 'l';
        char replaceChar = 'x';
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<input.length(); i++) {
        	char currentchar = input.charAt(i);
        	// NOTE: Appending: Using append() to build the new string incrementally.
        	if(currentchar == targetChar) {
        		sb.append(replaceChar);
        	}else {
        		sb.append(currentchar);
        	}
        }
        System.out.println("Modified String: "+sb);
    }
}

/*
 * Why StringBuilder is Used:
		In Java, String objects are immutable, meaning any changes to a string (like replacing 
		characters) would create a new string object. This is inefficient when performing many 
		string modifications.

		StringBuilder is used because it is mutable, meaning we can modify the string without 
		creating new objects every time, making it more memory-efficient and faster.
 * */
