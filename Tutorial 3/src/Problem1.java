import java.lang.*;

public class Problem1 {
	
	/*
	 * 1. Write a program to demonstrate an enumerated type called Directions 
	 * {North, South, West and East}. Define
	variables dir1, dir2, dir3, dir4, for dir3 use
	 direction type West and for dir2 use direction type South and Print
	out value, ordinal, name of dir2 & dir3.
	*/
	
	public enum Directions {
		EAST,
		WEST,
		NORTH,
		SOUTH
	}
	
	public class EnumDirections {
		
		
			public static void main(String args[]) {
				Directions dir1 = Directions.NORTH;
				Directions dir2 = Directions.SOUTH;
				Directions dir3 = Directions.WEST;
				Directions dir4 = Directions.EAST;
				
				System.out.println("The direction of dir2 is " + dir2.name());
				System.out.println("The ordinal of dir2 is " + dir2.ordinal());

				System.out.println("The direction of dir3 is " + dir3.name());
				System.out.println("The ordinal of dir2 is " + dir3.ordinal());

		}
	}
}
