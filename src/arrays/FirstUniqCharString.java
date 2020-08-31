package arrays;

import java.util.HashMap;

/* Given a string, find the first non-repeating character in it and return its index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode"
return 2.
 * */

public class FirstUniqCharString {
   public int firstUniqChar(String s) {
	   char[] chs = s.toCharArray();
	   HashMap<Character, Integer> map = new HashMap<>();
	   for (char ch : chs) {
		   map.put(ch, map.getOrDefault(ch, 0) + 1);
	   }
	// since I have to return the index of the character I'll itearte through traditional for loop in given input string
	   for (int i = 0; i < s.length(); i++) { 
		   int count = map.get(chs[i]);
		   if (count == 1) {
			   return i;
		   }
	   }
	   return -1;
   }
}
