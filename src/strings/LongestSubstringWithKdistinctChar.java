package strings;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string s and an integer k, return the length of the longest substring of s that contains at most k distinct characters.
Example 1:
Input: s = "eceba", k = 2
Output: 3
Explanation: The substring is "ece" with length 3.
Example 2:
Input: s = "aa", k = 1
Output: 2
Explanation: The substring is "aa" with length 2.
 * @author witha
 *
 *Explanation: This problem can be solved with sliding window pattern. We will take a HashMap to store the frequency count of each 
 *charcters processed. 
 * 1. First we will insert characters from the beginning of the string untill we reach K distinct characters in the HashMap.
 * 2. We will keep adding characters in the frequency map untill we reach K distinct characters.
 * 3. In each step, we check if we have reached K distinct characters or map size has become greater than K then we try to shrink 
 *    the window from start. We shrink the window untill we have no more than K distinct characters
 * 4. While shrinking we will decrement the frequency count of character going out of the window and remove it from the HashMap 
 *    if its frequncy becomes 0
 * 5. At the end of each step we check if the current window is maximum length and if so then update it and remember it.
 */

public class LongestSubstringWithKdistinctChar {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
    	Map<Character, Integer> map = new HashMap<>();
    	int start = 0, maxLength = 0;
    	for (int end = 0; end < s.length(); end++) {
    		char ch = s.charAt(end);
    		map.put(ch, map.getOrDefault(ch, 0)+1); // add in the hashmap with its count
    		while (map.size() > k) {         // if we got distinct characters greater than K then start from beginning of the map
    			char leftChar = s.charAt(start);  
    			map.put(leftChar, map.get(leftChar)-1); // decrement count of characters 
    			if (map.get(leftChar) == 0) {  // if character count becomes 0 then remove it
    				map.remove(leftChar);
    			}
    			start++;  // move start pointer forward
    		}
    		maxLength = Math.max(maxLength, end - start + 1); //update and remember the maxLength so far
    	}
    	return maxLength;
    }
}
