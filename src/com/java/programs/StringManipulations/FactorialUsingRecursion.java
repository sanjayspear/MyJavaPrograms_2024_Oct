package com.java.programs.StringManipulations;

public class FactorialUsingRecursion {
	/*
	 * Recursion is a process in which a function calls itself to solve a problem.
	 * The problem is divided into smaller, similar sub-problems, and the function
	 * continues to call itself until it reaches a base case, which is the simplest
	 * form of the problem that can be solved directly.
	 */

	// Factorial using Recursion
	public static int fact(int n) {
		if (n == 0) {
			return 1;
		}
		return n * fact(n - 1);

	}

	public static int factforal(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;

	}

	public static void main(String[] args) {
		int n = 5;
		System.out.println("Factoril of " + n + " is " + fact(n));

		// Factorial without using Recursion
		System.out.println("Factoril of " + n + " is " + factforal(n));

	}

}
