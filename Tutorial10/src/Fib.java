// ******************************************************************
//   Fib.java
//
//   A utility class that provide methods to compute elements of the
//   Fibonacci sequence.
// ******************************************************************
public class Fib
{

    //--------------------------------------------------------------
    // Recursively computes fib(n)
    //--------------------------------------------------------------
    public static int fib1(int n)
    {
	  //write your code over here
    	if (n <= 1)
    		return n;
    	return fib1(n - 1) + fib1(n - 2);
    }
	    
   
    //--------------------------------------------------------------
    // Computes fib(n) using an array to cache values
    //--------------------------------------------------------------
    public static int fib2(int n)
    {
		//write your code over here
    	int[] values = new int[n+2];
    	
    	values[0] = 0;
    	values[1] = 1;
    	
    	for (int i = 2; i <= n; i++) {
    	      values[i] = values[i - 1] + values[i - 2];
    	      }
    	
		return values[n];
    }
}
