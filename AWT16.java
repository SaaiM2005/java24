import java.awt.*;
import java.awt.event.*;

public class AWT16 extends Frame  
{
    int x,y;
    Color cr;
    AWT16()
    {
        super("Adapter Classes");
        addMouseListener(new MouseAdapter()  //here we got the 5 MouseListener method by mouse adapter but the 5 method will be empty parathensis
        {
            public void mouseClicked(MouseEvent e)
            {
                x=e.getX();
                y=e.getY();
                cr=new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
                draw();
            }    
        });
        addWindowFocusListener(new WindowAdapter() 
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }    
        });
        setSize(500,500);
        setVisible(true);
    }
    void draw()
    {
        Graphics g = getGraphics();
        g.setColor(cr);
        g.fillOval(x, y, 20, 20);
    }

    public static void main(String [] args)
    {
        AWT16 a=new AWT16();
    }
}
