//**********************************************************
// CopyFile.java
//
// Copies a file to the standard output.
//**********************************************************
import java.util.Scanner;
import java.io.*;

public class CopyFile
{
    public static void main(String[] args)
    {
	String filename  = null;
	Scanner fileScanner = null;
	Scanner scan = new Scanner(System.in);
	String line;
	
	System.out.println("Enter a line of text"); Scanner scanLine = new Scanner(scan.nextLine());


	Scanner input = null;
	do {
	    System.out.print("Input file name? ");
	    String fileName = scan.next();
	    File inputFile = new File(fileName);
	   	try {
	        input = new Scanner(inputFile);
	    	} catch (IOException ex) {
	    		System.out.println("Cannot open: " + ex.getMessage());
	    	}          
		} while (input == null);
    }
	
}
