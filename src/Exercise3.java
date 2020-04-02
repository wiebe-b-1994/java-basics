import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side 1");
        int side1 = scanner.nextInt();

        System.out.println("Enter side 2");
        int side2 = scanner.nextInt();

        int side3 = side1*side1 + side2*side2;

        System.out.println(Math.sqrt(side3));
    }
}
