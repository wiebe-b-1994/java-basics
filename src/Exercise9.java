import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number in the range of 1 and 10");



        while(true) {
            int number = scanner.nextInt();

            if (number >= 1 | number <= 10) { // werkt nog niet goed
                System.out.println("valid");
                break;
            }
            System.out.println("invalid");
        }
    }
}
