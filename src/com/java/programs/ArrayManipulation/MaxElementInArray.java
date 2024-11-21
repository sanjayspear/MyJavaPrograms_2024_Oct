package com.java.programs.ArrayManipulation;

public class MaxElementInArray {

	public static void main(String[] args) {
		int[] numbers = {10, 35, 5, 15, 20, 25};
		
		int max = findmax(numbers);
		System.out.println("The maximum number in the arrary is "+ max);
	}
	
	public static int findmax(int[] array) {
		if(array == null || array.length == 0) {
			throw new IllegalArgumentException("Array must not be null or empty");
		}
		
		int max = array[0];
		for(int num : array) {
			if(num > max) {
				max = num;
			}
		}
		
		return max;
		
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

/*
 * Algorithm: Find the Maximum Element in an Array
	1. Start.
	2. Input: An integer array numbers.
	3. Check if the array is null or empty:
	4. If true, throw an exception: "Array must not be null or empty".
	5. Initialize max to the first element of the array: max = numbers[0].
	6. Loop through each element num in the array starting from the second element:
	7. If num > max, update max to num.
	8. After the loop ends, max contains the largest element in the array.
	9. Output: Return max.
	10. End.
 * */
