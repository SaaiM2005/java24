import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Bounce 
{
    public static void main(String [] args)
    {
        BounceFrame b=new BounceFrame();

    }
}
class BounceFrame extends Frame implements ActionListener
{
    Button bn,bx;
    Panel p,q;
    BounceFrame()
    {
        super("Bouncing Ball");
        bn=new Button("New Object");
        bx=new Button("Exit");
        
        bn.addActionListener(this);
        bx.addActionListener(this);
        q=new Panel();
        q.add(bn);
        q.add(bx);
        add(q,BorderLayout.SOUTH);

        p=new Panel();
        add(p,BorderLayout.CENTER);
        setSize(400,400);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        Button b=(Button)e.getSource();
        if(b==bx)
        {
            System.exit(0);
        }
        else
        {
            Ball a=new Ball(p);
        }
    }
}
class Ball extends Thread
{
    int x,y;
    Color cr;
    static int xsize=10;
    static int ysize=10;
    int dx,dy;
    Panel box;
    Ball(Panel p)
    {
        super();
        dx=dy=2;
        box=p;
        cr=new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
        x=0;
        y=((int)(Math.random()*400));
        start();
    }
    public void run()
    {
        while(true)
        {
            move();
            try
            {
                Thread.sleep(10);
            }
            catch(Exception e){}
        }
    }
    void move()
    {
        Graphics g=box.getGraphics();
        g.setColor(Color.WHITE);
        g.fillOval(x,y,xsize,ysize);
        x=x+dx;
        y=y+dy;
        g.setColor(cr);
        g.fillOval(x,y,xsize,ysize);
        if(x<0)
        {
            dx=-dx;
            x=0;
        }       
        if(y<0)
        {
            dy=-dy;
            y=0;
        } 
        if(x+xsize>400)
        {
            dx=-dx;
            x=390;
        }
        if(y+ysize>400)
        {
            dy=-dy;
            y=390;
        }
    }
}