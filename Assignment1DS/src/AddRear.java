// Inserting value in Deque from front.

class AddRear {  
	static void insertRear(int key) {
		if (IsFull.isFull()) {
			System.out.println("Overflow");
			return;
			}

    if (Main.front == -1)
    {
    	Main.front = 0;
        Main.rear = 0;
    }

    else if (Main.rear == Main.size - 1)
    {
    	Main.rear = 0;
    }

    else
    {
    	Main.rear = Main.rear + 1;
    }

    Main.arr[Main.rear] = key;
    
    }
}