package com.java.programs.ArrayManipulation;

public class MinElementInArray {

	public static void main(String[] args) {
		int[] numbers = {10, 25, 5, 15, 20, 35, 1, -1};
		
		int min = findmax(numbers);
		System.out.println("The minimum number in the arrary is "+ min);
	}
	
	public static int findmax(int[] array) {
		if(array == null || array.length == 0) {
			throw new IllegalArgumentException("Array must not be null or empty");
		}
		
		int min = array[0];
		for(int num : array) {
			if(num < min) {
				min = num;
			}
		}
		
		return min;
		
	}

}

/*
 * 
If the array is {10, 25, 5, 15, 35, 20}, here’s what happens:

	First Iteration (num = 10): 10 > 10 (initial max) is false, so max remains 10.
	Second Iteration (num = 25): 25 > 10 is true, so max becomes 25.
	Third Iteration (num = 5): 5 > 25 is false, so max remains 25.
	Fourth Iteration (num = 15): 15 > 25 is false, so max remains 25.
	Fifth Iteration (num = 35): 35 > 25 is true, so max becomes 35.
	Sixth Iteration (num = 20): 20 > 35 is false, so max remains 35.
After the loop completes, max holds the value 35, which is the maximum element in the array.
 * */
