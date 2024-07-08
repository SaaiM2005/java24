import javax.swing.*;
import java.util.*;
public class List1
{
    public static void main(String[]args)
    {
        LinkedList<Integer>ls=new LinkedList<Integer>();
        int val=0;
        while(true)
        {
            try
            {
                val=Integer.parseInt(JOptionPane.showInputDialog(null,"VALUE"));
            }catch(Exception e){continue;}
            if(val==0)
            {
                break;
            }
            ls.add(val);
        }
        JOptionPane.showInputDialog(null,"DATA:\n"+ls);
    }
}
