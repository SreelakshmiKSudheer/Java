import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;

class Traffic_Light extends JPanel implements ActionListener {

    private JRadioButton r1, r2, r3;
    private Color Red, Orange, Green;

    public Traffic_Light() {
        setBounds(0, 0, 600, 480);
        r1 = new JRadioButton("Red");
        r2 = new JRadioButton("Orange");
        r3 = new JRadioButton("Green");

        ButtonGroup buttongroup = new ButtonGroup();

        r1.setSelected(true);

        buttongroup.add(r1);
        buttongroup.add(r2);
        buttongroup.add(r3);

        add(r1);
        add(r2);
        add(r3);

        Red = Color.red;
        Orange = getBackground();
        Green = getBackground();

        r1.addActionListener((ActionListener) this);
        r2.addActionListener((ActionListener) this);
        r3.addActionListener((ActionListener) this);

    }

    public void actionPerformed(ActionEvent e) {
        if (r1.isSelected() == true) {
            Red = Color.red;
            Orange = getBackground();
            Green = getBackground();

        } else if (r2.isSelected() == true) {
            Red = getBackground();
            Orange = Color.orange;
            Green = getBackground();
        } else {
            Red = getBackground();
            Orange = getBackground();
            Green = Color.green;
        }
        repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(50, 50, 50, 50);
        g.drawOval(50, 110, 50, 50);
        g.drawOval(50, 170, 50, 50);

        g.setColor(Red);
        g.fillOval(50, 50, 50, 50);

        g.setColor(Orange);
        g.fillOval(50, 110, 50, 50);

        g.setColor(Green);
        g.fillOval(50, 170, 50, 50);

    }

}

public class TrafficLight {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Traffic Light");
        frame.setVisible(true);
        frame.setSize(600, 480);
        frame.setLayout(null);
        Traffic_Light t = new Traffic_Light();
        frame.add(t);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}