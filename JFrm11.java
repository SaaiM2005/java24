import javax.swing.*;
import javax.swing.table.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import mypkg.Util;

class Book implements Serializable
{
    int bno;
    String bnm;
    int bprice;
    boolean bstate;

    Book(int no, String nm, int price, boolean state) {
        bno = no;
        bnm = nm;
        bprice = price;
        bstate = state;
    }

    public String toString() {
        String s = "\nBook Data\nNo.:" + bno + "\nName:" + bnm + "\nPrice:" + bprice + "\nState" + bstate;
        return s;
    }

    void display() {
        Util.display(toString());
    }
}

class BAdd extends JDialog implements FocusListener, ActionListener
{
    JPanel p1, p2;
    JLabel l1, l2, l3;
    JTextField t1, t2, t3, t4;
    JButton b1, b2;
    LinkedList<Book> ls;
    int no, price;
    String nm;
    Book obj;

    boolean state;

    BAdd(JFrame f, String t, LinkedList<Book> l, boolean state) {
        super(f, t, state);
        ls = l;
        l1 = new JLabel("Book No.");
        l2 = new JLabel("Name");
        l3 = new JLabel("Price");
        t1 = new JTextField(10);
        t2 = new JTextField(30);
        t3 = new JTextField(10);
        t1.addFocusListener(this);
        p1 = new JPanel();
        p1.setLayout(new GridLayout(3, 2, 5, 5));
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(t3);
        add(p1, BorderLayout.CENTER);
        b1 = new JButton("Add");
        b2 = new JButton("Back");
        b1.addActionListener(this);
        b2.addActionListener(this);
        p2 = new JPanel();
        p2.add(b1);
        p2.add(b2);
        add(p2, BorderLayout.SOUTH);
        setSize(400, 300);
        setVisible(true);
    }

    public void focusGained(FocusEvent e) {
        b1.setEnabled(false);
    }

    public void focusLost(FocusEvent e) {
        try {
            no = Integer.parseInt(t1.getText());
        } catch (Exception e1) {
            t1.requestFocus();
            return;
        }
        int i = 0, n = ls.size();
        while (i < n) {
            obj = ls.get(i);
            if (obj.bno == no)
                break;
            i++;
        }
        if (i != n) {
            t2.setText(obj.bnm);
            t3.setText("" + obj.bprice);
            t1.requestFocus();
            return;
        }
        b1.setEnabled(true);

    }

    public void actionPerformed(ActionEvent e) {
        JButton b =(JButton) e.getSource();
        if (b == b2)
            setVisible(false);
        else {
            try {
                no = Integer.parseInt(t1.getText());
                nm = t2.getText();
                price = Integer.parseInt(t3.getText());
                obj = new Book(no, nm, price, true);
                ls.add(obj);
            } catch (Exception e1) {
            }
            setVisible(false);
        }
    }
}

class BMod extends JDialog implements FocusListener, ActionListener 
{
    JPanel p1, p2;
    JLabel l1, l2, l3;
    JTextField t1, t2, t3,t4;
    JButton b1, b2;
    LinkedList<Book> ls;
    int no, price;
    String nm;
    Book obj;

    boolean state;

    BMod(JFrame f, String t, LinkedList<Book> l, boolean state) {
        super(f, t, state);
        ls = l;
        l1 = new JLabel("Book No.");
        l2 = new JLabel("Name");
        l3 = new JLabel("Price");
        t1 = new JTextField(10);
        t2 = new JTextField(30);
        t3 = new JTextField(10);
        t1.addFocusListener(this);
        p1 = new JPanel();
        p1.setLayout(new GridLayout(3, 2, 5, 5));
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(t3);
        add(p1, BorderLayout.CENTER);
        b1 = new JButton("Mod");
        b2 = new JButton("Back");
        b1.addActionListener(this);
        b2.addActionListener(this);
        p2 = new JPanel();
        p2.add(b1);
        p2.add(b2);
        add(p2, BorderLayout.SOUTH);
        setSize(400, 300);
        setVisible(true);
    }

    public void focusGained(FocusEvent e) {
        b1.setEnabled(false);
    }

    public void focusLost(FocusEvent e) {
        try {
            no = Integer.parseInt(t1.getText());
        } catch (Exception e1) {
            t1.requestFocus();
            return;
        }
        int i = 0, n = ls.size();
        while (i < n) {
            obj = ls.get(i);
            if (obj.bno == no && obj.bstate == true)
                break;
            i++;
        }
        if (i != n) {
            t2.setText(obj.bnm);
            t3.setText("" + obj.bprice);
            b1.setEnabled(true);
        } else {
            t1.requestFocus();
            return;
        }
    }

    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton) e.getSource();
        if (b == b2)
            setVisible(false);
        else {
            try {
                no = Integer.parseInt(t1.getText());
                nm = t2.getText();
                price = Integer.parseInt(t3.getText());
                obj.bnm = nm;
                obj.bprice = price;
            } catch (Exception e1) {
            }
            setVisible(false);
        }
    }
}

class BDel extends JDialog implements FocusListener, ActionListener 
{
    JPanel p1, p2;
    JLabel l1, l2, l3;
    JTextField t1, t2, t3, t4;
    JButton b1, b2;
    LinkedList<Book> ls;
    int no, price;
    String nm;
    Book obj;

    boolean state;

    BDel(JFrame f, String t, LinkedList<Book> l, boolean state) {
        super(f, t, state);
        ls = l;
        l1 = new JLabel("Book No.");
        l2 = new JLabel("Name");
        l3 = new JLabel("Price");
        t1 = new JTextField(10);
        t2 = new JTextField(30);
        t3 = new JTextField(10);
        t1.addFocusListener(this);
        p1 = new JPanel();
        p1.setLayout(new GridLayout(3, 2, 5, 5));
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(t3);
        add(p1, BorderLayout.CENTER);
        b1 = new JButton("Del");
        b2 = new JButton("Back");
        b1.addActionListener(this);
        b2.addActionListener(this);
        p2 = new JPanel();
        p2.add(b1);
        p2.add(b2);
        add(p2, BorderLayout.SOUTH);
        setSize(400, 300);
        setVisible(true);
    }

    public void focusGained(FocusEvent e) {
        b1.setEnabled(false);
    }

    public void focusLost(FocusEvent e) {
        try {
            no = Integer.parseInt(t1.getText());
        } catch (Exception e1) {
            t1.requestFocus();
            return;
        }
        int i = 0, n = ls.size();
        while (i < n) {
            obj = ls.get(i);
            if (obj.bno == no && obj.bstate == true)
                break;
            i++;
        }
        if (i != n) {
            t2.setText(obj.bnm);
            t3.setText("" + obj.bprice);
            b1.setEnabled(true);
        } else {
            t1.requestFocus();
            return;
        }
    }

    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton) e.getSource();
        if (b == b2)
            setVisible(false);
        else {
            obj.bstate = false;
            setVisible(false);
        }
    }
}
class BDisplay extends JDialog implements ActionListener
{
    int i,n;
    LinkedList<Book>ls;
    JLabel l1,l2,l3,l4;
    JTextField t1,t2,t3,t4;
    JButton b1,b2,b3,b4;
    BDisplay (JFrame f,String t,LinkedList<Book>ls,boolean state)
    {
        super(f,t,state);
        i=0;
        this.ls=ls;
        l1=new JLabel("Book No:");
        l2=new JLabel("Book Name:");
        l3=new JLabel("Book Price:");
        l4=new JLabel("Book State:");
        t1=new JTextField(10);
        t2=new JTextField(40);
        t3=new JTextField(10);
        t4=new JTextField(10);
        t1.setEditable(false);
        t2.setEditable(false);
        t3.setEditable(false);
        t4.setEditable(false);
        b1=new JButton("K");
        b2=new JButton("<<");
        b3=new JButton(">>");
        b4=new JButton(">|");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        JPanel p1=new JPanel();
        p1.setLayout(new GridLayout(4,2,5,5));
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(t3);
        p1.add(l4);
        p1.add(t4);

        JPanel p2=new JPanel();
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);

        add(p1,BorderLayout.CENTER);
        add(p2,BorderLayout.SOUTH);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                setVisible(false);
            }
        });

        setSize(400,400);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        JButton b=(JButton)e.getSource();
        n=ls.size();
        if(b==b1)
            i=0;
        if(b==b4)
            i=n-1;
        if(b==b2)
         {   if(--i<0)
                i=0;
         }
         if(b==b3)
         {
            if(++i>=n)
            i=n-1;
         }
         Book obj=ls.get(i);
         t1.setText(" "+obj.bno);
         t2.setText(obj.bnm);
         t3.setText(" "+obj.bprice);
         if(obj.bstate==false)
            t4.setForeground(Color.RED);
         else
             t4.setForeground(Color.BLACK);
         t4.setText(" "+obj.bstate);    
    }

}
public class JFrm11 extends JFrame implements ActionListener
{
    JMenuBar mb;
    JMenu m1, m2, m3;
    JMenuItem m11, m12, m13;
    JMenuItem m21;
    JMenuItem m31, m32;
    BAdd ba;
    BMod bm;
    BDel bd;
    BDisplay bdisp;
    LinkedList<Book>ls;

    JFrm11() {
        super("Menu");
        mb = new JMenuBar();
        m1 = new JMenu("Book");
        m11 = new JMenuItem("Add");
        m12 = new JMenuItem("Modify");
        m13 = new JMenuItem("Delete");
      
        m1.add(m11);
        m1.add(m12);
        m1.add(m13);
        m11.addActionListener(this);
        m12.addActionListener(this);
        m13.addActionListener(this);
        mb.add(m1);
        m2 = new JMenu("Record");
        m21 = new JMenuItem("Display");
        m21.addActionListener(this);
        m2.add(m21);
        mb.add(m2);
        m3 = new JMenu("Exit");
        m31 = new JMenuItem("No");
        m32 = new JMenuItem("Yes");
        m32.addActionListener(this);
        m3.add(m31);
        m3.add(m32);
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        setJMenuBar(mb);
        setSize(400, 400);
       ls=new LinkedList<Book>();
       setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        JMenuItem a = (JMenuItem) e.getSource();
        if (a == m32)
            System.exit(0);
        if(a==m11)
            ba=new BAdd((JFrame)null,"Add",ls,true);
        if(a==m12)
            bm=new BMod((JFrame)null,"mod",ls,true);
        if(a==m13)
            bd=new BDel((JFrame)null,"Del",ls,true);
        if(a==m21)
            bdisp=new BDisplay((JFrame)null,"Display",ls,true);

    }
    public static void main(String[] args)
    {
        JFrm11 a = new JFrm11();
    }
}