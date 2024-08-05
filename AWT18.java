import java.awt.*;
import java.awt.event.*;
public class AWT18 extends Frame 
{
    int x,y,w,h;
    Color cr;
    AWT18()
    {
        super("Mouse");
        addMouseListener(new MouseAdapter() 
        {
            public void mousePressed(MouseEvent e)   //MouseAdapter has mouse listener interface i.e 7 methods .MouseAdapter helps not to initalize every 7 methods separately mouse adpter has inbuilt 7 methods            
            {
                x=e.getX();
                y=e.getY();
                w=h=0;
            }
            public void mouseReleased(MouseEvent e)
            {
                w=e.getX()-x;
                h=e.getY()-y;
                cr=new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
            }                                  
        });
        addMouseMotionListener(new MouseMotionAdapter() 
        {
            public void mouseDragged(MouseEvent e)
            {
                draw();
                w=e.getX()-x;
                h=e.getY()-y;
                draw();
            }
        });
        addWindowListener(new WindowAdapter() 
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }    
        });
        setSize(400,400);
        setVisible(true);
    }
    public void draw()
    {
        Graphics g=getGraphics();
        g.setXORMode(Color.WHITE);
        g.drawRect(x, y, w, h);
        g.setColor(cr);
        g.drawRect(x, y, w, h);
    }
    public static void main(String [] args)
    {
        AWT18 a=new AWT18();
    }
}
