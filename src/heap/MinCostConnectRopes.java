package heap;

import java.util.PriorityQueue;

public class MinCostConnectRopes {

	public static void main(String[] args) {
		int[] arr = {1, 3, 5, 11};
		
		int result = minCost(arr);
		
		System.out.println(result);

	}
	
	public static int minCost(int[] nums) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> (a - b));
		
		for (int i = 0; i < nums.length; i++) {
			minHeap.add(nums[i]);
		}
		
		int minCost = 0;
		while (minHeap.size() > 1) {
			int sum = minHeap.poll() + minHeap.poll();
			minCost += sum; 
			minHeap.add(sum);
		}
		return minCost;
	}

}
