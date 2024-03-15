/*
 * 3. Write a complete Java program that simulates the rolling of a pair of dice.
 * For each die in the pair, the program should
 * generate a random number between 1 and 6 (inclusive). 
 * It should print out the result of the roll for each die and the total roll
 * (the sum of the two dice), all appropriately labeled. You must use the Random class.
 */
import java.util.Random;

public class Problem3 {

    public static void main(String[] args) {
        Random rand = new Random();
        int num1 = rand.nextInt(1, 6);
        int num2 = rand.nextInt(1, 6);
        int sum = num1 + num2;
        System.out.println("Dice 1: " + num1);
        System.out.println("Dice 2: " + num2);
        System.out.println("Sum: " + sum);
    }
}