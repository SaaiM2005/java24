import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JPopupMenu.Separator;
import javax.swing.event.*;

public class JFrm22  extends JFrame{
    
    JMenu menu;
    JMenuItem i1,i2,i3,i4,i5;
    JMenuBar mb;

    JFrm22()
    {
        super("Separator in Menu");
    
        mb = new JMenuBar();
        menu = new JMenu("MENU");
        i1 = new JMenuItem("Item 1");
        i2 = new JMenuItem("Item 2");
        i3 = new JMenuItem("Item 3");
        i4 = new JMenuItem("Item 4");
        i5 = new JMenuItem("Item 5");


        menu.add(i1);
        menu.add(i2);
        menu.addSeparator();
        menu.add(i4);
        menu.addSeparator();
        menu.add(i5);

        mb.add(menu);
        setJMenuBar(mb);

        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setVisible(true);

    }
    public static void main(String [] args)
    {
        new JFrm22();
    }
}