package com.java.programs.StringManipulations;

public class IndexOf {

    public static void main(String[] args) {
        String s = "mssissippi";

        // Use indexOf() again to find the target substring's position within the extracted main substring.
        // index starts at 0, meaning the search begins from the start of the string.
        // When no more occurrences are found, indexOf returns -1, causing the loop to terminate.
        System.out.println(s.indexOf("z", 0)); // -1
        System.out.println(s.indexOf("a", 0)); // -1
        
        //When the substring is found, index is updated to the starting position of that occurrence.
        System.out.println(s.indexOf("m", 0)); // 0
        System.out.println(s.indexOf("s", 0)); // 1
        System.out.println(s.indexOf("i", 5)); // 6
        System.out.println(s.indexOf("p", 8)); // 7
        
    }
}
