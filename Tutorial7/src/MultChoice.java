import java.util.Scanner;

public class MultChoice extends TestQuestion{
    private int numChoices;
    private String[] choices;
    public MultChoice(int n){
        this.numChoices = n;
        //this.choices = choices;
    }
    @Override
    protected void readQuestion(Scanner scanner) {
        //Scanner scanner = new Scanner(System.in);
        this.question = scanner.next();
        //String choices[] = new String[num];
        choices = new String[numChoices];
        for (int j = 0; j < numChoices; j++) {
            String choice = scanner.nextLine();
            choices[j] = choice;
        }
    }

    public String toString(){
        String ans = question + "\n";
        for (int i = 0; i < numChoices; i++) {
            ans += this.choices[i] + "\n";
        }
        return ans;
    }
}
