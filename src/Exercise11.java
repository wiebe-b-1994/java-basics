import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("how many product numbers?");
        int prod_nums = scanner.nextInt();


        int total_value = 0;


        for (int i = 0; i < prod_nums; i++) {
            System.out.println("Enter product number");
            int prod_num = scanner.nextInt();

            System.out.println("Enter amount of these products");
            int amount = scanner.nextInt();

            System.out.println("Enter price");
            int price = scanner.nextInt();

            total_value = total_value + (amount * price);
        }

        System.out.println("total value: " + total_value);
    }
}
