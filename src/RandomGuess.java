import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RandomGuess extends JFrame implements ActionListener {

    JButton button = new JButton("OK");
    JLabel display = new JLabel("Enter number between 1 and 1000");

    public RandomGuess() {
        getContentPane().add(button, BorderLayout.SOUTH);
        getContentPane().add(display, BorderLayout.NORTH);

        button.addActionListener(this);
    }

    public static void main(String[] args) {
        // write your code here
        RandomGuess randomguess = new RandomGuess();
        randomguess.setSize(400, 400);
        randomguess.setVisible(true);
        randomguess.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        display.setText("clicked");
    }
}