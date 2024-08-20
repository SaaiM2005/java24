import java.awt.Button;
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWT28 extends Frame implements ActionListener {
    Checkbox m1, m2, m3;
    Checkbox s1, s2, s3, s4, s5;
    Button b1, b2;
    Label l1, l2, l3, l4;

    AWT28() {
        super("CHECKBOX");
        m1 = new Checkbox("JanFebMarApr");
        m2 = new Checkbox("MayJunJulAug");
        m3 = new Checkbox("SepOctNovDec");

        s1 = new Checkbox("SOUTH");
        s2 = new Checkbox("NORTH");
        s3 = new Checkbox("EAST");
        s4 = new Checkbox("WEST");
        s5 = new Checkbox("CENTER");

        b1 = new Button("Display");
        b2 = new Button("Exit");
        b1.addActionListener(this);
        b2.addActionListener(this);

        l1 = new Label("Month");
        l2 = new Label("Selected");
        l3 = new Label("Area");
        l4 = new Label("Selected");
        setLayout(new FlowLayout());
        add(l1);
        add(m1);
        add(m2);
        add(m3);
        add(l2);
        add(l3);
        add(s1);
        add(s2);
        add(s3);
        add(s4);
        add(s5);
        add(l4);
        add(b1);
        add(b2);
        setSize(400, 400);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        Button b = (Button) e.getSource();
        if (b == b2) {
            System.exit(0);
        } else {
            String m = "Month: ";
            if (m1.getState()) {
                m += m1.getLabel() + " ";
            }
            if (m2.getState()) {
                m += m2.getLabel() + " ";
            }
            if (m3.getState()) {
                m += m3.getLabel() + " ";
            }

            String a = "Area: ";
            if (s1.getState()) {
                a += s1.getLabel() + " ";
            }
            if (s2.getState()) {
                a += s2.getLabel() + " ";
            }
            if (s3.getState()) {
                a += s3.getLabel() + " ";
            }
            if (s4.getState()) {
                a += s4.getLabel() + " ";
            }
            if (s5.getState()) {
                a += s5.getLabel() + " ";
            }

            l2.setText(m);
            l4.setText(a);
        }
    }

    public static void main(String[] args) {
        AWT28 a = new AWT28();
    }
}