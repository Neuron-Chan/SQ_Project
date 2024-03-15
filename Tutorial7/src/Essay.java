import java.util.Scanner;

public class Essay extends TestQuestion {
    private int numBlankLines;
    public Essay(int numBlankLines){
        this.numBlankLines = numBlankLines;
    }
    @Override
    protected void readQuestion(Scanner scanner) {
        //Scanner scanner = new Scanner(System.in);
        this.question = scanner.next();

    }

    public String toString(){
        String ans = this.question + "\n";
        for (int i = 0; i < numBlankLines; i++) {
            ans += "\n";
        }
        return ans;
    }

}
