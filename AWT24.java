import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
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

class Book {
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
        String s = "Book No:" + bno + "\nName:" + bnm + "\nPrice:" + bprice + "\nState:" + bstate;
        return s;
    }

    void display() {
        Util.display(toString());
    }
}

class BAdd extends Dialog implements FocusListener, ActionListener {
    Panel p1, p2;
    Label l1, l2, l3;
    TextField t1, t2, t3;
    Button b1, b2;
    LinkedList<Book> ls;
    int no, price;
    String nm;
    boolean state;
    Book obj;

    BAdd(Frame f, String t, LinkedList<Book> l, boolean state) {
        super(f, t, state);
        ls = l;
        l1 = new Label("Book No:");
        l2 = new Label("Name:");
        l3 = new Label("Price:");
        t1 = new TextField(10);
        t2 = new TextField(30);
        t3 = new TextField(10);
        t1.addFocusListener(this);
        p1 = new Panel();
        p1.setLayout(new GridLayout(3, 2, 5, 5));
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(t3);
        add(p1, BorderLayout.CENTER);
        b1 = new Button("Add");
        b2 = new Button("Back");
        b1.addActionListener(this);
        b2.addActionListener(this);
        p2 = new Panel();
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
        Button b = (Button) e.getSource();
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

class BMod extends Dialog implements FocusListener, ActionListener {
    Panel p1, p2;
    Label l1, l2, l3;
    TextField t1, t2, t3;
    Button b1, b2;
    LinkedList<Book> ls;
    int no, price;
    String nm;
    boolean state;
    Book obj;

    BMod(Frame f, String t, LinkedList<Book> l, boolean state) {
        super(f, t, state);
        ls = l;
        l1 = new Label("Book No:");
        l2 = new Label("Name:");
        l3 = new Label("Price:");
        t1 = new TextField(10);
        t2 = new TextField(30);
        t3 = new TextField(10);
        t1.addFocusListener(this);
        p1 = new Panel();
        p1.setLayout(new GridLayout(3, 2, 5, 5));
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(t3);
        add(p1, BorderLayout.CENTER);
        b1 = new Button("Mod");
        b2 = new Button("Back");
        b1.addActionListener(this);
        b2.addActionListener(this);
        p2 = new Panel();
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
        Button b = (Button) e.getSource();
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

class BDel extends Dialog implements FocusListener, ActionListener {
    Panel p1, p2;
    Label l1, l2, l3;
    TextField t1, t2, t3;
    Button b1, b2;
    LinkedList<Book> ls;
    int no, price;
    String nm;
    boolean state;
    Book obj;

    BDel(Frame f, String t, LinkedList<Book> l, boolean state) {
        super(f, t, state);
        ls = l;
        l1 = new Label("Book No:");
        l2 = new Label("Name:");
        l3 = new Label("Price:");
        t1 = new TextField(10);
        t2 = new TextField(30);
        t3 = new TextField(10);
        t1.addFocusListener(this);
        p1 = new Panel();
        p1.setLayout(new GridLayout(3, 2, 5, 5));
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(t3);
        add(p1, BorderLayout.CENTER);
        b1 = new Button("Del");
        b2 = new Button("Back");
        b1.addActionListener(this);
        b2.addActionListener(this);
        p2 = new Panel();
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
        Button b = (Button) e.getSource();
        if (b == b2)
            setVisible(false);
        else {
            obj.bstate = false;
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
        l1 = new Label("Book No");
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
            public void windowClosing(WindowEvent e) {
                setVisible(false);
            }
        });
        setSize(400, 300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        Button b = (Button) e.getSource();
        n = ls.size();
        if (b == b1)
            i = 0;
        if (b == b4)
            i = n - 1;
        if (b == b2) {
            if (--i < 0)
                i = 0;
        }
        if (b == b3) {
            if (++i >= n)
                ;
            i = n - 1;
        }
        Book obj = ls.get(i);
        t1.setText("" + obj.bno);
        t2.setText(obj.bnm);
        t3.setText("" + obj.bprice);
        if (obj.bstate == false)
            t4.setForeground(Color.RED);
        else
            t4.setForeground(Color.BLACK);
        t4.setText("" + obj.bstate);
    }
}

public class AWT24 extends Frame implements ActionListener {
    MenuBar mb;
    Menu m1, m2, m3;
    MenuItem m11, m12, m13;
    MenuItem m21;
    MenuItem m31, m32;
    BAdd ba;
    BMod bm;
    BDel bd;
    BDisplay bdisp;
    LinkedList<Book> ls;

    AWT24() {
        super("Menu");
        mb = new MenuBar();
        m1 = new Menu("Book");
        m11 = new MenuItem("Add");
        m12 = new MenuItem("Modify");
        m13 = new MenuItem("Delete");
        m11.addActionListener(this);
        m12.addActionListener(this);
        m13.addActionListener(this);
        m1.add(m11);
        m1.add(m12);
        m1.add(m13);
        mb.add(m1);
        m2 = new Menu("Record");
        m21 = new MenuItem("Display");
        m21.addActionListener(this);
        m2.add(m21);
        mb.add(m2);
        m3 = new Menu("Exit");
        m31 = new MenuItem("No");
        m32 = new MenuItem("Yes");
        m32.addActionListener(this);
        m3.add(m31);
        m3.add(m32);
        mb.add(m3);
        setMenuBar(mb);
        setSize(400, 400);
        ls = new LinkedList<Book>();
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        MenuItem a = (MenuItem) e.getSource();
        if (a == m32)
            System.exit(0);
        if (a == m11)
            ba = new BAdd((Frame) null, "Add", ls, true);
        if (a == m12)
            bm = new BMod((Frame) null, "Mod", ls, true);
        if (a == m13)
            bd = new BDel((Frame) null, "Del", ls, true);
        if (a == m21)
            bdisp = new BDisplay((Frame) null, "Display", ls, true);

    }

    public static void main(String[] args) {
        AWT24 a = new AWT24();
    }
}