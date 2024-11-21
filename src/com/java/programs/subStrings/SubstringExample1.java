package com.java.programs.subStrings;

/**
 * A simple program to demonstrate the usage of the substring method in Java.
 */
public class SubstringExample1 {

    public static void main(String[] args) {
        // Define a string for demonstration purposes.
        String str = "Hello, World!";
        
        // Prints the substring starting from index 1 to the end of the string.
        // Output: "ello, World!" (skips the first character 'H').
        System.out.println(str.substring(1));
        
        // Prints the substring starting from index 2 to the end of the string.
        // Output: "llo, World!" (skips the first two characters 'He').
        System.out.println(str.substring(2));
        
        // Prints the substring starting from index 0 (inclusive) to index 4 (exclusive).
        // Output: "Hell" (includes the first four characters).
        System.out.println(str.substring(0, 4));
    }
}
