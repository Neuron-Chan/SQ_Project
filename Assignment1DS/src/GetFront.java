// Getting value from front in the Deque.

class GetFront {
	static int getFront() {
		if (IsEmpty.isEmpty()) {
			System.out.println(" Underflow");
			return -1;
    }
    return Main.arr[Main.front];
  }
}