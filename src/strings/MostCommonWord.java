package strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 
	Given a string paragraph and a string array of the banned words banned, return the most frequent word that is not banned. 
	It is guaranteed there is at least one word that is not banned, and that the answer is unique.
	The words in paragraph are case-insensitive and the answer should be returned in lowercase.
	Example 1:
	Input: paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.", banned = ["hit"]
	Output: "ball"
	Explanation: 
	"hit" occurs 3 times, but it is a banned word.
	"ball" occurs twice (and no other word does), so it is the most frequent non-banned word in the paragraph. 
	Note that words in the paragraph are not case sensitive,
	that punctuation is ignored (even if adjacent to words, such as "ball,"), 
	and that "hit" isn't the answer even though it occurs more because it is banned.
	Example 2:
	Input: paragraph = "a.", banned = []
	Output: "a"
	Constraints:
	1 <= paragraph.length <= 1000
	paragraph consists of English letters, space ' ', or one of the symbols: "!?',;.".
	0 <= banned.length <= 100
	1 <= banned[i].length <= 10
	banned[i] consists of only lowercase English letters.
 * 
 *  **** Complexity *****
 *    Time complexity - O(N + M) 
 *    Space complexity - O(N + M) Since we put N words of banned in the set and M words of paragraph to built the frequency map
 *
 */
public class MostCommonWord {
	public static String mostCommonWord(String paragraph, String[] banned) {
		// Replace all punctuations with empty space, convert all to lowercase and split the string based on multiple spaces except (a-z,A-Z,0-9)
		String[] str = paragraph.replaceAll("[^a-zA-Z0-9]", " ").toLowerCase().split("\\s+");
		
		Set<String> bannedW = new HashSet<>();
		Map<String, Integer> map = new HashMap<>();
		
		for (String s : banned) {
			bannedW.add(s);
		}
		for (String s : str) {
			if (!bannedW.contains(s)) {
				map.put(s, map.getOrDefault(s, 0)+1);
			}
		}
		String result = " ";
		int maxCount = Integer.MIN_VALUE;
		for (String s : map.keySet()) {
			int count = map.get(s);
			if (count > maxCount) {
				maxCount = count;
				result = s;
			}
		}
		return result;
	}

}
