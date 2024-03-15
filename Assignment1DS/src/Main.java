import java.util.*;

class Main {
	
	static final int MAX = 1000;
	static int arr[] = new int[MAX];
	static int front = -1;
	static int rear = 0;
	static int size;
	  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the dequeue");
		int data = 0;
	    int n = sc.nextInt();
	    
	    System.out.println("Enter the element to be inserted in the front end of Deque: ");
	    data = sc.nextInt();
	    AddFront.insertFront(data);
	    
	    System.out.println();
	    
	    System.out.println("Enter the element to be inserted in the front end of Deque: ");
	    data = sc.nextInt();
	    AddFront.insertFront(data);
	    
	    System.out.println();
	    
	    System.out.println("get front element: " + GetFront.getFront());
	    DeleteFront.deleteFront();
	    
	    System.out.println();
	    
	    System.out.println("After delete front element new front become : " + +GetFront.getFront());
	    
	    System.out.println();
	    
	    System.out.println("Enter the element to be inserted in the rear end of Deque :");
	    data = sc.nextInt();
	    AddRear.insertRear(data);
	    
	    System.out.println();
	    
	    System.out.println("get rear element : " + GetRear.getRear());
	    
	    System.out.println();
	    
	    DeleteRear.deleteRear();
	    System.out.println("After delete rear element new rear become : " + GetRear.getRear());
	      
	    System.out.println("Is the deque empty? : " + IsEmpty.isEmpty());
	    
	    System.out.println("Is the deque full? : " + IsFull.isFull());
	    
	    for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
	}
}