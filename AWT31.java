import java.awt.Button;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class AWT31 extends Frame implements ActionListener  
{
    Choice obj;
    Button b1,b2,b3,b4;
    AWT31()
    {
        super("List");
        obj = new Choice();
        b1=new Button("Add");
        b2=new Button("Rem");
        b3=new Button("Display");
        b4=new Button("Exit");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        setLayout(null);

        obj.setBounds(50,80,100,140);

        b1.setBounds(170,80,50,20);
        b2.setBounds(170,120,50,20);
        b3.setBounds(170,160,50,20);
        b4.setBounds(170,200,50,20);

        add(obj);
        add(b1);
        add(b2);
        add(b3);
        add(b4);

        Label l1=new Label("City");
        l1.setBounds(50,50,100,20);

        add(l1);
        setSize(270,270);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        Button b=(Button)e.getSource();
        if(b==b4)
        {
            System.exit(0);
        }
        if(b==b1)
        {
            String str=JOptionPane.showInputDialog(null,"City Name:");
            obj.add(str);
        }
        if(b==b2)
        {
            int pos=obj.getSelectedIndex();
            if(pos!=-1)
            {
                obj.remove(pos);
            }
        }
        if(b==b3)
        {
            int i=0,n=obj.getItemCount();
            while(i<n)
            {
                JOptionPane.showMessageDialog(null,obj.getItem(i));
                i++;
            }
        }
    }
    public static void main(String [] args)
    {
        AWT31 a=new AWT31();
    }
}