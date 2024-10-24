package com.java.programs.StringManipulations;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");

		long num = sc.nextLong();

		// Approach 1: Using Algorithm

		long rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}

		System.out.println("Reverse number is: " + rev);
		sc.close();
	}

}
