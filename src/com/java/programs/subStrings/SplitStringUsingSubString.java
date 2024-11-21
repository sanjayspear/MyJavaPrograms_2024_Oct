package com.java.programs.subStrings;

public class SplitStringUsingSubString {

	public static void main(String[] args) {
		//Appraoch 1: Using Substring
		 String str = "Java,Python,C++";
	        char delimiter = ',';
	        
	        int start = 0;
	        for (int i = 0; i < str.length(); i++) {
	            if (str.charAt(i) == delimiter) {
	            	//for your reference, this line prints start and end index
					//System.out.println(start+" "+ i); //you can uncomment to check start and end index.
	                System.out.println(str.substring(start, i));
	                start = i + 1;
	            }
	        }
	        // Print the last part
	        System.out.println(str.substring(start));
	        
	        System.out.println("==============================================================");
	    //Approach 2: Using spilt():
			 
			 String[] s = str.split(",");
			 
			 for(String temp: s) {
				 System.out.println(temp);
			 }
	}

}
