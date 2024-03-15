import java.util.Scanner;
import java.util.Stack;

public class Problem1 {

    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println("enter string. # to backspace");
        Scanner scan = new Scanner(System.in);
        String userIn = scan.nextLine();
        
        for (int i = 1; i < userIn.length()+1; i++) {
            if (!userIn.substring(i-1, i).equals("#")) {
                stack.push(userIn.substring(i-1, i));
            } else {
                stack.pop();
            }
        }
        
        System.out.print(stack);
        
    }
}