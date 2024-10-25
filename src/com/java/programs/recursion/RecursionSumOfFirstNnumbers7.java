package com.java.programs.recursion;

//sum or summation of n natural numbers
public class RecursionSumOfFirstNnumbers7 {
    // Variable to hold the sum
    private static int totalSum = 0;

    // Method to calculate the sum of the first n natural numbers
    public static void sum(int num) {
        // Base case: if num is 0, print the total sum and return
        if (num == 0) {
            System.out.println("Sum of first n numbers: " + totalSum);
            return;
        }
        // Add the current number to the total sum
        totalSum += num;
        // Recursive call to the next number
        sum(num - 1);
    }

    public static void main(String[] args) {
        sum(5); // Print the sum of the first 5 natural numbers
    }
}
