import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.tree.*;
class JFrm9 extends JFrame
{
    JTree tree;
    JLabel l1;
    JFrm9()
    {
        super("Frame");
        l1=new JLabel("Choose City"); // Create a Top node of tree
        DefaultMutableTreeNode top=new DefaultMutableTreeNode("Options");
        // Create Subtree of T
        DefaultMutableTreeNode t=new DefaultMutableTreeNode("0");
        DefaultMutableTreeNode t1=new DefaultMutableTreeNode("01");
        DefaultMutableTreeNode t2=new DefaultMutableTreeNode("02");
        top.add(t);
        t.add(t1);
        t.add(t2);

        DefaultMutableTreeNode s=new DefaultMutableTreeNode("P");
        DefaultMutableTreeNode s1=new DefaultMutableTreeNode("P1");

        DefaultMutableTreeNode s2=new DefaultMutableTreeNode("P2");
        DefaultMutableTreeNode s3=new DefaultMutableTreeNode("P3");

        top.add(s);
        s.add(s1);
        s.add(s2);
        s.add(s3);

        tree=new JTree(top);
        tree.addTreeSelectionListener(new TreeSelectionListener()
        {
            public void valueChanged(TreeSelectionEvent e)
            {
                l1.setText("Selection is :"+ e.getPath());
            }
        });
        JScrollPane jsp=new JScrollPane(tree);
        add(jsp);
        add(l1,BorderLayout.SOUTH);
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String [] args)
    {
        JFrm9 a=new JFrm9();
    }
}