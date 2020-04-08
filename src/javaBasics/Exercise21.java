package javaBasics;

import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int sum = 0, dig = 0;

        while(num > 0) {
            dig = num % 10;
            sum += dig;
            num = num / 10;
        }

        System.out.println(sum);
    }
}
