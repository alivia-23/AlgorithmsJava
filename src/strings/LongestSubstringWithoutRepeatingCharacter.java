package strings;

import java.util.HashSet;
import java.util.Set;

/* Given a string s, find the length of the longest substring without repeating characters.
Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * */

// Time Complexity - O(n)
// Space Complexity - O(n)

public class LongestSubstringWithoutRepeatingCharacter {
	 public int lengthOfLongestSubstring(String s) {
		 int maxLength = 0; int start = 0;
		 Set<Character> set = new HashSet<>();
		 for (int end = 0; end < s.length(); end++) {
			 char ch = s.charAt(end);
			 while (set.contains(ch)) {
				 set.remove(s.charAt(start));
				 start++;
			 }
			 set.add(ch);
			 maxLength = Math.max(maxLength, end - start + 1);
		 }
		 return maxLength;	 
	 }
}
