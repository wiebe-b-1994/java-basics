package javaBasics;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an article");
        String article = scanner.nextLine();

        System.out.println("Enter a noun");
        String noun = scanner.nextLine();

        System.out.println("Enter a verb");
        String verb = scanner.nextLine();

        System.out.println(article + " " + noun + " " + verb);
    }
}
