
class Main {
	//Driver code
	public static void main(String[] args) {
		MaxHeap heap = new MaxHeap(10); // creates an empty heap with max size of 10
		heap.insert(16);
		heap.insert(10);
		heap.insert(14);
		heap.insert(9);
		heap.insert(7);
		heap.insert(1);
		heap.insert(4);
		heap.insert(2);
		heap.insert(8);
		heap.insert(3);
		System.out.println(heap.toString());
		heap.remove(1);
		System.out.println(heap.toString());
		}
}