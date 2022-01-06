package linkedList;

import java.util.PriorityQueue;

/**
 * You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
   Merge all the linked-lists into one sorted linked-list and return it.	 
	Example 1:
	Input: lists = [[1,4,5],[1,3,4],[2,6]]
	Output: [1,1,2,3,4,4,5,6]
	Explanation: The linked-lists are:
	[
	  1->4->5,
	  1->3->4,
	  2->6
	]
	merging them into one sorted list:
	1->1->2->3->4->4->5->6
	Example 2:
	Input: lists = []
	Output: []
	Example 3:	
	Input: lists = [[]]
	Output: []
 * @author witha
 *
 */
public class MergeKSortedLinkedList {
	
	public static ListNode mergeKSortedLinkedList(ListNode[] lists) {
		// edge cases are if list is empty
		if (lists == null || lists.length == 0) {
			return null;
		}
		// Add all the elements of lists to the minHeap
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		for (ListNode head : lists) {
			while (head != null) {
				minHeap.add(head.val);
				head = head.next;
			}
		}
		//Remove elements from the minHeap and hold it with a dummy node
		ListNode dummy = new ListNode(-1);
		ListNode head = dummy; // keeping a head pointer that starts from dummy
		while (!minHeap.isEmpty()) {
			head.next = new ListNode(minHeap.poll()); // remove top element from minHeap and add next to dummy(head)
			head = head.next; // move head pointer forward
		}
		return dummy.next;
	}

}
