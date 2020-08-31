package heap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentNumbers {

	public static void main(String[] args) {
		List<Integer> result = topKfrequentNumbers(new int[] { 1, 3, 5, 12, 11, 12, 11 }, 2);
	    System.out.println("Here are the K frequent numbers: " + result);

	    result = topKfrequentNumbers(new int[] { 5, 12, 11, 3, 11 }, 2);
	    System.out.println("Here are the K frequent numbers: " + result);

	}
	
	public static List<Integer> topKfrequentNumbers(int[] nums, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			if(map.containsKey(nums[i])) {
				count = map.get(nums[i]);
				map.put(nums[i], count + 1);
			} else {
				map.put(nums[i], count);
			}
		}
		
		PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>((e1, e2) -> e1.getValue() - e2.getValue());
		
		for (Map.Entry<Integer, Integer> e  : map.entrySet()) {
			minHeap.add(e);
			if(minHeap.size() > k) {
				minHeap.poll();
			}
		}
		
		List<Integer> result = new ArrayList<>();
		while(!minHeap.isEmpty()) {
			result.add(minHeap.poll().getKey());
		}
		
		return result;
	}

}
