public class problem1 {
	void average (int a, int b) {
		System.out.println("average is: " + ((a+b)/2));
	}
	void average (int a, int b, int c) {
		System.out.println("average is: " + ((a+b+c)/3));
	}
	void average (int a, int b, int c, int d) {
		System.out.println("average is: " + ((a+b+c+d)/4));
	}
	public static void main(String[] args) {
		problem1 cal = new problem1();
		cal.average(4,6);
		cal.average(5,19,27);
		cal.average(20,22,66,70);
	}
}