package com.java.programs.ArrayManipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeMissingNumberToActaulArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 7, 9, 11}; // Original array
        List<Integer> missingNumbers = new ArrayList<>();

        // Find missing numbers
        for (int i = 1; i <= 11; i++) {
            if (!contains(arr, i)) {
                missingNumbers.add(i);
            }
        }

        // Convert the collection (List<Integer>) to a normal array
        int[] missingArray = missingNumbers.stream().mapToInt(Integer::intValue).toArray();

        // Merge both arrays
        int[] mergedArray = mergeArrays(arr, missingArray);

        // Sort the merged array
        Arrays.sort(mergedArray);

        // Print the results
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Missing Array: " + Arrays.toString(missingArray));
        System.out.println("Sorted Merged Array: " + Arrays.toString(mergedArray));
    }

    // Helper method to check if an element exists in the array
    private static boolean contains(int[] arr, int value) {
        for (int num : arr) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }

    // Method to merge two arrays
    private static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];

        // Copy first array
        System.arraycopy(arr1, 0, result, 0, arr1.length);

        // Copy second array
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);

        return result;
    }
}


