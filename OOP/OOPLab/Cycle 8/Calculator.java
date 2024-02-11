import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Calculator extends JFrame {
    private JTextField display;
    private JButton[] digiButtons;
    private JButton Add, Sub, Mul, Div, Equal, Clear;

    private double num1, num2, result;
    private char operator;

    public Calculator() {
        setTitle("Calculator");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

        display = new JTextField();
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setSize(400, 200);

        digiButtons = new JButton[10];

        for (int i = 0; i < 10; i++) {
            digiButtons[i] = new JButton(String.valueOf(i));
            digiButtons[i].addActionListener(new digiButtonListener());
        }

        Add = new JButton("+");
        Sub = new JButton("-");
        Mul = new JButton("*");
        Div = new JButton("/");

        Equal = new JButton("=");
        Clear = new JButton("C");

        Add.addActionListener(new OperatorButtonListener('+'));
        Sub.addActionListener(new OperatorButtonListener('-'));
        Mul.addActionListener(new OperatorButtonListener('*'));
        Div.addActionListener(new OperatorButtonListener('/'));

        Equal.addActionListener(new EqualButtonListener());
        Clear.addActionListener(new ClearButtonListener());

        setLayout(new BorderLayout());

        add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel();

        panel.setLayout(new GridLayout(4, 4));

        panel.add(digiButtons[7]);
        panel.add(digiButtons[8]);
        panel.add(digiButtons[9]);
        panel.add(Div);

        panel.add(digiButtons[4]);
        panel.add(digiButtons[5]);
        panel.add(digiButtons[6]);
        panel.add(Mul);

        panel.add(digiButtons[1]);
        panel.add(digiButtons[2]);
        panel.add(digiButtons[3]);
        panel.add(Sub);

        panel.add(digiButtons[0]);
        panel.add(Clear);
        panel.add(Equal);
        panel.add(Add);

        add(panel, BorderLayout.SOUTH);
    }

    private class digiButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            String buttonText = button.getText();
            display.setText(display.getText() + buttonText);
        }
    }

    private class OperatorButtonListener implements ActionListener {
        char op;

        public OperatorButtonListener(char op) {
            this.op = op;
        }

        public void actionPerformed(ActionEvent e) {
            try {
                num1 = Double.parseDouble(display.getText());
                operator = op;
                display.setText("");
            } catch (NumberFormatException ex) {
                display.setText("ERROR");
            }
        }
    }

    private class EqualButtonListener implements ActionListener {
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
                            display.setText("ERROR");
                        break;
                    default:
                        break;
                }

                display.setText(String.valueOf(result));
            } catch (NumberFormatException ex) {
                display.setText("ERROR");
            }
        }
    }

    private class ClearButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display.setText("");
        }
    }
}

public class Test {

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.setVisible(true);
    }
}
