package com.java.programs.recursion;

//sum or summation of n natural numbers
public class RecursionSumOfFirstNnumbers6 {
    // Method to calculate the sum of the first n natural numbers
    public static int sum(int num) {
        // Base case: if num is 0, return 0
        if (num == 0) {
            return 0;
        }
        // Recursive case: return num + sum of (num - 1)
        return num + sum(num - 1);
    }

    public static void main(String[] args) {
        int result = sum(5); // Calculate the sum of the first 5 natural numbers
        System.out.println("Sum of first 5 numbers: " + result); // Output the result
    }
}
