import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class AWT9 extends Frame implements WindowListener 
{
    Label l1;

    AWT9() 
    {
        super("WINDOW LISTENER");
        l1 = new Label("MESSAGE");
        l1.setBounds(50, 50, 200, 20);
        addWindowListener(this);
        setSize(400, 400);
        setLayout(null);
        add(l1);
        setVisible(true);
    }

    public void windowOpened(WindowEvent e) 
    {
        l1.setText("OPENED");
        System.out.println("OPENED");
    }

    public void windowClosed(WindowEvent e) 
    {
        l1.setText("CLOSED");
        System.out.println("CLOSED");
    }

    public void windowIconified(WindowEvent e) 
    {
        l1.setText("ICONIFIED");
        System.out.println("ICONIFIED");
    }

    public void windowDeiconified(WindowEvent e) 
    {
        l1.setText("DEICONIFIED");
        System.out.println("DEICONIFIED");
    }

    public void windowActivated(WindowEvent e) 
    {
        l1.setText("ACTIVATED");
        System.out.println("ACTIVATED");
    }

    public void windowDeactivated(WindowEvent e) 
    {
        l1.setText("DEACTIVATED");
        System.out.println("DEACTIVATED");
    }

    public void windowClosing(WindowEvent e) 
    {
        System.exit(0);
        System.out.println("CLOSED!!");
    }
    public static void main(String[] args) 
    {
        AWT9 a = new AWT9();
    }
}