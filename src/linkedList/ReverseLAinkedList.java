package linkedList;

public class ReverseLAinkedList {
	class ListNode {
		int val = 0;
		ListNode next;
		
		public ListNode(int val) {
			this.val = val;
		}
	}
	
	public ListNode reverseLinkedList(ListNode head) {
		ListNode prev = null;
		ListNode curr = head;
		ListNode next = null;
		
		while (curr.next != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}

}
