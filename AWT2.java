/*
 *  BUTTON
 *    |
 *  ACTION EVENT
 *    |
 *  ACTION LISTENER
 */

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class AWT2 extends Frame implements ActionListener
{
    Button b1,b2;
    AWT2()
    {
        //CREATING BUTTONS
        super("USE OF BUTTON");
        b1=new Button ("OKAY");
        b2=new Button("EXIT");
    
        //ADD A LISTENER
        b1.addActionListener(this);   //this stands for object of AWT
        b2.addActionListener(this);
        
        //SETTING LAYOUT
        setLayout(null);
        b1.setBounds(50,100,100,20);
        b2.setBounds(170,100,100,20);
        
        //ADDING TO CONTAINER
        add(b1);
        add(b2);
        
        setSize(320,220);
        setResizable(false);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        Button b=(Button)e.getSource();       //TYPECASTING TO GETSOURCE
        if(b==b2)
        {
            System.exit(0);
        }
        else
        {
            System.out.println("OKAY BUTTON PRESSED!");
        }
    }
    public static void main(String[]args)
    {
        AWT2 a=new AWT2();
    }

}
