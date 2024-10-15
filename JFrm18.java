import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;



public class JFrm18 extends JFrame implements ChangeListener {
    
    JSlider s1;
    JPanel p1;
    JLabel l1;

    JFrm18()
    {
        super("Slider");
        s1 = new JSlider(JSlider.HORIZONTAL,0,100,5);
        l1 = new JLabel("value");
        p1 = new JPanel();
        p1.add(s1);
        p1.add(l1);
        s1.addChangeListener(this);
        add(p1);
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setVisible(true);

    }

    public void stateChanged(ChangeEvent e)
    {
        l1.setText("Value :"+s1.getValue());
        
    }

    public static void main(String [] args)
    {
        new JFrm18();
    }
}