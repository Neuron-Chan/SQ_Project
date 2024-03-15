// **********************************************************
//   Count.java
//
//   This program reads in strings (phrases) and counts the 
//   number of blank characters and certain other letters
//   in the phrase.
// **********************************************************

import java.util.Scanner;

public class StringManipulation
{
  public static void main (String[] args)
  {
      String phrase;    // a string of characters
      int countBlank;   // the number of blanks (spaces) in the phrase
      int length;		// the length of the phrase
      char ch;			// an individual character in the string
      int countChar;

      Scanner scan = new Scanner (System.in);

      // Print a program header
      System.out.println ();
      System.out.println ("Character Counter");
      System.out.println ();

      // Read in a string and find its length
      System.out.print ("Enter a sentence or phrase, quit to end: ");
      phrase = scan.nextLine();
      length = phrase.length();
	      
	  // Initialize counts
      countBlank = 0;
      countChar = 0;

      // a for loop to go through the string character by character
      // and count the blank spaces 
      for (int i = 0; i < phrase.length();)
      {
    	  ch = phrase.charAt(i);
    	  if (ch == ' ') {
    		  countBlank++;
    	  }
    	  System.out.println(ch);
    	  countChar = i;
    	  i++;
      }
      
	      
	  // Print the results
      System.out.println ("Number of character spaces: " + countChar);
	  System.out.println ("Number of blank spaces: " + countBlank);
	  System.out.println ();

    }
}
