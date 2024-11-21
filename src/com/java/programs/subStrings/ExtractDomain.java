	package com.java.programs.subStrings;

	public class ExtractDomain {
	    public static void main(String[] args) {
	    	// Approach 1: Using the split method
	        // Define an email string
	        String email = "user@example.com";
	        
	        // Split the email string into two parts: before and after the '@' symbol
	        // The result is an array where the second element (index 1) is the domain name
	        String[] domainName = email.split("@");
	        
	        // Print the domain part of the email
	        System.out.println("Domain: " + domainName[1]);
	        
	        // Approach 2: Using indexOf and substring
	        // Find the position of the '@' symbol in the email string
	        int startIndex = email.indexOf("@");
	        
	        // Extract the substring starting from the character after the '@' symbol
	        String domain = email.substring(startIndex + 1);
	        
	        // Print the domain part of the email
	        System.out.println("Domain: " + domain);
	    }
	}

