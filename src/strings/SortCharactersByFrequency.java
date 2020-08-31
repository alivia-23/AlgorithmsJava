package strings;

import java.util.HashMap;
import java.util.PriorityQueue;

/*
 *  Given a string, sort it in decreasing order based on the frequency of characters.

	Example 1:
	
	Input:
	"tree"
	
	Output:
	"eert"
	
	Explanation:
	'e' appears twice while 'r' and 't' both appear once.
	So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
 */

public class SortCharactersByFrequency {
	public String sortFreqencyCharacter(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		for (char c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		
		PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
		
		maxHeap.addAll(map.keySet());
		
		StringBuilder output = new StringBuilder();
		while (!maxHeap.isEmpty()) {
			char current = maxHeap.remove();
			for (int i = 0; i < map.get(current); i++) {
				output.append(current);
			}
		}
		
		return output.toString();
		
	}

}
