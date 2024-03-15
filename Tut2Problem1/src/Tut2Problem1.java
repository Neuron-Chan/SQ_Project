import java.lang.Math;


public class Tut2Problem1 {
	
	//1. What would be the output of each expression using following methods?
	//  (double x = 32; double y = 8;) 
	//• Square root of y (Math.sqrt(y) 
	//• 32 power of 8 (Math.pow(x,y)) 
	//• Logarithm of x and y (Math.log(x)) 
	//• Power of 2 (Math.exp(x)). 
	
	public static void main(String[] args) {
	
	double x = 32;
	double y = 8;
	
	double squareRoot = Math.sqrt(y);
	double power = Math.pow(x,y);
	double logarithm = Math.log(x);
	double exp = Math.exp(x);
	
	System.out.println("The square root of y is " + squareRoot);
	System.out.println("32 to the power of 8 is " + power);
	System.out.println("The log of x is " + logarithm);
	System.out.println("The exponential function of x is " + exp);
	
	}
	
}