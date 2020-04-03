

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {


    JLabel display = new JLabel("");
    String operator;
    int firstNumber;
    int secondNumber;

    public Calculator() {

        String[] labels = { "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "+",
                "C", "0", "=", "-" };
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));
        getContentPane().add(panel, BorderLayout.CENTER);

        for(int i = 0; i< 16; i++) {
            JButton button = new JButton(labels[i]);
            panel.add(button);
            button.addActionListener(this);
        }

        getContentPane().add(display, BorderLayout.NORTH);


    }

    public static void main(String[] args) {
        // write your code here
        Calculator calculator = new Calculator();
        calculator.setSize(400, 400);
        calculator.setVisible(true);
        calculator.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String currentButton = e.getActionCommand();

        switch (currentButton) {
            // number state
            case "0": case "1": case "2": case "3": case "4":
            case "5": case "6": case "7": case "8": case "9":
                display.setText(display.getText() + currentButton);
                break;
            //operator state
            case "/": case "*": case "+": case "-":
                operator = currentButton;
                firstNumber = Integer.parseInt(display.getText());
                display.setText("");
                break;
            // calculator state
            case "=":
                secondNumber = Integer.parseInt(display.getText());
                int result = 0;
                switch (operator) {
                    case "+":
                        result = firstNumber + secondNumber;
                        break;
                    case "-":
                        result = firstNumber - secondNumber;
                        break;
                    case "*":
                        result = firstNumber * secondNumber;
                        break;
                    case "/":
                        result = firstNumber / secondNumber;
                        break;
                }
                display.setText(result + "");
                break;
            // reset state
            case "C":
                firstNumber = secondNumber = 0;
                display.setText("");
                break;
            // you should never come here
            default:
                System.out.println("System Error");
        }
    }
}