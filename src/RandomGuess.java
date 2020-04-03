
// program where the user has to guess a random number in the range 1 to 1000

import javax.swing.JOptionPane;

public class RandomGuess {

    public static void main(String[] args) {


        // generate a random number from 1 to 1000
        int computerNumber = (int) (Math.random() * 1000 + 1);


        // random number generated will be shown in output window
        System.out.println("The correct guess would be " + computerNumber);


    }
}