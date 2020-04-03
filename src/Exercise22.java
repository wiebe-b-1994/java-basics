import java.util.*;

public class Exercise22 {

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    public static void main(String[] args) {

        List PrimeList = new ArrayList();

        int i = 0;
        int count = 0;

        while(true) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                PrimeList.add(i);
                count++;
            }
            i++;

            if (count == 10) {
                break;
            }
        }
    }
}
