package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* Given an array of strings, group anagrams together.

Example:

Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
Note:

All inputs will be in lowercase.
The order of your output does not matter.
 * */

public class GroupAnagram {
	public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> result = new ArrayList<>();
		if (strs.length == 0) {
			return result;
		}
		HashMap<String, List> map = new HashMap<>();
		for (String s : strs) {
			char[] chs = s.toCharArray();
			Arrays.sort(chs);
			String key = new String(chs);   // if I put chs.toString() instead of new String() I get wrong result why?
			if (!map.containsKey(key)) {
				map.put(key, new ArrayList<>());
			}
			map.get(key).add(s);
		}
		
		for (String s : map.keySet()) {
			result.add(map.get(s));
		}
		return result;
	}

}

// toString() vs new String()
