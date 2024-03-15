public class ExceptionScope {
	
	public void level1() {
		System.out.println("Level 1 beginning.");
		try {
			level2();
		}
		catch(ArithmeticException problem) {
			System.out.println("Problem in level 2 " + problem);
		}
		System.out.println("Level 1 ending.");
	}
	
	public void level2() {
		System.out.println("Level 2 beginning.");
		level3();
		System.out.println("Level 2 ending.");
		}
	
	public void level3() {
		System.out.println("Level 3 beginning");
		int numerator = 10, denominator = 0;
		int result = numerator/denominator;
		System.out.println("Level 3 ending.");
		}
	}
