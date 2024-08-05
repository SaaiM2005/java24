import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
class Shape implements Serializable
{
    int x1,y1,x2,y2;
    Color cr;
    Shape(int a,int b,int c,int d, Color e) //Argument 
    {
        x1=a;
        y1=b;
        x2=c;
        y2=d;
        cr=e;
    }
}
class MyObject
{
    Shape obj;
    LinkedList<Shape>ls;
    MyObject()
    {
        obj=null;
        ls=new LinkedList<Shape>();
    }
    void add()
    {
        ls.add(obj);
    }
    void draw(Graphics g)
    {
        int i=0,n=ls.size();
        while(i<n)
        {
            obj=ls.get(i);
            g.setColor(obj.cr);
            g.drawRect(obj.x1, obj.y1, obj.x2, obj.y2);
            i++;
        }
    }
}
public class AWT15 extends Frame implements WindowListener,MouseListener
{
    
    int x1,x2,y1,y2,flag;
    Color cr;
    MyObject a;
    AWT15()
    {
        super("Mouse");
        a=new MyObject();
        flag=0;
        cr=new Color(0,0,0);
        addWindowListener(this);
        addMouseListener(this);
        setSize(400,400);
        setVisible(true);
    }
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }
    public void windowOpened(WindowEvent e){}
    public void windowClosed(WindowEvent e){}
    public void windowActivated(WindowEvent e){}
    public void windowDeactivated(WindowEvent e){}
    public void windowIconified(WindowEvent e){}
    public void windowDeiconified(WindowEvent e){}

    public void mousePressed(MouseEvent e)
    {
        // x=e.getX();
        // y=e.getY();
        // draw();
    }
    public void mouseReleased(MouseEvent e)
    {
    }
    public void mouseClicked(MouseEvent e)
    {
        if(flag==0)
        {
            x1=e.getX();
            y1=e.getY();
            flag=1;
        }
        else
        {
            x2=e.getX()-x1;
            y2=e.getY()-y1;
            cr=new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
            flag=0;
            a.obj=new Shape (x1,y1,x2,y2,cr);
            a.add();
            repaint();
            // draw();
            
        }
    }
    public void mouseEntered(MouseEvent e)
    {
    }public void mouseExited(MouseEvent e)
    {
    }
    public void paint(Graphics g)
    {
        a.draw(g);
    }
    void draw()
    {
        Graphics g= getGraphics();
        g.setColor(cr);
        //g.drawRect(x1,y1,x2,y2);
        g.fillRect(x1,y1,x2,y2);
    }
    public static void main(String [] args)
    {
        AWT15 a=new AWT15();
    } 
}
