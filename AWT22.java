import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class AWT22 extends Frame implements ActionListener
{
    MenuBar mb;
    Menu mc,ms,mx;   //MENU COLOR,MENU SHAPE,MENU EXIT
    MenuItem c1,c2,c3,c4;
    MenuItem s1,s2,s3,s4;
    MenuItem x1,x2;
    Color cr;
    int shape;
    AWT22()
    {
        super("MENU");
        mb=new MenuBar();
        mc=new Menu("COLOR");
        c1=new MenuItem("RED");
        c2=new MenuItem("GREEN");
        c3=new MenuItem("BLUE");
        c4=new MenuItem("RANDOM");

        c1.addActionListener(this);
        c2.addActionListener(this);
        c3.addActionListener(this);
        c4.addActionListener(this);
        
        mc.add(c1);
        mc.add(c2);
        mc.add(c3);
        mc.add(c4);
        mb.add(mc);
       
        ms=new Menu("SHAPE");
        s1=new MenuItem("LINE");
        s2=new MenuItem("RECTANGLE");
        s3=new MenuItem("OVAL");
        s4=new MenuItem("FILL RECTANGLE");
        
        s1.addActionListener(this);
        s2.addActionListener(this);
        s3.addActionListener(this);
        s4.addActionListener(this);
 
        ms.add(s1);
        ms.add(s2);
        ms.add(s3);
        ms.add(s4);
        mb.add(ms);
    
        mx=new Menu("EXIT");
        x1=new MenuItem("NO");
        x2=new MenuItem("YES");
        x2.addActionListener(this);

        mx.add(x1);
        mx.add(x2);
        mb.add(mx);
        setMenuBar(mb);
        
        setSize(400,400);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        MenuItem a=(MenuItem)e.getSource();
        if(a==x2)
        {
            System.exit(0);
        }
        else
        {
            if(a==c1)
                cr=Color.RED;
            if(a==c2)
                cr=Color.GREEN;
            if(a==c3)
                cr=Color.BLUE;
            if(a==c4)
                cr=new Color((int)(Math.random()*255));
            if(a==s1)
                shape=1;  //LINE
            if(a==s2)
                shape=2;//RECTANGLE
            if(a==s3)
                shape=3;//OVAL
            if(a==s4)
                shape=4;//FILL RECTANGLE
            repaint();
        }
    }
    public void paint(Graphics g)
    {
        g.setColor(cr);
        switch(shape)
        {
            case 1:
                g.drawLine(110,70,200,200);
                break;
            case 2:
                g.drawRect(100, 70, 200, 200);
                break;
            case 3:
                g.drawOval(100, 70, 200,200);
                break;
            case 4:
                g.fillRect(110,70,200,200);
        }   
    }
    public static void main(String[] args) 
    {
        AWT22 a=new AWT22();    
    }
    
}