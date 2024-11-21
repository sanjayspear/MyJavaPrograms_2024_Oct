package com.java.programs.ArrayManipulation;

import java.util.HashSet;

public class DuplicateString5 {

	//This approach uses a Set to track elements we've already seen, and we print duplicates when 
	//we encounter a previously seen element.

    public static void main(String[] args) {
        String[] arr = {
            "apple", "banana", "cherry", "apple", "date",
            "fig", "banana", "grape", "apple", "date"
        };

        // Using a HashSet to track elements we've already seen
        HashSet<String> seen = new HashSet<>();
        
        for (String str : arr) {
            if (!seen.add(str)) {
                // If add() returns false, the element was already in the set (duplicate)
                System.out.println(str);
            }
        }
    }
}
