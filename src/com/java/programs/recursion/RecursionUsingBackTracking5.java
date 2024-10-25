package com.java.programs.recursion;

public class RecursionUsingBackTracking5 {
	// Backtracking method to print numbers from 1 to max
	public static void printNumbers(int current, int max) {
		/* Base case: when current reaches 0, stop the recursion
		   Without this base case, the recursion would continue indefinitely and result in a stack 
		   overflow error.
		*/
		if (current == 0) {
			return;
		}

		// First, recursively call for the previous number (backtracking)
		printNumbers(current - 1, max);

	//After recursion / function call, printed the current number (This approach defines BackTracking)
		System.out.println(current);
	}

	public static void main(String[] args) {
		// Start the recursion from 10 and it will print from 1 to 10
		printNumbers(4, 4);
	}
}
