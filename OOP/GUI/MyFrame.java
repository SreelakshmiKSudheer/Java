package GUI;

import javax.swing.*;
import java.awt.Color;
import javax.swing.ImageIcon;

public class MyFrame extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        // Title
        frame.setTitle("Title");

        // size
        frame.setSize(500, 500);
        frame.setResizable(false);

        // close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // HIDE_ON_CLOSE , DO_NOTHING_ON_CLOSE

        // visibility
        frame.setVisible(true);

        ImageIcon image = new ImageIcon("ISTE logo.png");
        frame.setIconImage(image.getImage());

        // frame.getContentPane().setBackground(new Color(255,255, 255));
        frame.getContentPane().setBackground(new Color(0xffffff));
        // frame.getContentPane().setBackground(Color.green);

    }
}
