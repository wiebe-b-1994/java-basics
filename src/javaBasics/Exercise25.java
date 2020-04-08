package javaBasics;

import java.util.*;

public class Exercise25 {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> temp_high = new ArrayList();
        List<Integer> temp_low = new ArrayList();

        int high = scanner.nextInt();
        int low = scanner.nextInt();

        temp_high.add(high);
        temp_low.add(low);
    }
}
