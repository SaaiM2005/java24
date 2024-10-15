import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JFrm16 extends JFrame implements ActionListener {

    JButton b1;
    JTextArea t1;

    JFrm16() {
        super("Color Chooser");
        b1 = new JButton("Color");
        b1.addActionListener(this);
        b1.setBounds(200, 250, 100, 30);
        
        t1 = new JTextArea();
        t1.setBounds(10, 10, 300, 200);
        
        setLayout(null);
        add(b1);
        add(t1);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ensure the program exits when closed
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        Color c = JColorChooser.showDialog(this, "Choose Color", Color.WHITE);
        if (c != null) { // Check if a color was selected
            t1.setBackground(c); // Set the background color of the JTextArea
        }
    }

    public static void main(String[] args) {
        new JFrm16();
    }
}