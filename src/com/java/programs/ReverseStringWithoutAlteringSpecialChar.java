package com.java.programs;

public class ReverseStringWithoutAlteringSpecialChar {

    public static void main(String[] args) {
        String s = "@#$Sanjay";
        String rev = "";
        
        // To store the letters in reverse order
        StringBuilder letters = new StringBuilder();

        // Loop through the original string to collect letters
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i); // Get character from original string
            if (Character.isLetter(c)) {
                letters.append(c); // Append letter to StringBuilder
            }
        }

        // Build the final reversed string, maintaining special characters
        int letterIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                rev += letters.charAt(letterIndex); // Replace letter with reversed letter
                letterIndex++;
            } else {
                rev += c; // Keep special characters in place
            }
        }

        System.out.println(rev); // Output the result
    }
}