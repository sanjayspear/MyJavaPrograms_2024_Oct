package com.java.programs.recursion;

import java.util.Scanner;

public class Recursion2 {
	
	public static void printName(int m, int n, String name) {
		if(m > n) {
			return;
		}
		
		System.out.println(name);
		m++;
		printName(m, n, name);
		
	}

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("Hello buddy...!How many times you want print your desired name?");
		int max = n.nextInt();
		n.nextLine();
		System.out.println("Please input any desired name");
		String name = n.nextLine();
		
		System.out.println("Wow! you successfully printed "+name+" "+max+" times ...");
		printName(1, max, name);
		n.close();
	}

}
