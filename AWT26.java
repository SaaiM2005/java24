import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Scrollbar;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

class AWT26 extends Frame implements AdjustmentListener, FocusListener, ActionListener {
    Scrollbar sr, sg, sb;
    int r, g, b;
    TextField tr, tg, tb;
    Label lr, lg, lb, lclr;
    Button bx;
    Panel pan;

    AWT26() {
        super("SCROLLBAR");
        sr = new Scrollbar(Scrollbar.VERTICAL, 0, 10, 0, 255);
        sg = new Scrollbar(Scrollbar.VERTICAL, 0, 10, 0, 255);
        sb = new Scrollbar(Scrollbar.VERTICAL, 0, 10, 0, 255);

        sr.addAdjustmentListener(this);
        sg.addAdjustmentListener(this);
        sb.addAdjustmentListener(this);

        lclr = new Label("COLOR");
        lr = new Label("R");
        lg = new Label("G");
        lb = new Label("B");

        tr = new TextField(10);
        tg = new TextField(10);
        tb = new TextField(10);

        tr.addFocusListener(this);
        tg.addFocusListener(this);
        tb.addFocusListener(this);

        bx = new Button("EXIT");
        bx.addActionListener(this);
        setLayout(null);

        lr.setBounds(50, 50, 50, 20);
        sr.setBounds(50, 90, 50, 100);
        tr.setBounds(50, 210, 50, 20);

        lg.setBounds(90, 50, 50, 20);
        sg.setBounds(90, 90, 50, 100);
        tg.setBounds(90, 210, 50, 20);

        lb.setBounds(130, 50, 50, 20);
        sb.setBounds(130, 90, 50, 100);
        tb.setBounds(130, 210, 50, 20);

        lclr.setBounds(170, 50, 100, 20);
        pan = new Panel();
        pan.setBounds(170, 90, 100, 100);
        bx.setBounds(170, 210, 50, 20);

        add(lr);
        add(lg);
        add(lb);
        add(lclr);
        add(sr);
        add(sg);
        add(sb);
        add(pan);
        add(tr);
        add(tg);
        add(tb);
        add(bx);
        setSize(320, 280);
        setVisible(true);
    }

    public void focusGained(FocusEvent e) {
    }

    public void adjustmentValueChanged(AdjustmentEvent e) {
        r = sr.getValue();
        g = sg.getValue();
        b = sb.getValue();

        tr.setText(String.valueOf(r));
        tg.setText(String.valueOf(g));
        tb.setText(String.valueOf(b));
        pan.setBackground(new Color(r, g, b));
    }

    public void focusLost(FocusEvent e) {
        TextField t = (TextField) e.getSource();
        int val = 0;
        try {
            val = Integer.parseInt(t.getText());
        } catch (Exception e1) {
        }
        if (val < 0 || val > 255) {
            t.requestFocus();
            return;
        }
        if (t == tr) {
            r = val;
        }
        if (t == tg) {
            g = val;
        }
        if (t == tb) {
            b = val;
        }
        sr.setValue(r);
        sg.setValue(g);
        sb.setValue(b);
        pan.setBackground(new Color(r, g, b));
    }

    public void actionPerformed(java.awt.event.ActionEvent e) {
        if (e.getSource() == bx) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        AWT26 a = new AWT26();
    }
}