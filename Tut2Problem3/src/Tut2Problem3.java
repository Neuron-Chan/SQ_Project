public class Tut2Problem3 {
	
	/* 2. Write a program to find the surface area and volume of a sphere using given
	 * methods based on user input. 
(surface area = 4 * PI * (radius^2) /3, volume = 4 * PI * (radius^3).)
	 */
	
	public static void main(String[] args) {
		
		 System.out.println("Random value integer less than 25: "
				 + getRandomInteger(24, 0));
		 System.out.println("Random value integer less than 25: "
				 + getRandomInteger(24, 0));
		 System.out.println("Random value integer less than 25: "
				 + getRandomInteger(24, 0));
		 System.out.println("Random value integer less than 25: "
				 + getRandomInteger(24, 0));
		 System.out.println("Random value integer less than 25: "
				 + getRandomInteger(24, 0));
		 System.out.println("Random value integer less than 25: "
				 + getRandomInteger(24, 0));
		 System.out.println("Random value integer less than 25: "
				 + getRandomInteger(24, 0));
	
	}
	
	public static int getRandomInteger(int maximum, int minimum){
        return ((int) (Math.random()*(maximum - minimum))) + minimum;
	}

}