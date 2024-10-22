package com.java.programs;

public class ReverseStringRecursion {

    // Recursive method to reverse a string
    public static String reverse(String str) {
        // Base case: if the string is empty or has only one character
        if (str.isEmpty()) {
            return str;
        }
        // Recursive case: get the last character and append the result of reverse for the remaining string
        //System.out.println(reverse(str.substring(1)) + str.charAt(0));
        return reverse(str.substring(1)) + str.charAt(0); // un +  s // n +  u // "" +  n ==> it should be sun instead nus
    }

    public static void main(String[] args) {
        String original = "sun";
        String reversed = reverse(original);
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }
}
