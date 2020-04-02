import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperature");
        int celsius = scanner.nextInt();

        double fahr = ((1.8 * celsius) + 32);

        System.out.println(fahr);

    }
}
