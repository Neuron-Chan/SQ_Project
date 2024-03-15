/*
 * 5. File Deli.java contains a partial program that computes the cost of buying an item at the deli. Save the
program to your directory and do the following:
a) Study the program to understand what it does.




e) Add the statements to print a label in the following format (the numbers in the example output are correct for input
of $4.25 per pound and 41 ounces). Use the formatting object money to print the unit price and total price and the
formatting object fmt to print the weight to 2 decimal places.
***** CSDeli *****
Unit Price: $4.25 per pound
Weight: 2.56 pounds
TOTAL: $10.89
 */

//b) Add the import statements to import the DecimalFormat and NumberFormat classes.
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Problem5 {

    public static void main(String[] args) {
    	
        final double OUNCES_PER_POUND = 16.0;
        double pricePerPound; // price per pound
        double weightOunces; // weight in ounces
        double weight; // weight in pounds
        double totalPrice; // total price for the item
        
        Scanner scan = new Scanner(System.in);
        // Declare money as a NumberFormat object and 
        
        //c) Add the statement to declare money to be a NumberFormat
        //object as specified in the comment.
        NumberFormat money = NumberFormat.getCurrencyInstance();
        // Declare money as a NumberFormat object and use the
        // getCurrencyInstance method to assign it a value
        
        // d) Add the statement to declare fmt to be a DecimalFormat object as
        // specified in the comment.
        DecimalFormat fmt = new DecimalFormat("0.##");
	    // Declare fmt as a DecimalFormat object and instantiate
	    // it to format numbers with at least one digit to the left of the
	    // decimal and the fractional part rounded to two digits.
        
        
        // prompt the user and read in each input
        System.out.println("Welcome to the CS Deli! ! \n ");
        System.out.print("Enter the price per pound of your item: ");
        pricePerPound = scan.nextDouble();
        System.out.print("Enter the weight (ounces): ");
        weightOunces = scan.nextDouble();
        // Convert ounces to pounds and compute the total
        // price weight = weightOunces / OUNCES_PER_POUND;
        weight = weightOunces / OUNCES_PER_POUND;
        // totalPrice = pricePerPound * weight;
        totalPrice = pricePerPound * weight;
        
        // Print the label using the formatting objects
        // fmt for the weight in pounds and money for the prices
        System.out.println("\n***** CS Deli *****\n");
        System.out.println("Unit Price: " + money.format(pricePerPound) + " per pound");
        System.out.println("Weight: " + fmt.format(weight) + " pounds");
        System.out.println("TOTAL: " + money.format(totalPrice));
        scan.close();
    }
}