public class problem3 {
	
	static String recursion(String str) {
		
		
		
		if (str.length() == 0) {
			System.out.println(str);
			return "";
		}
		else {
			System.out.print(str.substring(str.length() - 1));
			return recursion(str.substring(0, str.length() - 1)); 
		}
	}
	public static void main(String[] args) {
		
		String word = "Hello";
		recursion(word);
		
	}
}