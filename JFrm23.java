import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 

class JFrm23 extends JFrame implements ActionListener {     
    JLabel l1;     
    JPopupMenu pm;       
    JMenuItem cut, copy, paste; 
    
    JFrm23() {         
        super("Pop-Up Menu");         
        l1 = new JLabel();         
        l1.setHorizontalAlignment(JLabel.CENTER);         
        l1.setSize(400, 100);         
        
        pm = new JPopupMenu("Edit");         
        cut = new JMenuItem("Cut");         
        copy = new JMenuItem("Copy");         
        paste = new JMenuItem("Paste");         
        
        pm.add(cut);         
        pm.add(copy);         
        pm.add(paste);         
        
        cut.addActionListener(this);         
        copy.addActionListener(this);         
        paste.addActionListener(this);         
        
        l1.addMouseListener(new MouseAdapter() {             
            public void mouseClicked(MouseEvent e) {                 
                if (e.isPopupTrigger() || SwingUtilities.isRightMouseButton(e)) {                     
                    pm.show(l1, e.getX(), e.getY());                 
                }             
            }         
        });
        
        setLayout(null);         
        l1.setBounds(50, 50, 300, 50);         
        add(l1);         
        
        setSize(400, 400);         
        setVisible(true);         
        setDefaultCloseOperation(EXIT_ON_CLOSE);     
    }     
    
    public void actionPerformed(ActionEvent e) {         
        JMenuItem a = (JMenuItem) e.getSource();         
        if (a == cut) {             
            l1.setText("Cut MenuItem Clicked");         
        }         
        if (a == copy) {             
            l1.setText("Copy MenuItem Clicked");         
        }         
        if (a == paste) {             
            l1.setText("Paste MenuItem Clicked");         
        }     
    }     
    
    public static void main(String[] args) {         
        new JFrm23();     
    } 
}
