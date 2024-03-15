// Java program to reverse a doubly linked list

class Reverse {

	static Node head;

	static class Node {

		int data;
		Node next, prev;

		Node(int d)
		{
			data = d;
			next = prev = null;
		}
	}

	// Function to reverse a Doubly Linked List
	void reverse()
	{
		Node temp = null;
		Node current = head;

		// swap next and previous for all nodes of doubly linked list
		while (current != null) {
			temp = current.prev;
			current.prev = current.next;
			current.next = temp;
			current = current.prev;
		}

		// Before changing head, check for the cases like empty list and list with only one node
		if (temp != null) {
			head = temp.prev;
		}
	}
}