import java.awt.BorderLayout;
import java.awt.Button;
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