package com.java.programs.subStrings;

public class FileExtension {
    public static void main(String[] args) {
        String filename = "document.pdf";
        
        int dotIndex = filename.lastIndexOf('.');
        String extension = filename.substring(dotIndex + 1);
        System.out.println("File extension: " + extension); // Output: pdf
    }
}

