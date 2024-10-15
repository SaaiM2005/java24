import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
import javax.swing.event.ChangeEvent; 
import javax.swing.event.ChangeListener;

class JFrm19 extends JFrame implements ChangeListener { // Extend JFrame
    JLabel l1;
    SpinnerModel value;
    JSpinner spinner;

    JFrm19() {
        super("Spinner"); // Set the title of the window
        l1 = new JLabel();
        l1.setHorizontalAlignment(JLabel.CENTER); // Fix JLabel spelling
        l1.setSize(250, 100);

        value = new SpinnerNumberModel(5, 0, 10, 1); // SpinnerModel
        spinner = new JSpinner(value); // Fix variable name (lowercase 's')
        spinner.setBounds(100, 100, 50, 50);

        setLayout(null); // Use absolute layout
        add(spinner);
        add(l1);

        setSize(300, 300);
        spinner.addChangeListener(this);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }

    public void stateChanged(ChangeEvent e) {
        l1.setText("Value: " + ((JSpinner) e.getSource()).getValue()); 
    }

    public static void main(String[] args) {
        new JFrm19(); 
    }
}
