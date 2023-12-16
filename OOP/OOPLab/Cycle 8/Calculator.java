/*
 Write a Java program that works as a simple calculator. Arrange Buttons for digits and
the + - * % operations properly. Add a text field to display the result. Handle any possible
exceptions like divide by zero. Use Java Swing.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    private JTextField display;
    private JButton[] digitButton;
    private JButton Add, Sub, Mul, Div, Equal, Clear;

    private double num1, num2, result;
    private char operator;

    public Calculator() {
        setSize(400, 600);
        setTitle("Calculator");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        display = new JTextField();
        display.setEditable(false);
        display.setSize(400, 200);
        display.setHorizontalAlignment(JTextField.RIGHT);

        digitButton = new JButton[10];

        for (int i = 0; i < 10; i++) {
            digitButton[i] = new JButton(String.valueOf(i)); // parameter String -- valueOf i is converted to String
            digitButton[i].addActionListener(new DigitListener());
        }

        Add = new JButton("+");
        Sub = new JButton("-");
        Mul = new JButton("*");
        Div = new JButton("/");
        Equal = new JButton("=");
        Clear = new JButton("C");

        Add.addActionListener(new OperatorListener('+'));
        Sub.addActionListener(new OperatorListener('-'));
        Mul.addActionListener(new OperatorListener('*'));
        Div.addActionListener(new OperatorListener('/'));
        Equal.addActionListener(new EqualListener());
        Clear.addActionListener(new ClearListener());

        setLayout(new BorderLayout());

        add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setSize(400, 400);
        panel.setLayout(new GridLayout(4, 4));

        panel.add(digitButton[7]);
        panel.add(digitButton[8]);
        panel.add(digitButton[9]);
        panel.add(Div);

        panel.add(digitButton[4]);
        panel.add(digitButton[5]);
        panel.add(digitButton[6]);
        panel.add(Mul);

        panel.add(digitButton[1]);
        panel.add(digitButton[2]);
        panel.add(digitButton[3]);
        panel.add(Sub);

        panel.add(digitButton[0]);
        panel.add(Clear);
        panel.add(Equal);
        panel.add(Add);

        add(panel, BorderLayout.CENTER);

        setVisible(true);
    }

    private class DigitListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            JButton button = (JButton) e.getSource();
            String ButtonText = button.getText();
            display.setText(display.getText() + ButtonText);
        }
    }

    private class OperatorListener implements ActionListener {
        private char op;

        public OperatorListener(char operator) {
            this.op = operator;
        }

        public void actionPerformed(ActionEvent e) {
            try {
                num1 = Double.parseDouble(display.getText());
                operator = op;
                display.setText("");

            } catch (NumberFormatException ex) {
                display.setText("Error");
            }
        }

    }

    private class ClearListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display.setText("");
        }
    }

    private class EqualListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                num2 = Double.parseDouble(display.getText());

                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        if (num2 != 0)
                            result = num1 / num2;
                        else
                            display.setText("Division by Zero. Not Deffined");
                        break;
                }
                display.setText(String.valueOf(result));
            } catch (NumberFormatException exe) {
                display.setText("Error");
            }
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setVisible(true);
    }
}
