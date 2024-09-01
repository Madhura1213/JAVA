package com.demo.substring;

public class LengthOfSubstring {
/*
	Given a string s, find the length of the longest 
	substring
	 without repeating characters.

	Q Example 1:

	Input: s = "abcabcbb"
	Output: 3
	Explanation: The answer is "abc", with the length of 3.
*/
	public static void main(String[] args) {
	
		        Solution solution = new Solution();
		        String substr = "bkjcbb";

		        int length = solution.lengthOfSubstring(substr);
		        System.out.println("Length of the longest substring without repeating characters: " + length);
		    
		}


	}


