
// program where the user has to guess a random number in the range 1 to 1000

import javax.swing.JOptionPane;

public class RandomGuess {

    public static void main(String[] args) {


        // generate a random number from 1 to 1000
        int computerNumber = (int) (Math.random() * 1000 + 1);


        // random number generated will be shown in output window
        System.out.println("The correct guess would be " + computerNumber);


        for (int count = 1; count <= 1000; count++) {
            String response = JOptionPane.showInputDialog(null,
                    "Enter a guess between 1 and 1000");
            int userAnswer = Integer.parseInt(response);

            JOptionPane.showMessageDialog(null, "Your guess is " + userAnswer
                    + determineGuess (userAnswer, computerNumber)
                    + "\nTry number " + count);}
    }

    public static String determineGuess(int userAnswer, int computerNumber) {
        // responses based on user answer input

        String message = null;
        if (userAnswer <= 0 || userAnswer > 1000) {
            message = " Invalid guess";
        } else if (userAnswer < computerNumber) {
            message = " Guess higher";
        } else if (userAnswer > computerNumber) {
            message = "Guess lower";

        } else if (userAnswer == computerNumber) {
            JOptionPane.showMessageDialog(null, " You Are A Winner");
            System.exit(userAnswer);

        }return message;
    }
}