import java.util.*;

public class Exercise23 {

    public static void main(String args[]) {
        List<String> names = new ArrayList();
        names.add("John");
        names.add("Mark");
        names.add("Frank");

        List<String> birthday = new ArrayList();
        birthday.add("March 26, 1930");
        birthday.add("June 1, 1992");
        birthday.add("January 15, 2005");

        List<String> numbers = new ArrayList();
        numbers.add("564654645");
        numbers.add("546546545");
        numbers.add("787987888");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of person");
        String name_guess = scanner.nextLine();

        if (name_guess.equals("John")) {
            System.out.println(names.get(0) + ", Birthday: " + birthday.get(0) + ", Number: " + numbers.get(0));
        } else if (name_guess.equals("Mark")) {
            System.out.println(names.get(1) + ", Birthday: " + birthday.get(1) + ", Number: " + numbers.get(1));
        } else if (name_guess.equals("Frank")) {
            System.out.println(names.get(2) + ", Birthday: " + birthday.get(2) + ", Number: " + numbers.get(2));
        }
    }
}
