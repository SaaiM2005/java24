import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
public class Client4 extends Frame implements Runnable,ActionListener
{
    Label l1,l2;
    TextArea t1,t2;
    Button b1,b2;
    Thread th;
    Socket s;
    DataOutputStream dos;
    DataInputStream dis;
    String str;
    Client4()
    {
        super("Client");
        l1=new Label("From Server");
        l2=new Label("To Server");

        t1=new TextArea("",10,60,TextArea.SCROLLBARS_BOTH);
        t1.setEditable(false);

        t2=new TextArea("",10,60,TextArea.SCROLLBARS_BOTH);
       // t2.setEditable(false);

        b1=new Button("Send");
        b2=new Button("Exit");

        b1.addActionListener(this);
        b2.addActionListener(this);

        setLayout(null);

        l1.setBounds(50,50,100,20);
        t1.setBounds(50,80,150,100);

        l2.setBounds(50,190,100,20);
        t2.setBounds(50,220,150,100);

        b1.setBounds(50,330,70,20);
        b2.setBounds(130,330,70,20);

        setSize(250,400);
        

        add(l1);
        add(t1);

        add(l2);
        add(t2);

        add(b1);
        add(b2);

        setVisible(true);
        try
        {
            s=new Socket("LocalHost",9294);
            dos=new DataOutputStream(s.getOutputStream());
            dis=new DataInputStream(s.getInputStream());
            th=new Thread(this);
            th.start();
        }
        catch(Exception e){}
    }
    public void actionPerformed(ActionEvent e)
    {
        Button b=(Button)e.getSource();
        if(b==b2)
        {
            System.exit(0);
        }
        else
        {
            try
            {
                str=t2.getText();
                dos.writeUTF(str);
                t2.setText("");
            }
            catch(Exception e1){}
        }
    }
    public void run()
    {
        while(true)
        {
            try
            {
                str=dis.readUTF(); //reads message send by client
                str=t1.getText()+"\n"+str;
                t1.setText(str);    
            }
            catch(Exception e){}
        }
    }
    public static void main(String [] args) throws Exception 
    {
        Client4 a=new Client4();
    }   
}