import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.LinkedList;

import mypkg.Util;


class Book
{
    int bno;
    String bnm;
    int bprice;
    boolean bstate;

    Book(int no,String nm,int price,boolean state)
    {
        no=bno;
        nm=bnm;
        price=bprice;
        state = bstate;
    }
    public String toString()
    {
        String s ="Book Data\nNo:"+bno+"\nNAme:"+bnm+"\nPrice:"+"\nState"+bstate;
        return s;
    }
    void display()
    {
        Util.display(toString());
    }
}   


//Adding book class
class BAdd extends Dialog implements FocusListener , ActionListener
{
    Panel p1,p2;
    Button b1,b2;
    Label l1,l2,l3;
    TextField t1,t2,t3,t4;
    LinkedList <Book> ls;
    int no,price;
    String nm ; boolean state;

    Book obj;
    BAdd(Frame f,String t,LinkedList <Book> l,boolean state)
    {
        super(f,t,state);
        ls=l;
        l1=new Label("Book No:");
        l2=new Label("Name:");
        l3=new Label("Price:");

        t1=new TextField(10);
        t2=new TextField(30);
        t3=new TextField(10);
        t1.addFocusListener(this);

        p1=new Panel();
        p1.setLayout(new GridLayout(3,2,5,5));
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(t3);

        add(p1,BorderLayout.CENTER);

        b1=new Button("Add");
        b2=new Button("Back");

        b1.addActionListener(this);
        b2.addActionListener(this);

        p2=new Panel();
        p2.add(b1);
        p2.add(b2);

        add(p2,BorderLayout.SOUTH);

        setSize(400,300);
        setVisible(true);
         
    }
    public void focusGained(FocusEvent e)
    {
        b1.setEnabled(false);

    }
    public void focusLost(FocusEvent e)
    {
        try{
            no=Integer.parseInt(t1.getText());
        }
        catch(Exception e1)
        {
            t1.requestFocus();
            return ;
        }
        int i =0,n=ls.size();
        while(i<n)
        {
            obj = ls.get(i);
            if(obj.bno == no)
                break;
            i++ ;    
        }

        if(i!=n)
        {
            t2.setText(obj.bnm);
            t3.setText(""+obj.bprice);
            t1.requestFocus();
            return;
        }
        b1.setEnabled(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        Button b=(Button)e.getSource();
        if(b==b2)
            setVisible(false);
        else{
            try{
                no=Integer.parseInt(t1.getText());
                nm=t2.getText();
                price=Integer.parseInt(t3.getText());
                obj=new Book(no,nm,price,true);
                ls.add(obj);
            }
            catch(Exception e1){}
            setVisible(false);
        }    
    }

}


// Modifying Class


class BMod extends Dialog implements FocusListener , ActionListener
{
    Panel p1,p2;
    Button b1,b2;
    Label l1,l2,l3;
    TextField t1,t2,t3,t4;
    LinkedList <Book> ls;
    int no,price;
    String nm ; boolean state;

    Book obj;
    BMod(Frame f,String t,LinkedList <Book> l,boolean state)
    {
        super(f,t,state);
        ls=l;
        l1=new Label("Book No:");
        l2=new Label("Name:");
        l3=new Label("Price:");

        t1=new TextField(10);
        t2=new TextField(30);
        t3=new TextField(10);
        t1.addFocusListener(this);

        p1=new Panel();
        p1.setLayout(new GridLayout(3,2,5,5));
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(t3);

        add(p1,BorderLayout.CENTER);

        b1=new Button("Mod");
        b2=new Button("Back");

        b1.addActionListener(this);
        b2.addActionListener(this);

        p2=new Panel();
        p2.add(b1);
        p2.add(b2);

        add(p2,BorderLayout.SOUTH);

        setSize(400,300);
        setVisible(true);
         
    }
    public void focusGained(FocusEvent e)
    {
        b1.setEnabled(false);

    }
    public void focusLost(FocusEvent e)
    {
        try{
            no=Integer.parseInt(t1.getText());
        }
        catch(Exception e1)
        {
            t1.requestFocus();
            return ;
        }
        int i =0,n=ls.size();
        while(i<n)
        {
            obj = ls.get(i);
            if(obj.bno == no && obj.bstate == true)
                break;
            i++ ;    
        }

        if(i!=n)
        {
            t2.setText(obj.bnm);
            
            t3.setText(""+obj.bprice);
            b2.setEnabled(true);
        }
        else{
            t1.requestFocus();
            return;
        }    
            
    }
    public void actionPerformed(ActionEvent e)
    {
        Button b=(Button)e.getSource();
        if(b==b2)
            setVisible(false);
        else{
            try{
                no=Integer.parseInt(t1.getText());
                nm=t2.getText();
                price=Integer.parseInt(t3.getText());
                obj.bnm = nm;
                obj.bprice=price; 
                ls.add(obj);
            }
            catch(Exception e1){}
            setVisible(false);
        }    
    }

}


// BDel Delete class



class BDel extends Dialog implements FocusListener , ActionListener
{
    Panel p1,p2;
    Button b1,b2;
    Label l1,l2,l3;
    TextField t1,t2,t3,t4;
    LinkedList <Book> ls;
    int no,price;
    String nm ; boolean state;

    Book obj;
    BDel(Frame f,String t,LinkedList <Book> l,boolean state)
    {
        super(f,t,state);
        ls=l;
        l1=new Label("Book No:");
        l2=new Label("Name:");
        l3=new Label("Price:");

        t1=new TextField(10);
        t2=new TextField(30);
        t3=new TextField(10);
        t1.addFocusListener(this);

        p1=new Panel();
        p1.setLayout(new GridLayout(3,2,5,5));
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(t3);

        add(p1,BorderLayout.CENTER);

        b1=new Button("Del");
        b2=new Button("Back");

        b1.addActionListener(this);
        b2.addActionListener(this);

        p2=new Panel();
        p2.add(b1);
        p2.add(b2);

        add(p2,BorderLayout.SOUTH);

        setSize(400,300);
        setVisible(true);
         
    }
    public void focusGained(FocusEvent e)
    {
        b1.setEnabled(false);

    }
    public void focusLost(FocusEvent e)
    {
        try{
            no=Integer.parseInt(t1.getText());
        }
        catch(Exception e1)
        {
            t1.requestFocus();
            return ;
        }
        int i =0,n=ls.size();
        while(i<n)
        {
            obj = ls.get(i);
            if(obj.bno == no && obj.bstate == true)
                break;
            i++ ;    
        }

        if(i!=n)
        {
            t2.setText(obj.bnm);
            
            t3.setText(""+obj.bprice);
            b2.setEnabled(true);
        }
        else{
            t1.requestFocus();
            return;
        }    
            
    }
    public void actionPerformed(ActionEvent e)
    {
        Button b=(Button)e.getSource();
        if(b==b2)
            setVisible(false);
        else{
           obj.bstate=false;
           setVisible(false);
        }    
    }
}
class BDisplay extends Dialog implements ActionListener {
    int i, n;
    LinkedList<Book> ls;
    Label l1, l2, l3, l4;
    TextField t1, t2, t3, t4;
    Button b1, b2, b3, b4;

    BDisplay(Frame f, String t, LinkedList<Book> ls, boolean state) {
        super(f, t, state);
        i = 0;
        this.ls = ls;

        l1 = new Label("Book No.");
        l2 = new Label("Name");
        l3 = new Label("Price");
        l4 = new Label("State");

        t1 = new TextField(10);
        t2 = new TextField(40);
        t3 = new TextField(10);
        t4 = new TextField(10);

        t1.setEditable(false);
        t2.setEditable(false);
        t3.setEditable(false);
        t4.setEditable(false);

        b1 = new Button("|<");
        b2 = new Button("<<");
        b3 = new Button(">>");
        b4 = new Button(">|");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        Panel p1 = new Panel();
        p1.setLayout(new GridLayout(4, 2, 5, 5));
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(t3);
        p1.add(l4);
        p1.add(t4);

        Panel p2 = new Panel();
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        add(p1, BorderLayout.CENTER);
        add(p2, BorderLayout.SOUTH);

        addWindowListener(new WindowAdapter() {
            public void WindowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setSize(400, 300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e )
    {
        Button b = (Button)e.getSource();
        n = ls.size();
        if(b == b1)
            i = 0;
        if(b == b4)
            i = n - 1;
        if(b == b2)
        {
            if(--i < 0)
                i = 0;
        }
        if(b == b3)
        {
            if(++i >= n)
                i = n -1;
        }
        Book obj = ls.get(i);

        t1.setText(" "+ obj.bno);
        t1.setText(" "+ obj.bnm);
        t1.setText(" "+ obj.bprice);

        if(obj.bstate == false)
            t4.setForeground(Color.RED);
        else
            t4.setForeground(Color.BLACK);
        t4.setText(" " + obj.bstate);

    }
}
class AWT24
{
    public static void main(String [] args)
    {
        AWT24 a = new AWT24();
    }

}

