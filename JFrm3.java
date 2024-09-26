
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
class JFrm3 extends JFrame 
{    
    JList list;
    JLabel l1;
    JScrollPane jsp;
    String [] city={"Sangli", "Satara", "Kolhapur", "Barshi", "Beed", "Karad", "Ratnagiri", "Pandharpur"};
    JFrm3()
    {
        super("Frame");
        l1=new JLabel("Choose City");
        list=new JList(city);
        list.setSelectionMode (ListSelectionModel.SINGLE_SELECTION);
        list.addListSelectionListener(new ListSelectionListener()
        {
            public void valueChanged(ListSelectionEvent e)
            {
                int choice=list.getSelectedIndex();
                if(choice==-1)
                    l1.setText("Choose City");
                   
                else
                {
                    l1.setText("Current Selection: " + city [choice]);
                }
            }
        });
        jsp=new JScrollPane(list);
        jsp.setPreferredSize(new Dimension(200,100));
        setLayout(new FlowLayout());
        add(jsp);
        add(l1);
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) 
    {
        JFrm3 a=new JFrm3();    
    }
}