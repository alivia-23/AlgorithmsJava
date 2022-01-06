package arrays;

import java.util.ArrayList;
import java.util.Arrays;
/**
 * Given list of lists of sorted integer, merge them in a single list
 * 
 *  Input : [[1, 3, 5], [2, 4, 6, 8], [2, 7, 9, 12]]
 *  output : [1, 2, 2, 3, 4, 5, 6, 7, 8, 9, 12]
 */
import java.util.List;
import java.util.PriorityQueue;

public class MergeKSortedList {
	
	public static void main(String[] args) {
		List<List<Integer>> lists = new ArrayList<List<Integer>>();
		lists.add(Arrays.asList(1,3,5));
		lists.add(Arrays.asList(2, 4, 6, 8));
		lists.add(Arrays.asList(2, 7, 9, 12));
		
		List<Integer> result = new MergeKSortedList().
				mergeKList(lists);
		
		System.out.println(result);
	}
	
	
	class Item {
		
		public Item(Integer integer, int i, int j) {
			this.val = integer;
			this.rowIndex = i;
			this.colIndex = j;
		}
		
		int val;
		int rowIndex;
		int colIndex;
	}
	
	public  List<Integer> mergeKList(List<List<Integer>> lists) {
		
		List<Integer> sortedList = new ArrayList<>();
		
		PriorityQueue<Item> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);
	    for (int i = 0; i < lists.size(); i++) {
	    	if (lists.get(i).size() > 0) {
				Item item = new Item(lists.get(i).get(0), i, 0);
				minHeap.offer(item);
	    	}
	    }
			
		
		while (!minHeap.isEmpty()) {
			Item item = minHeap.poll();
			sortedList.add(item.val);
			if (item.colIndex < lists.get(item.rowIndex).size() - 1) {
				Item nextItem = new Item(lists.get(item.rowIndex).get(item.colIndex+1), item.rowIndex, item.colIndex+1);
				minHeap.add(nextItem);
			}
		}
		
		
		return sortedList;
	}

}
