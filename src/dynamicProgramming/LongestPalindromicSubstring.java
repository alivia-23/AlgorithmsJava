package strings;

/*
 * Given a string s, return the longest palindromic substring in s.
	
	Example 1:
	Input: s = "babad"
	Output: "bab"
	
	Note: "aba" is also a valid answer.
	
	Example 2:
	Input: s = "cbbd"
	Output: "bb"
	
	Example 3:
	Input: s = "a"
	Output: "a"
	
	Example 4:
	Input: s = "ac"
	Output: "a"
 */

public class LongestPalindromicSubstring {
	
	int low = 0; 
	int maxLength = 0;
	
	public String longestPalindrome(String s) {
		
		for (int i = 0; i < s.length() - 1; i++) {
			expand(s, i, i);   // odd no. of characters in a string
			expand(s, i, i+1); // even no. of characters in a string
		}
		
		return s.substring(low, low + maxLength); // range of substring is low to high(low + maxLength)
	}
	
	void expand(String s, int start, int end) {
		while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
			start--;
			end++;
		}
		start++; // go 1 step forward where string matched
        end--;   // go 1 step backward where string matched
		if (end - start - 1 > maxLength) { 
			maxLength = end - start - 1;
			low = start; // holds the index from where it starts the substring
		}
	}

}
