import java.util.*;

public class Assignment {
	
	public static void main(String args[]) {
		System.out.println("BASE CONVERTER");

		Scanner indigit = new Scanner( System.in );
		System.out.print("DIGIT REPRESENTATION: ");
		String digit =indigit.next();

		Scanner inbase1 = new Scanner( System.in );
		System.out.print("SOURCE BASE: ");
		int base1 =inbase1.nextInt();
		int decimal = Integer.parseInt(digit,base1);
		System.out.println("DECIMAL: " + decimal);

		Scanner inbase2 = new Scanner( System.in );
		System.out.print("TARGET BASE: ");
		int base2 =inbase2.nextInt();

		System.out.println("NEW NUMBER: " + Integer.toString(decimal, base2));
		
		try {
		    int i = Integer.parseInt("A", 2);
		} catch (NumberFormatException nfe) {
		    // or however you want to handle the exception:
		    System.out.println("Number format exception: " + nfe.getMessage());
		}
	}
}
	