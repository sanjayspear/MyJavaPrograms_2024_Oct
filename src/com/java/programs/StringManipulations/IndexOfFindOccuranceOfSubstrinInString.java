package com.java.programs.StringManipulations;

public class IndexOfFindOccuranceOfSubstrinInString {

    public static void main(String[] args) {
    	String s = "mssissippi";
        String subString = "i";
        
        int count = 0;
        int index = 0;

        // Find the first occurrence of the substring
        index = s.indexOf(subString, index);
        
        while(index != -1) {
            count++;  // Increment the count for each occurrence
            // Move index to the next character after the found substring
            index = s.indexOf(subString, index + 1);  // Find the next occurrence
        }
        
        System.out.println("Occurrences of '" + subString + "': " + count);
    }
}
