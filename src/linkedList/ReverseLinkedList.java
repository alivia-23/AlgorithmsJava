package linkedList;

public class ReverseLinkedList {
    
	public static ListNode reverseLinkedList(ListNode head) {
		ListNode prev = null;
		ListNode current = head;
		
		while (current != null) {
			ListNode temp = current.next;
			current.next = prev;
			prev = current;
			current = temp;
		}
		return prev;
	}
}
