// Java program to check if a doubly linked list is full.

class IsFull {
	
	// Checking if the Deque is full.
	  public static boolean isFull() {
		  return ((Main.front == 0 && Main.rear == Main.size - 1) || Main.front == Main.rear + 1);
	  }
}