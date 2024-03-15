import java.util.Scanner;

public class WriteTest {

    static TestQuestion tq;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        TestQuestion[] tests = new TestQuestion[n];

        for (int i = 0; i < n; i++) {
            String typeOfQ = scanner.next();
            int num = scanner.nextInt();
            if (typeOfQ.equals("e")){
                tq = new Essay(num);
            } else {
                tq = new MultChoice(num);
            }
            tq.readQuestion(scanner);
            tests[i] = tq;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(tests[i]);
        }
    }

}
