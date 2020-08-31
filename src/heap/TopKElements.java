package heap;

import java.util.PriorityQueue;

public class TopKElements {

	public static void main(String[] args) {
		int[] arr = {3,1,5,12,2,11};
		int k = 3;
		
		printArray(topKelements(arr, k));

	}
	
	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+ " ");
		}
	}
	
	public static int[] topKelements(int[] nums, int k) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> (a - b)); 
		
		for (int i = 0; i < k; i++) {
			minHeap.add(nums[i]);
		}
		
		for (int i = k; i < nums.length; i++) {
			if(nums[i] > minHeap.peek()) {
				minHeap.poll();
				minHeap.offer(nums[i]);
			}
		}
		
		int[] largestElements = new int[minHeap.size()];
		
		for (int i = 0; i < k; i++) {
			largestElements[i] = minHeap.poll();
		}
		
		return largestElements;
	}

}
