package com.java.programs.StringManipulations;

public class OccurrenceOfSubStringWithoutUsingIndexOf {

    public static void main(String[] args) {
        String s = "mssissippi";
        char subString = 's';
        int count = 0;
        
        int size = s.length();
        
        // Loop through each character of the string
        for (int i = 0; i < size; i++) {
            // Check if the current character matches the substring
            if (s.charAt(i) == subString) {
                count++;  // Increment count if it matches
            }
        }
        
        System.out.println("Number of occurrences of '" + subString + "' is " + count);
    }
}

/*
 * The approach using a simple loop to count occurrences of a character is indeed more straightforward
 * and easier to understand for many programmers, especially those who are newer to Java or programming
 * in general. Ultimately, the best approach depends on the specific requirements of the problem you 
 * are solving and your personal or team's coding style preferences.
 * */
