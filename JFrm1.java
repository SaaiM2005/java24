import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JFrm1 extends JFrame
{
    JFrm1()
    {
        super("Frame");
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String [] args)
    {
        JFrm1 a=new JFrm1();
    }
}