package com.java.programs.recursion;

public class Recursion4 {

    // Print linearly n to 1 in reverse order using recursion
    public static void printNumber(int max, int min) {
        if (max < min) {
            return;
        }

        //Here we printed before the function call
        if (max >= min) {
            System.out.println(max);
        }

        max--;

        printNumber(max, min);
    }

    public static void main(String[] args) {
        // Start the recursion with min as 1 and max as 10
        printNumber(10, 1);
    }
}
