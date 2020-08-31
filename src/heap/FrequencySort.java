package heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class FrequencySort {

	public static void main(String[] args) {
		String result = frequencySort("Programming");
	    System.out.println("Here is the given string after sorting characters by frequency: " + result);

	    result = frequencySort("abcbab");
	    System.out.println("Here is the given string after sorting characters by frequency: " + result);

	}
	
	public static String frequencySort(String str) {
	    Map<Character, Integer> map = new HashMap<>();
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(map.containsKey(c)) {
				int count = map.get(c);
				map.put(c, count + 1);
			} else {
				map.put(c, 1);
			}
		}
		
		PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>((e1, e2) -> e2.getValue() - e1.getValue());
		maxHeap.addAll(map.entrySet());
		
		StringBuilder sb = new StringBuilder();
		
		while(!maxHeap.isEmpty()) {
			Map.Entry<Character, Integer> entry = maxHeap.poll();
			int count = entry.getValue();
            char ch = entry.getKey();
			
			while(count != 0) {
				sb.append(ch);
				count--;
			}
		}
		return sb.toString();
	}

}
