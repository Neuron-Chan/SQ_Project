// Inserting value in Deque from front.

class AddFront {  
	public static void insertFront(int key) {
		if (IsFull.isFull()) {
			System.out.println("Overflow");
			return;
			}

    if (Main.front == -1)
    {
    	Main.front = 0;
        Main.rear = 0;
    }

    else if (Main.front == 0)
    {
    	Main.front = Main.size + 1;
    }

    else
    {
    	Main.front = Main.front - 1;
    }
    
    Main.arr[Main.front] = key;
    
    }
}