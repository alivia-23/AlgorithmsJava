package linkedList;

public class MiddleOfLinkedList {
	
	//Brute force
	 ListNode middleOfLinkedList(ListNode head) {
		ListNode current = head;
		int length = 0;
		
		while (current != null) {
			current = current.next;
			length++;
		}
		
		int mid = length / 2;
		ListNode cur = head;
		
		while (mid > 0) {
			cur = cur.next;
			mid--;
		}
		return cur;
	}
	
	
	//Optimized solution
	 ListNode middleOfLinkedList1(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

}
