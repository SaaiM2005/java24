import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

import javax.imageio.ImageIO;
class AWT20 extends Frame 
{
    Image img;
    int x,y;
    AWT20()
    {
        super("DRAW IMAGE:");
        x=80;
        y=80;
        File f=new File("C:\\WORKDIR\\JAVA24\\img2.jpg");
        try
        {
            img=(Image)(ImageIO.read(f));
        }catch(Exception e){}
        addWindowListener(new WindowAdapter() {
            public void WindowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e)
            {
                x=e.getX();
                y=e.getY();
                repaint();
            }
        });
        setSize(400,400);
        setVisible(true);
    }
    public void paint(Graphics g)
    {
        g.drawImage(img,x,y,100,100,this);
    }
    public static void main(String[]args)
    {
        AWT20 a=new AWT20();
    }
}