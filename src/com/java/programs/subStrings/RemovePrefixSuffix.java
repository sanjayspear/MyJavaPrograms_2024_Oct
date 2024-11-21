package com.java.programs.subStrings;

public class RemovePrefixSuffix {
    public static void main(String[] args) {
        String str = "unhappy";
        
        // Remove prefix "un"
        String noPrefix = str.substring(2);
        System.out.println("After removing prefix: " + noPrefix); // Output: happy
        
        // Remove suffix "py"
        String noSuffix = str.substring(0, str.length() - 2);
        System.out.println("After removing suffix: " + noSuffix); // Output: unhapp
    }
}

