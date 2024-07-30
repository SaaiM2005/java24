
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class AWT14 extends Frame implements WindowListener, MouseListener {
    int x1, y1,x2,y2,flag;
    Color cr;

    AWT14() {
        super("MOUSE");
        flag=0;
        cr = new Color(0, 0, 0); // new addition to the previous code
        addWindowListener(this);
        addMouseListener(this);
        setSize(400, 400);
        setVisible(true);
    }

    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    public void windowOpened(WindowEvent e) {
    }

    public void windowClosed(WindowEvent e) {
    }

    public void windowActivated(WindowEvent e) {
    }

    public void windowDeactivated(WindowEvent e) {
    }

    public void windowIconified(WindowEvent e) {
    }

    public void windowDeiconified(WindowEvent e) {
    }

    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

    public void mouseClicked(MouseEvent e) {
        if(flag==0)
        {
            x1= e.getX();
            y1 = e.getY();
            flag=1;
        }
        else
        {
            x2= e.getX()-x1;
            y2= e.getY()-y1;
            cr = new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
            draw();
            flag=0;
        }
        // Generate a random color
        
    }

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}

    void draw()
    {
        Graphics g=getGraphics();
        g.setColor(cr);
        //g.drawRect(x1,y1,x2,y2);
        g.fillRect(x1,y1,x2,y2);
    }

    public static void main(String[] args) {
        AWT14 a = new AWT14();
    }
}
