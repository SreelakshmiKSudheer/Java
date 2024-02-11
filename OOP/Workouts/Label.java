import javax.swing.*;
import java.awt.*;
import java.awt.Color;

public class Label extends JFrame {
    JLabel l1, l2;

    public Label() {
        setTitle("Sample");
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(400, 400);

        l1 = new JLabel("Welcome");
        l2 = new JLabel("Hey");
        l1.setBounds(50, 100, 100, 70);
        l2.setBounds(50, 150, 100, 100);
        l1.setBackground(Color.CYAN);
        l1.setOpaque(true);
        add(l1);
        add(l2);
        setVisible(true);

    }

    public static void main(String[] args) {
        Test t = new Test();
    }
}
