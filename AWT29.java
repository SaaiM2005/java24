import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWT29 extends Frame implements ActionListener {
    CheckboxGroup cg1,cg2;
    Checkbox m1, m2, m3;
    Checkbox s1, s2, s3, s4, s5;
    Button b1, b2;
    Label l1, l2, l3, l4;

    AWT29() {
        super("CHECKBOX");
        cg1=new CheckboxGroup();
        m1 = new Checkbox("JanFebMarApr",cg1,true);
        m2 = new Checkbox("MayJunJulAug",cg1,true);
        m3 = new Checkbox("SepOctNovDec",cg1,true);

        cg2=new CheckboxGroup();
        s1 = new Checkbox("SOUTH",cg2,true);
        s2 = new Checkbox("NORTH",cg2,true);
        s3 = new Checkbox("EAST",cg2,true);
        s4 = new Checkbox("WEST",cg2,true);
        s5 = new Checkbox("CENTER",cg2,true);

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

    public void actionPerformed(ActionEvent e)
    {
        Button b=(Button)e.getSource();
        if(b==b2)
        {
            System.exit(0);
        }
        else
        {
            String s="MONTH:"+(cg1.getSelectedCheckbox()).getLabel();
            l2.setText(s);
            String a="AREA:"+(cg2.getSelectedCheckbox()).getLabel();
            l4.setText(a);
        }
    }

    public static void main(String[] args) {
        AWT29 a = new AWT29();
    }
}