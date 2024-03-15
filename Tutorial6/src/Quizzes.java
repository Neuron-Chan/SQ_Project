//******************************************************************
//  Quizzes.java
//
//  Grades multiple choice quizzes.
//******************************************************************

import java.text.NumberFormat;
import java.util.Scanner;


public class Quizzes {
    // ----------------------------------------------
    // Read in the number of questions followed by
    // the key, then read in each student's answers
    // and calculate the number and percent correct.
    // ----------------------------------------------
	public static double calculatePercentage(double obtained, double total) {
        return obtained * 100 / total;
    }
	
	public static void main(String[] args) {
		
		char choice;
		
		do {
		
			Scanner ques = new Scanner(System.in);
			System.out.println("How many questions are in the quiz? (Enter twice for authentication purposes) ");
			
			int[] quizGrades = new int[ques.nextInt()];
			int questions = ques.nextInt();
			
			System.out.println("Please enter the key for the answers. ");
			
			for (int i = 0; i < quizGrades.length; i++)
			{
				quizGrades[i] = ques.nextInt();
			}
			
			System.out.println("Please enter the answers to be graded. ");
			int[] studentGrades = new int[questions];
			int count = 0;
			for (int i = 0; i < quizGrades.length; i++)
			{
				studentGrades[i] = ques.nextInt();
				if (studentGrades[i] == quizGrades[i])
				{
					count++;
				}
			}
			System.out.println(calculatePercentage(count, questions) + "%");
			
			System.out.println("Would you like to keep grading? Y/N");
	        choice = ques.next().charAt(0);
		} while ((choice == 'y' ||choice == 'Y'));
		
			
		} 
	}
