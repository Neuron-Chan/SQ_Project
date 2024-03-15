/*
 * 4. The file Distance.java contains an incomplete program to compute the distance 
 * between two points. Recall that the distance between the two points (x1, y1)
 * and (x2, y2) is computed by taking the square root of the quantity 
 * (x1 - x2)^2 + (y1 - y2)^2. The program already has code to get the two points as
 * input. You need to add an assignment statement to compute the distance and then a
 * print statement to print it out (appropriately labeled). Test your program using the
 * following data: The distance between the points (3, 17) and (8, 10) is 8.6023...
 * (lots more digits printed); the distance between (-33,49) and (-9, -15) is 68.352....
 */

import java.util.Scanner;

public class Problem4 {
	
    public static void main(String[] args) {
    	
        double x1, y1, x2, y2; // coordinates of two points
        double distance; // distance between the points
        
        Scanner scan = new Scanner(System.in);
        // Read in the two points
        
        System.out.print("Enter the coordinates of the first point " +
                "(put a space between them): ");
        x1 = scan.nextDouble();
        y1 = scan.nextDouble();
        
        System.out.print("Enter the coordinates of the second point: ");
        x2 = scan.nextDouble();
        y2 = scan.nextDouble();
        
        // Compute the distance
        distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        
        // Print out the answer
        System.out.println("The distance between (" + x1 + ", " + y1 + ") and (" +
                x2 + ", " + y2 + ") is=" + distance);

        scan.close();
    }
}