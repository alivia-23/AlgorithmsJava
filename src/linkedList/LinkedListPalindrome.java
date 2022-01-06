package linkedList;

public class LinkedListPalindrome {
	
	public boolean isPalindrome(ListNode head) {
		
		// find middle
		ListNode slow = head;
		ListNode fast = head;
		
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		//reverse
		ListNode prev = null;
		ListNode current = slow;
		
		while (current != null) {
			ListNode temp = current.next;
			current.next = prev;
			prev = current;
			current = temp;
		}
		
		//compare
		fast = head;
		slow = prev;
		
		while (slow != null) {
			if (fast.val != slow.val) {
				return false;
			}
			slow = slow.next;
			fast = fast.next;
		}
		return true;
	}

}
