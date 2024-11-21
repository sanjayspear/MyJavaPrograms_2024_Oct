package com.java.programs.recursion;

public class Factorial {
	
	static int fact(int n) {
		if(n == 0) {
			return 1;
		}
		
		return fact(n - 1) * n;
	}

	public static void main(String[] args) {
		// 5! = 5 * 4 * 3 * 2 * 1 = 120
		int fact = fact(5);
		System.out.println(fact);
	}
}
