package com.java.programs.recursion;

public class Recursion1 {
    static int counter = 1;  // Static variable to keep track of the current number to print

    public static void printNumber(int num) {
        // Base case: if counter exceeds num, exit the method
        if (counter > num) {
            return;  // Stop recursion if counter is greater than num
        }
        
        // Print the current value of counter
        System.out.println(counter);
        
        // Increment the counter for the next recursive call
        counter++;
        
        // Recursive call to print the next number
        printNumber(num);
    }

    public static void main(String[] args) {
        printNumber(10);  // Start the recursion with the argument 10
    }
}

/*
 * The program defines a recursive method printNumber(int num) that prints numbers from 1 up to the 
 * specified num using a static variable counter. It checks if counter exceeds num to stop recursion.
 * If not, it prints the current counter value, increments it, and calls itself again. The recursion 
 * continues until counter becomes greater than num. In the main method, printNumber(10) is invoked, 
 * resulting in the output of numbers from 1 to 10 printed sequentially.
 * */

/*
 * 1. Stack Memory in the Program:
		Stack Memory is like a stack of plates. When you add a new plate (or a new function call), 
		you put it on top of the stack. When you're done with that plate (or function), you take it 
		off the top.
		
		In your program, every time the printNumber function calls itself, it creates a new "plate" 
		(a new layer on the stack) to keep track of where it is and what it needs to do next.
		
  2. What Happens During the Recursion:
		Starting Point: You start by calling printNumber(10), which is like placing the first plate 
		on the stack.
		
		More Calls: Each time it calls itself to print the next number (like going to the next plate), 
		it keeps stacking more plates on top.
		
		Stopping: Once it reaches the point where it doesn't need to print anymore (when counter is 
		greater than 10), it starts taking the plates off one by one.
		
		Result: Finally, it prints all the numbers from 1 to 10 as it takes the plates off.
		
  3. No Heap Memory Used:
  
		Heap Memory is like a big storage room where you can keep things for a long time, like toys or 
		furniture. In this program, you're not creating any objects or long-lasting items that need to be stored in that room, so you don't use heap memory.

In Summary:

Your program mostly uses stack memory to keep track of the function calls, and it doesn’t use heap 
memory at all.
 */
