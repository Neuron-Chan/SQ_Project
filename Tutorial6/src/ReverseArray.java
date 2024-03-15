//*******************************************************************
//  ReverseArray.java
//
//  Reads in an array and reverses it.
//*******************************************************************

import java.util.Scanner;

public class ReverseArray
{
    //--------------------------------------------------
    // Read in an array then reverse the order in which
    // the array elements are stored.
    //--------------------------------------------------
    public static void main(String[] args)
    {
	int numElements;
	Scanner scan = new Scanner (System.in);

	System.out.print ("Enter the number of elements in the array: ");
	numElements = scan.nextInt();

	int[] a = new int[numElements];

	System.out.println ("Enter the array elements (integers)...");
	for (int i = 0; i < numElements; i++)
	{
	    System.out.print ("Enter element " + (i+1) + ": ");
	    a[i] = scan.nextInt();
	}

	System.out.println ();
	System.out.println ("The array elements before reversing:");
	for (int i = 0; i < numElements; i++)
	    System.out.print (a[i] + "  ");
	System.out.println();

	// Reverse the elements
	for (int i = 0; i < numElements/2; i++)
	    {
		// Swap element i with element (numElements-1-i)
		int temp = a[i];
		a[i] = a[numElements-1-i];
		a[numElements-1-i] = temp;
	    }

	// Print the array
	System.out.println ("\nThe array after reversing: ");
	for (int i = 0; i < numElements; i++)
	    System.out.print (a[i] + "  ");
	System.out.println();
    }
}
