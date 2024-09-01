package com.demo.substring;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	 public int lengthOfSubstring(String str) {
	        Set<Character> charset = new HashSet<>();
	        int maxLength = 0;
	        int left = 0;

	        for (int right = 0; right < str.length(); right++) {
	            char ch = str.charAt(right);

	            while (charset.contains(ch)) {
	                charset.remove(str.charAt(left));
	                left++;
	            }

	            charset.add(ch);
	            maxLength = Math.max(maxLength, right - left + 1);
	        }
	        
	        return maxLength;
	    }

}
