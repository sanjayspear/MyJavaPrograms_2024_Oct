package com.java.programs.StringManipulations;

public class SwappingTwoNumbers {

    public static void main(String[] args) {
        /*
         * Approach 1: Swapping using a third variable
         * 
         * In this method, we use a temporary variable to hold one value
         * during the swap process. It is the simplest and most commonly
         * used method to swap two numbers.
         * 
         * Example:
         * A = 100, B = 200
         * temp = A
         * A = B
         * B = temp
         * 
         * After swap: A = 200, B = 100
         */
        System.out.println("===================Approach 1 using 3rd variable===================");
        int A = 100;
        int B = 200;
        System.out.println("Before swapping the value of A is " + A + " Value of B is " + B);
        int temp;
        temp = A;
        A = B;
        B = temp;
        System.out.println("After swapping the value of A is " + A + " Value of B is " + B);

        /*
         * Approach 2: Swapping without using a third variable (using addition and subtraction)
         * 
         * This method uses arithmetic operations to swap values without needing
         * an extra variable. It works by first adding the two numbers, then
         * subtracting one from the result to get the original value of the other.
         * 
         * Example:
         * X = 400, Y = 600
         * X = X + Y;  // X = 1000
         * Y = X - Y;  // Y = 400
         * X = X - Y;  // X = 600
         * 
         * After swap: X = 600, Y = 400
         */
        System.out.println("===================Approach 2 without using 3rd variable===================");
        int X = 400;
        int Y = 600;
        System.out.println("Before swapping the value of X is " + X + " Value of Y is " + Y);
        X = X + Y;
        Y = X - Y;
        X = X - Y;
        System.out.println("After swapping the value of X is " + X + " Value of Y is " + Y);

        /*
         * Approach 3: Swapping without using a third variable (using multiplication and division)
         * 
         * This method swaps two numbers using multiplication and division. It is an
         * alternative to the addition/subtraction method, but it cannot be used
         * if either number is zero.
         * 
         * Example:
         * M = 20, N = 30
         * M = M * N;  // M = 600
         * N = M / N;  // N = 20
         * M = M / N;  // M = 30
         * 
         * After swap: M = 30, N = 20
         */
        System.out.println("===================Approach 3 without using 3rd variable===================");
        int M = 20;
        int N = 30;
        System.out.println("Before swapping the value of M is " + M + " Value of N is " + N);
        M = M * N;
        N = M / N;
        M = M / N;
        System.out.println("After swapping the value of M is " + M + " Value of N is " + N);

        /*
         * Approach 4: Swapping using XOR Bitwise Operator
         * 
         * This method uses the XOR bitwise operator to swap two numbers without
         * a third variable. The XOR operator compares the bits of two numbers and
         * performs the swap operation directly on the binary level.
         * This method does not work if one of the numbers is zero.
         * 
         * Example:
         * P = 5, Q = 10
         * P = P ^ Q;  // P becomes 15
         * Q = P ^ Q;  // Q becomes 5
         * P = P ^ Q;  // P becomes 10
         * 
         * After swap: P = 10, Q = 5
         */
        System.out.println("=======Approach 4 without using 3rd variable (XOR Bitwise Operator)=========");
        int P = 5;
        int Q = 10;
        System.out.println("Before swapping the value of P is " + P + " Value of Q is " + Q);
        P = P ^ Q;
        Q = P ^ Q;
        P = P ^ Q;
        System.out.println("After swapping the value of P is " + P + " Value of Q is " + Q);

        /*
         * Approach 5: Swapping using a single expression
         * 
         * This method swaps two numbers using a single arithmetic expression.
         * It leverages the order of operations to perform the swap in one step.
         * 
         * Example:
         * E = 10, F = 20
         * F = E + F - (E = F);
         * 
         * After swap: E = 20, F = 10
         */
        System.out.println("============Approach 5 without using 3rd variable (Using single expression)==============");
        int E = 10;
        int F = 20;
        System.out.println("Before swapping the value of E is " + E + " Value of F is " + F);
        F = E + F - (E = F);
        System.out.println("After swapping the value of E is " + E + " Value of F is " + F);
    }
}
