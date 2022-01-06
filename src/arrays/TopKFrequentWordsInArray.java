package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentWordsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public List<String> topKFrequent(String[] words, int k) {
        List<String> result = new ArrayList<>();
        
        Map<String, Integer> map = new HashMap<>();
        
        for (String s : words) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        
        PriorityQueue<String> minHeap = new PriorityQueue<>((a, b) -> map.get(a).equals(map.get(b)) ? 
        		b.compareTo(a) : map.get(a) - map.get(b));
        
        for (String s : map.keySet()) {
            minHeap.offer(s);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        
        while (!minHeap.isEmpty()) {
            result.add(0, minHeap.poll());
        }
        
        return result;
	 }

}
