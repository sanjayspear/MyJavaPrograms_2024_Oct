package com.java.programs.recursion;

public class Recursion3 {

    // Print linearly 1 to 10 using recursion
    public static void printNumber(int min, int max) {
        // Base case: if min is greater than max, exit the method
        if (min > max) {
            return;
        }

        // Print the current value of min
        if (min <= max) {
            System.out.println(min);
        }

        // Increment min for the next recursive call
        min++;

        // Recursive call with the incremented value of min
        printNumber(min, max);
    }

    public static void main(String[] args) {
        // Start the recursion with min as 1 and max as 10
        printNumber(1, 10);
    }
}
