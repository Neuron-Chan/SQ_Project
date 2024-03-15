import java.util.Scanner;

public class app{
	public static void main(String[] args) {
		System.out.println("Insert your name:");
		Scanner myscanner = new Scanner(System.in);
		String nameIn = myscanner.nextLine();
		
		System.out.println("Insert age: ");
		myscanner.nextInt();
		
		System.out.println("Hello, " + nameIn);
	}
}