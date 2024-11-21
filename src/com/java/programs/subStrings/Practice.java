package com.java.programs.subStrings;

public class Practice {
    public static void main(String[] args) {
        
		 String str = "Java,Python,C++";
		 char delimeter = ',';
		 
		 int start = 0;
		 for(int i = 0; i<str.length(); i++) {
			 if(str.charAt(i) == delimeter) {
				 System.out.println(str.substring(start, i));
				 start = i + 1;
			 }
		 }
	        System.out.println(str.substring(start));
    }
}
