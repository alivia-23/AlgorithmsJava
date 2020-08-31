package heap;

import java.util.PriorityQueue;

public class KthSmallestElements {

	public static void main(String[] args) {
		int[] arr = {5, 12, 11, -1, 12 };
		int k = 3;
		
		int output = smallestElemOfKth(arr, k);
		System.out.println(output);

	}
	/*
	 * This is of runtime nlogn so not efficient
	 */
	/*
	public static int smallestElemOfKth(int [] nums, int k) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> (a - b));
		
		for (int i = 0; i < nums.length; i++) {
			minHeap.add(nums[i]);
		}
		
		for (int i = 0; i < k-1; i++) {
			minHeap.poll();
		}
		
		int kthSmallestElement = minHeap.peek();
		
		return kthSmallestElement;
	} */
	
	/*
	 * runtime nlogk so more efficient than previous
	 */
	
	public static int smallestElemOfKth(int[] nums, int k) {
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> (b - a));
		
		for (int i = 0; i < k; i++) {
			maxHeap.add(nums[i]);
		}
		
		for (int i = k; i < nums.length; i++) {
			if(nums[i] < maxHeap.peek()) {
				maxHeap.poll();
				maxHeap.add(nums[i]);
			}
		}
		
		int kthSmallestElement = maxHeap.peek();
		
		return kthSmallestElement;
	}

}
