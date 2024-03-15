
//*******************************************************
// Parameters.java
//
// Illustrates the concept of a variable parameter list. //*******************************************************
import java.util.Scanner;

public class Parameters {
	// -----------------------------------------------
	// Calls the average and minimum methods with
	// different numbers of parameters.
	// -----------------------------------------------
	public static void main(String[] args) {
		double mean1, mean2, mean3, mean4, mean5, minimum;
		mean1 = average(42, 69, 37);
		mean2 = average(35, 43, 93, 23, 40, 21, 75);
		mean3 = average(13);
		mean4 = average();
		System.out.println("mean1 = " + mean1);
		System.out.println("mean2 = " + mean2);
		System.out.println("mean3 = " + mean3);
		System.out.println("mean4 = " + mean4);
		Scanner seq = new Scanner(System.in);
		System.out.println("Enter up to 20 nonnegative integers. ");
		
		int[] avgArray = new int[20];
		for (int i=0; i < 20; i++) 
		{
			avgArray[i] = seq.nextInt();
			if (avgArray[i] < 0)
			{
				System.out.println("That is not a valid number.");
			}
		}
		mean5 = average(avgArray);
		System.out.println("Your input's average = " + mean5);
		minimum = minimum(avgArray);
		System.out.println("Your input's minimum = " + minimum);
	}

	// ----------------------------------------------
	// Returns the average of its parameters.
	// ----------------------------------------------
	public static double average(int... list) {
		double result = 0.0;
		if (list.length != 0) {
			int sum = 0;
			for (int num : list)
				sum += num;
			result = (double) sum / list.length;
		}
		return result;
	}
	
	public static double minimum(int...list)
	{
		double result = 0.0;
		if (list.length != 0) {
			int min = 999999999;
			for (int num : list)
				if (num < min) {
					min = num;
				}
			result = min;
		}
		return result;
	}
}