package GUI;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class Buttons extends JFrame {
    JButton button;
    ImageIcon icon;
    JLabel label;

    public Buttons() {

        icon = new ImageIcon("ISTElogo.png");

        label = new JLabel();
        label.setIcon(icon);
        label.setBounds(150, 250, 150, 150);
        label.setVisible(true);

        button = new JButton();
        button.setBounds(200, 100, 100, 50);
        button.addActionListener(e -> System.out.println("poo"));
        button.setText("Button");
        button.setFocusable(false);
        button.setIcon(icon);
        // button.setHorizontalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Poppins", Font.BOLD, 25));
        button.setForeground(Color.cyan);
        button.setBackground(Color.black);
        button.setBorder(BorderFactory.createEtchedBorder());
        // button.setEnabled(false);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("Poo");
        }
    }
}
