package com.java.programs.subStrings;

public class ReverseStringWithSpecialCharacters {

    public static void main(String[] args) {
        String input = "a,b$c";
        String result = reverseStringWithSubstring(input);
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + result);
    }

    public static String reverseStringWithSubstring(String input) {
        // Convert the input string into a character array for manipulation
        char[] characters = input.toCharArray();

        // Initialize two pointers: one starting from the beginning and the other from the end
        int left = 0, right = input.length() - 1;

        while (left < right) {
            // Skip special characters on the left
            if (!Character.isLetterOrDigit(characters[left])) {
                left++;
            }
            // Skip special characters on the right
            else if (!Character.isLetterOrDigit(characters[right])) {
                right--;
            }
            // Swap the alphanumeric characters
            else {
                // Use substring to extract and replace characters at left and right
                String leftChar = input.substring(left, left + 1);
                String rightChar = input.substring(right, right + 1);

                characters[left] = rightChar.charAt(0);
                characters[right] = leftChar.charAt(0);

                // Move the pointers inward
                left++;
                right--;
            }
        }

        // Convert the modified character array back to a string and return
        return new String(characters);
    }
}

