import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

import javax.imageio.ImageIO;
class AWT19 extends Frame 
{
    Image img;
    AWT19()
    {
        super("DRAW IMAGE:");
        File f=new File("C:\\WORKDIR\\JAVA24\\img1.jpg");
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
        setSize(400,400);
        setVisible(true);
    }
    public void paint(Graphics g)
    {
        g.drawImage(img,400,400,this);
    }
    public static void main(String[]args)
    {
        AWT19 a=new AWT19();
    }
}