package strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *  Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
    Example 1:
	Input: s = "leetcode"
	Output: 0
	
	Example 2:
	Input: s = "loveleetcode"
	Output: 2
	
	Example 3:
	Input: s = "aabb"
	Output: -1
 * 
 *  Time complexity = O(N) where n represents number of character in a string
 *  Space complexity = O(1) As alphabet contains exact 26 characters so constant
 *
 */
public class FirstUniqueCharOfAString {
	
	public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        for (int i = 0; i < s.length(); i++) {
            int value = map.get(s.charAt(i));
            if (value == 1) {
                return i;
            }
        }
        return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
