package strings;

import java.util.HashMap;
import java.util.Map;

/* Given two strings s and t , write a function to determine if t is an anagram of s.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
 * */

public class ValidAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "rat";
		String t = "car";
		System.out.println(isAnagram(s, t));

	}
	public static boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		Map<Character, Integer> map = new HashMap<>();
		for (char c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		for (char c : t.toCharArray()) {
			if (!map.containsKey(c)) {
				return false;
			}
			map.put(c, map.get(c) - 1);
			
			if (map.get(c) == 0) {
				map.remove(c);
			}
		}
		return map.isEmpty();
	}

}
