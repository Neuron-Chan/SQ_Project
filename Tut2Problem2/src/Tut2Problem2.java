import java.util.Scanner;
import java.lang.Math;


public class Tut2Problem2 {
	
	/* 2. Write a program to find the surface area and volume of a sphere using given
	 * methods based on user input. 
(surface area = 4 * PI * (radius^2) /3, volume = 4 * PI * (radius^3).)
	 */
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); //Scanner for input
		System.out.println("Enter radius:");
	
		int radius = input.nextInt(); // read input
		
		double surfaceArea = 4 * radius * radius * Math.PI;
		double volume = (Math.pow(radius, 3)) * Math.PI * 4/3;
		
		System.out.println("The surface area based on your radius is: " + surfaceArea);
		System.out.println("The volume based on your radius is: " + volume);
	
	}
	
}