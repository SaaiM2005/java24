import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class AWT7 extends Frame implements FocusListener, ActionListener {

    Label lr, lg, lb, lclr, lval;
    int r, g, b;
    Color cr, cg, cb, cclr;
    TextField tr, tg, tb;
    Panel pr, pg, pb, pclr;
    Button bok, bex;

    AWT7() {
        // LABELS
        super("COLOR");
        lr = new Label("RED");
        lg = new Label("GREEN");
        lb = new Label("BLUE");
        lclr = new Label("COLOR");
        lval = new Label("VALUE");

        // TEXTFIELDS
        tr = new TextField(10);
        tg = new TextField(10);
        tb = new TextField(10);

        tr.addFocusListener(this);
        tg.addFocusListener(this);
        tb.addFocusListener(this);

        // PANELS
        pr = new Panel();
        pg = new Panel();
        pb = new Panel();
        pclr = new Panel();

        // BUTTONS
        bok = new Button("OK");
        bex = new Button("EXIT");
        bok.addActionListener(this);
        bex.addActionListener(this);

        // LAYOUT
        setLayout(null);
        lval.setBounds(170, 50, 100, 20);
        lclr.setBounds(290, 50, 100, 20);
        lr.setBounds(50, 90, 100, 20);
        tr.setBounds(170, 90, 100, 20);
        pr.setBounds(290, 90, 100, 20);
        lg.setBounds(50, 120, 100, 20);
        tg.setBounds(170, 120, 100, 20);
        pg.setBounds(290, 120, 100, 20);
        lb.setBounds(50, 150, 100, 20);
        tb.setBounds(170, 150, 100, 20);
        pb.setBounds(290, 150, 100, 20);
        bok.setBounds(170, 180, 100, 20);
        bex.setBounds(290, 180, 100, 20);
        pclr.setBounds(410, 90, 100, 80);

        add(lval);
        add(lclr);
        add(lr);
        add(tr);
        add(pr);
        add(lg);
        add(tg);
        add(pg);
        add(lb);
        add(tb);
        add(pb);
        add(bok);
        add(bex);
        add(pclr);
        setSize(560, 250);
        setVisible(true);
    }

    public void focusGained(FocusEvent e) {
    }

    public void focusLost(FocusEvent e) {
        // RED
        try {
            r = Integer.parseInt(tr.getText());
        } catch (Exception e1) {
            tr.requestFocus();
            return;
        }
        if (r < 0 || r > 255) {
            tr.requestFocus();
            return;
        }
        cr = new Color(r, 0, 0);
        pr.setBackground(cr);

        // GREEN
        try {
            g = Integer.parseInt(tg.getText());
        } catch (Exception e1) {
            tg.requestFocus();
            return;
        }
        if (g < 0 || g > 255) {
            tg.requestFocus();
            return;
        }
        cg = new Color(0, g, 0);
        pg.setBackground(cg);

        // BLUE
        try {
            b = Integer.parseInt(tb.getText());
        } catch (Exception e1) {
            tb.requestFocus();
            return;
        }
        if (b < 0 || b > 255) {
            tb.requestFocus();
            return;
        }
        cb = new Color(0, 0, b);
        pb.setBackground(cb);
        cclr = new Color(r, g, b);
        pclr.setBackground(cclr);
    }

    public void actionPerformed(ActionEvent e) {
        Button b1 = (Button) e.getSource();
        if (b1 == bex) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        AWT7 a = new AWT7();
    }
}