// Deque implementation in Java
import java.util.*;
import java.io.*;

class Main {
  static final int MAX = 1000;
  int arr[];
  int front;
  int rear;
  int size;

  // Deque constructor.
  public Main(int size) {
    arr = new int[MAX];
    front = -1;
    rear = 0;
    this.size = size;
  }

  // Checking if the Deque is full.
  boolean isFull() {
    return ((front == 0 && rear == size - 1) || front == rear + 1);
  }
  
  // Checking if the Deque is empty.
  boolean isEmpty() {
    return (front == -1);
  }

 // Inserting value in Deque from front.
  void addFront(int key) {
    if (isFull()) {
      System.out.println("Overflow");
      return;
    }

    if (front == -1) {
      front = 0;
      rear = 0;
    }

    else if (front == 0)
      front = size - 1;

    else
      front = front - 1;

    arr[front] = key;
  }

  // Inserting value in Deque from rear.
  void addRear(int key) {
    if (isFull()) {
      System.out.println(" Overflow ");
      return;
    }

    if (front == -1) {
      front = 0;
      rear = 0;
    }

    else if (rear == size - 1)
      rear = 0;

    else
      rear = rear + 1;

    arr[rear] = key;
  }

  // Deleting value from front in the Deque.
  void deleteFront() {
    if (isEmpty()) {
      System.out.println("Queue Underflow\n");
      return;
    }

    // Deque has only one element
    if (front == rear) {
      front = -1;
      rear = -1;
    } else if (front == size - 1)
      front = 0;

    else
      front = front + 1;
  }

  // Deleting value from rear in the Deque.
  void deleteRear() {
    if (isEmpty()) {
      System.out.println("Underflow");
      return;
    }

    if (front == rear) {
      front = -1;
      rear = -1;
    } else if (rear == 0)
      rear = size - 1;
    else
      rear = rear - 1;
  }
 
  // Getting value from front in the Deque.
  int checkFront() {
    if (isEmpty()) {
      System.out.println(" Underflow");
      return -1;
    }
    return arr[front];
  }

  // Getting value from rear in the Deque.
  int checkRear() {
    if (isEmpty() || rear < 0) {
      System.out.println(" Underflow\n");
      return -1;
    }
    return arr[rear];
  }
  
  // Reverses Deque array

   static Queue<Integer> queue;

   // Function to reverse the Deque.
   int reverse(int key){
	   if (isEmpty()) {
		      System.out.println("Queue Underflow\n");
		      return -1;
	   }
	// Declaring variables for array reversal
       int n = size;
       int[] temp = new int[n];

       // Reversal of array using Temporary variable
       for(int i = n - 1; i > -1; i--) {
           // Storing the elements of the input array in reverse order
           temp[n - i - 1] = arr[i];
       }
       System.out.println("Reversed Array :" + Arrays.toString(temp));
		    
		    return 0;
   }
	        
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the Deque: ");
    int data = 0;
    int n = sc.nextInt();
    Main dq = new Main(n);
    
    System.out.println("Enter the element to be inserted in the front end of Deque: ");
    data = sc.nextInt();
    dq.addFront(data);
    
    System.out.println();
    
    System.out.println("Enter the element to be inserted in the front end of Deque: ");
    data = sc.nextInt();
    dq.addFront(data);
    
    System.out.println();
    
    System.out.println("get front element: " + dq.checkFront());
    dq.deleteFront();
    
    System.out.println();
    
    System.out.println("After delete front element new front become : " + +dq.checkFront());
    
    System.out.println();
    
    System.out.println("Enter the element to be inserted in the rear end of Deque :");
    data = sc.nextInt();
    dq.addRear(data);
    
    System.out.println();
    
    System.out.println("get rear element : " + dq.checkRear());
    
    System.out.println();
    
    dq.deleteRear();
    System.out.println("After delete rear element new rear become : " + dq.checkRear());
      
    System.out.println("Is the deque empty? : " + dq.isEmpty());
    
    System.out.println("Is the deque full? : " + dq.isFull());
    
    dq.reverse(data);
  }
}