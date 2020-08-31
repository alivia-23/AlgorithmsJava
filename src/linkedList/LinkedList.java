package linkedList;

public class LinkedList {
    
	private static class Node { // we can use this over and over again everytime we nee to add an element in the list
    	int data;
    	Node next; // points to the next element in the list
    	
    	public Node(int data) {
    		this.data = data;
    	}
    }
	
	private Node head;
	
	public void addFront(int data) { // O(1)
		//Create new node
		Node newNode = new Node(data);
		
		// if head is null
		if(head == null) {
			head = newNode;
			return;
		}
		
		//set it's next pointer to the current head
		newNode.next = head;
		
		//set current head points to the new node
		head = newNode;
	}
	
	public int getFirst() {
		return head.data;
	}
	
	public int getLast() {
		if(head == null) {
			throw new IllegalStateException("EmptyList");
		}
		
		Node current = head;
		
		// while we are not at the last node whose next pointer points to null we'll traverse
		while(current.next != null) {
			current = current.next;
		} // O(n)
		
		// we are at the tail
		return current.data;
	}
	
	public void addBack(int data) { // O(N)
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			return;
		}
		//start at head
		Node current = head;
		//walk through entire list untill current.next = null
		while(current.next != null) {
			current = current.next;
		}
		
		current.next = newNode;
		newNode.next = null;
	}
	
	public int size() {
		if(head == null) {
			return 0;
		}
		
		int count = 1;
		Node current = head;
		while(current.next != null) {
			current = current.next;
			count++;
		}
		return count;
	}
	
	// How to clear a linkedlist
	public void clear() {
		head = null;
	}
	
	//Delete a node from a linkedlist
	public void deleteValue(int data) { // O(n)
		
		if(head == null) {
			return;
		}
		
		if(head.data == data) {
			head = head.next;
			return;
		}
		
		Node current = head;
		
		while (current.next.data != data) {
			current = current.next;
		}
		
		current.next = current.next.next;
		return;
	}
}

/*
 *  Difference between array, arraylist and linkedlist
 *  
 *  ARRAY - * Fixed size/can't grow *fast random access O(1)
 *  
 *  ARRAYLIST - * dynamic array * resize according to requirement *insert/remove * handles resizing
 *  
 *  LINKEDLIST - *No random access * fast add front O(1) (highlevel api is stacks/queues)
 */
