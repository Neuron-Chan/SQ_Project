// Delete value from front in the Deque.

class DeleteFront {
	static void deleteFront() {

    if (IsEmpty.isEmpty()) {
      System.out.println("Queue Underflow\n");
      return;
    }
    
    // Deque has only one element
    if (Main.front == Main.rear)
    {
      Main.front = -1;
      Main.rear = -1;
    }
    else if (Main.front == Main.size - 1)
      Main.front = 0;

    else
      Main.front = Main.front + 1;
  }
}