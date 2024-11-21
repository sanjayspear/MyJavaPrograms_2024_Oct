package com.java.programs.subStrings;

public class ExtractDomain2 {

	public static void main(String[] args) {
		// Define an email string to extract the domain name
        String email = "user@example.com";
        
        // Extract the domain name using the split method
        // The split method divides the string into two parts at the '@' symbol.
        // The domain name is the second part (index 1) of the resulting array.
        System.out.println("Domain Name: " + email.split("@")[1]); // Output: example.com

        // Extract the domain name using the substring and indexOf methods
        // The indexOf method finds the position of the '@' symbol.
        // The substring method extracts the part of the string starting from
        // one position after the '@' symbol to the end of the string.
        System.out.println("Domain Name: " + email.substring(email.indexOf("@") + 1)); // Output: example.com
	}

}
