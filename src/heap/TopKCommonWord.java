package heap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKCommonWord {
	
	public List<String> topKCommonWord(String paragraph, int k) {
		List<String> result = new ArrayList<>();
		String[] str = paragraph.split(" ");
		
		Map<String, Integer> map = new HashMap<>();
		for (String s : str) {
			map.put(s, map.getOrDefault(s, 0) + 1);
		}
		
		PriorityQueue<String> minHeap = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
		
		for (String s : str) {
			minHeap.offer(s);
			if (minHeap.size() > k) {
				minHeap.poll();
			}
		}
		
		while (!minHeap.isEmpty()) {
			result.add(minHeap.poll());
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
