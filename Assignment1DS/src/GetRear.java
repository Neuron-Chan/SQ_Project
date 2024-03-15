// Getting value from front in the Deque.

class GetRear {
	static int getRear() {
		if (IsEmpty.isEmpty() || Main.rear < 0) {
			System.out.println(" Underflow\n");
			return -1;
    }
    return Main.arr[Main.rear];
  }
}