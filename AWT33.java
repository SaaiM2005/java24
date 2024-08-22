import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWT33 extends Frame implements KeyListener,ActionListener
{
    TextArea ta;
    Label l1;
    Button b1,b2;
    AWT33() 
    {
        super("Key Listener");
        ta = new TextArea();
        l1 = new Label("Message");
        b1=new Button("Character");
        b2=new Button("Words");
        b1.addActionListener(this);
        b2.addActionListener(this);

        ta.addKeyListener(this);
        addWindowListener(new WindowAdapter() 
        {
            public void windowClosing(WindowEvent e) 
            {
                System.exit(0);
            }
        });
        setLayout(null);
        l1.setBounds(50, 50, 200, 20);
        ta.setBounds(50, 80, 100, 100);
        b1.setBounds(50,290,90,20);
        b2.setBounds(160,290,90,20);
        add(l1);
        add(ta);
        add(b1);
        add(b2);
        setSize(300, 360);
        setVisible(true);
    }

    public void keyPressed(KeyEvent e) 
    {
    }

    public void keyReleased(KeyEvent e) 
    {
    }

    public void keyTyped(KeyEvent e) 
    {
        l1.setText("Key Typed");
    }
    public void actionPerformed(ActionEvent e)
    {
        Button b=(Button)e.getSource();
        if(b==b1)
        {
            String str=ta.getText();
            l1.setText("CHARACTER COUNT:"+str.length()); 
        }
        if(b==b2)
        {
            String str=ta.getText();
            String[]words=str.split("\\s");
            l1.setText("WORD COUNT:"+words.length);
        }
    }

    public static void main(String[] args) 
    {
        AWT33 a = new AWT33();
    }
}