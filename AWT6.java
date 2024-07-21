import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
class AWT6 extends Frame implements ActionListener
{
    Label l1,l2,l3;
    TextField t1,t2,t3;
    Button b1,b2;
    int no,mrk;
    String nm;
    AWT6()
    {
        super("STUDENT");
        l1=new Label("ROLL NO:");
        l2=new Label("NAME");
        l3=new Label("MARKS");
        
        t1=new TextField(10);
        t2=new TextField(30);
        t3=new TextField(10);
    
        b1=new Button("OK");
        b2=new Button("EXIT");

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
        setSize(300,400);
        setResizable(true);
        setVisible(true);
    }//////////////////////////////////////////////////////////////////////////////
    public void actionPerformed(ActionEvent e)
    {
        Button b=(Button)e.getSource();   //typecasting
        if(b==b2)  //exit button
        {
            System.exit(0);
        }
        else
        {
            try
            {
                no=Integer.parseInt(t1.getText());    //NUMBER TO INTEGER CONVERSION
            }catch(Exception e1)
            {
                t1.requestFocus();  
                return;     
            }
            
            if(no<=0)
            {
                t1.requestFocus();
                return;
            }
            
            nm=(t2.getText()).trim();   //IT TRIMS LEADING AND TRAILING EMPTY LINES
            if(nm.length()==0)    //if name is typed
            {
                t2.requestFocus();
                return;
            }
            try
            {
                mrk=Integer.parseInt(t3.getText());
            }catch(Exception e2)
            {
                t3.requestFocus();
                return;
            }
            
            if(mrk<=0 || mrk>100)
            {
                t3.requestFocus();
                return;
            }
            String str="ROLL NO:"+no+"\nNAME:"+nm+"\nMARKS:"+mrk;
            JOptionPane.showMessageDialog(null, str);
            t1.requestFocus();
        }
        
    }
    public static void main(String [] args)
	{
		AWT6 a=new AWT6();
	}
}