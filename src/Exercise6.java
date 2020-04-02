import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 0;


        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            int test = scanner.nextInt();

            if (test > 7) {
                a++;
            }
        }

        System.out.println("Groter dan 7: " + a);
    }
}
