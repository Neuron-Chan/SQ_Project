import java.lang.*;

public class Problem2 {
	/*
	 * 2. Write a class that defines an enumerated type named Rank with values ace, two, 
	 * three, four, five, six, seven, eight, nine, ten, jack, queen, king.
	*/
	
	 public enum Rank {
	        ace, two, three, four, five, six, seven, eight, nine, ten, jack, queen, king,
	    }
    
    public static void main(String[] args) {
    	
        // a) declare variables highCard, faceCard, card1, and card2 of type Rank
    	//b) Assign highCard to be an ace, faceCard to be a jack, queen or king (your choice), and card1 and card2 to be two
    	//different numbered cards (two through ten - your choice).
        Rank highCard = Rank.ace;
        Rank faceCard = Rank.queen;
        Rank card1 = Rank.six;
        Rank card2 = Rank.nine;
        
        /*
         *c) Print a line, using the highCard and faceCard objects,
         * in the following format:
		 * A blackjack hand: ace and ....
		 * The faceCard variable should be printed instead of the dots.
         */

        System.out.println("A blackjack hand: " + highCard.name() + " and " + faceCard.name());

        /*d) Declare two variables card1Val and card2Val of type int and assign them the 
         * face value of your card1 and card2 objects. Use your card1 and card2 variables
         * and the ordinal method associated with enumerated types. Remember 
         * that the face value of two is 2, three is 3, and so on so you need to make
         * a slight adjustment to the ordinal value of the enumerated type.
         */
        
        int card1Val = card1.ordinal() + 1;
        int card2Val = card2.ordinal() + 1;
        
        /*
         * e) Print two lines, using the card1 and card2 objects
         * and the name method, as follows:
         * 
         * A two card hand: (print card1 and card2)
         * Hand value: (print the sum of the face values of the two cards)
         */

        System.out.println("A two card hand: " + card1Val + " and " + card2Val);
        System.out.println("Hand value: " + (card1Val + card2Val));
    }

   

}
