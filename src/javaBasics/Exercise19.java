package javaBasics;

import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int len = 0, a = 0;

        while(scanner.hasNext()) {
            String s = scanner.nextLine();
            len = s.length();
            char[] charAnalysis = s.toCharArray();
            for (char element : charAnalysis) {
               if (element == 'a') {
                   a++;
               }
            }
            break;
        }

        System.out.println(a);
    }
}
