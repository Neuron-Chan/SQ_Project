// Deleting value from rear in the Deque.

class DeleteRear {  
	static void deleteRear() {
		if (IsEmpty.isEmpty()) {
			System.out.println(" Underflow");
			return;
    }

    if (Main.front == Main.rear) 
    {
        Main.front = -1;
        Main.rear = -1;
    } 
    else if (Main.rear == 0)
    {
        Main.rear =  Main.size - 1;
    }
      else
        Main.rear = Main.rear - 1;
	}
}