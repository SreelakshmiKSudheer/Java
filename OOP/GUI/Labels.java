package GUI;

import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Font;

public class Labels {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("ISTE logo.png"); // opening img
        Border border = BorderFactory.createLineBorder(Color.yellow, 3); // setting border

        JLabel label = new JLabel(); // label
        label.setText("Hey, How do you do"); // label text
        label.setIcon(image); // label icon
        label.setHorizontalTextPosition(JLabel.CENTER); //
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0xff0000)); // font color
        label.setFont(new Font("Poppins", Font.PLAIN, 20)); // font type
        label.setIconTextGap(10); // gap b/w text andicon
        label.setBackground(Color.black); // text bg color
        label.setOpaque(true);
        label.setBorder(border); // setting border to label
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        // label.setBounds(0, 0, 350, 350); // x,y pos and x,y dimension

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        // frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack(); // sets the frame's size so that it is just the space for the components

    }
}
