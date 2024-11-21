package com.java.programs.ArrayManipulation;

import java.util.HashMap;

public class DuplicateString3 {

	//This approach uses a HashMap to count occurrences of each element and print the ones that
	//appear more than once.
    public static void main(String[] args) {
        String[] arr = {
            "apple", "banana", "cherry", "apple", "date",
            "fig", "banana", "grape", "apple", "date"
        };

        // Using a HashMap to count occurrences of each element
        HashMap<String, Integer> map = new HashMap<>();

        // Count occurrences
        for (String str : arr) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        // Print elements that have more than one occurrence
        for (String key : map.keySet()) {
            if (map.get(key) > 1) {
                System.out.println(key);
            }
        }
    }
}
