import java.awt.Button;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class StuDialog extends Dialog implements ActionListener
{
    Label l1,l2,l3;
    TextField t1,t2,t3;
    Button b1,b2;
    int no,mrk;
    String nm;
    StuDialog(Frame prnt,String title,Boolean state)
    {
        super(prnt,title,state);
        l1=new Label("Roll No:");
        l2=new Label("Name:");
        l3=new Label("Marks:");
        t1=new TextField(10);
        t2=new TextField(30);
        t3=new TextField(10);
        b1=new Button("OK");
        b2=new Button("Exit");
        b1.addActionListener(this);
        b2.addActionListener(this);
        setLayout(new GridLayout(4,2,5,5));
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        add(b2);
        setSize(300,300);
    }
    public void actionPerformed(ActionEvent e)
    {
        Button b=(Button)e.getSource();
        if(b==b2)
            setVisible(false);
        else
        {
            try
            {
                no=Integer.parseInt(t1.getText());
                nm=t2.getText();
                mrk=Integer.parseInt(t3.getText());
                System.out.println("Roll No:"+no+" Name:"+nm+" Marks:"+mrk);
            }
            catch(Exception e1){}
        }
    }
}
public class AWT21 extends Frame implements ActionListener 
{
    Button b1,b2;
    StuDialog dlg;
    AWT21()
    {
        super("Student Dialog");
        b1=new Button("Dialog");
        b2=new Button("Exit");
        b1.addActionListener(this);
        b2.addActionListener(this);
        dlg=new StuDialog(this,"Student",true);
        setLayout(null);
        b1.setBounds(50,100,50,20);
        b2.setBounds(50,200,50,20);
        add(b1);
        add(b2);
        setSize(200,320);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        Button b=(Button)e.getSource();
        if(b==b2)
            System.exit(0);
        else
            dlg.setVisible(true);
    }
    public static void main(String [] args)
    {
        AWT21 a=new AWT21();
    }
}