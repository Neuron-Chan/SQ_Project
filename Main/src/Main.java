public class Main{
	
	public static void main(String [] args) {
		
		String phrase = "Change is inevitable";
		String mutation1, mutation2, mutation3, mutation4;
		
		System.out.println("The original string:\"" + phrase + "\" ");
		System.out.println("The length of the original string: " + phrase.length());
		mutation1 = phrase.toUpperCase();
		System.out.println(mutation1);
		
		mutation2 = mutation1.replace(' ', '_');
		System.out.println(mutation2);
		
		mutation3 = mutation2.substring(2,8);
		System.out.println(mutation3);
		
		
	} 
}