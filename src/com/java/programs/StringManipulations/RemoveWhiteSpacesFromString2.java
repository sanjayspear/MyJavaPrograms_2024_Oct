package com.java.programs.StringManipulations;

public class RemoveWhiteSpacesFromString2 {

    public static void main(String[] args) {
        // Write a Java program to remove all white spaces from a string.
        
        String stringWithSpace = "The   only way to do great work is to love what you do.";
        
        // Remove all white spaces using replaceAll method with regex
        String stringWithoutSpace = stringWithSpace.replaceAll("\\s+", "");
        
        System.out.println(stringWithoutSpace);
    }
}
