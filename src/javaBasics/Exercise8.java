package javaBasics;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers");

        int a = 0;

        int max = 0;

        for (int i = 0; i < 3; i++) {
            a = scanner.nextInt();

            if (a > max) {
                max = a;
            }
        }

        System.out.print(max);

    }
}
