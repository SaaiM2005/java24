import java.awt.*;
import java.awt.event.*;

public class AWT32 extends Frame implements KeyListener {
    TextArea ta;
    Label l1;

    AWT32() {
        super("Key Listener");
        ta = new TextArea();
        l1 = new Label("Message");
        ta.addKeyListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setLayout(null);
        l1.setBounds(50, 50, 100, 20);
        ta.setBounds(50, 80, 100, 100);
        add(l1);
        add(ta);
        setSize(200, 230);
        setVisible(true);
    }

    public void keyPressed(KeyEvent e) {
        l1.setText("Key Pressed");
    }

    public void keyReleased(KeyEvent e) {
        l1.setText("Key Released");
    }

    public void keyTyped(KeyEvent e) {
        l1.setText("Key Typed");
    }

    public static void main(String[] args) {
        AWT32 a = new AWT32();
    }
}