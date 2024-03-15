import java.util.*;

public class MaxHeap {
	private int[] heap;
	private int size;
	private int maxsize;

	
	public MaxHeap(int maxsize) {
		this.maxsize = maxsize;
		this.size = 0;
		this.heap = new int[this.maxsize + 1];
		}	

	
	public int parent(int i) {
		return (i/2);
		}
	
	public int leftChild(int i) {
		return (2*i);
		}
	
	public int rightChild(int i) {
		return ((2*i) + 1);
		}
	
	void siftUp(int i) {
		while (i > 1 && heap[parent(i)] < heap[i])
		{
			int temp = heap[i];
			heap[i] = heap[parent(i)];
			heap[parent(i)] = temp;
		}
		i = parent(i);
	}
	
	void siftDown(int i) {
		maxsize = i;
		int left = leftChild(i);
		if (left <= size && heap[left] > heap[maxsize]) {
			maxsize = left;
		}
		int right = rightChild(i);
		if (right <= size && heap[right] > heap[maxsize]) {
			maxsize = right;
		}
		if (i != maxsize) {
			int temp = heap[i];
			heap[i] = heap[maxsize];
			heap[maxsize] = temp;
		}
	}
	
	void insert(int p) {
		if (size == maxsize) {
			System.out.print("Error");
			return; 
			}
		size = size + 1;
		heap[size] = p;
		siftUp(size);
		}
	
	int extractMax() {
		int result = heap[1];
		heap[1] = heap[size];
		size = size - 1;
		siftDown(1);
		return result;
	}
	
	void remove(int i) {
		heap[i] = Integer.MAX_VALUE;
		siftUp(i);
		extractMax();	
	}
	
	public String toString() {
		return Arrays.toString(heap);
		}
	}


