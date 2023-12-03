package GUI;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;

public class Panels {
    public static void main(String[] args) {

        JLabel label = new JLabel();
        label.setText("HI");
        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.RIGHT);

        JPanel redpanel = new JPanel();
        redpanel.setBackground(Color.red);
        redpanel.setBounds(0, 0, 250, 250);
        redpanel.setLayout(new BorderLayout());

        JPanel orangepanel = new JPanel();
        orangepanel.setBackground(Color.orange);
        orangepanel.setBounds(250, 0, 250, 250);
        orangepanel.setLayout(new BorderLayout());

        JPanel greenpanel = new JPanel();
        greenpanel.setBackground(Color.green);
        greenpanel.setBounds(0, 250, 250, 250);
        greenpanel.setLayout(null );

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750, 750);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.add(redpanel);
        frame.add(orangepanel);
        frame.add(greenpanel);
    }

}
