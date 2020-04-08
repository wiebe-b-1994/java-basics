package javaBasics;

import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        int y = scanner.nextInt();

        if (x / y == 5) {
            x = 100;
        }

        if (x * y == 5) {
            x = 1;
        }

        if (x < y) {
            x = x * 2;
        }

        if (x > y) {
            x++;
        }
    }
}
