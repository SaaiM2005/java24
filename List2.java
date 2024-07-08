//ARRAYS TO STRING CONVERSION OF MATRIX
import java.util.*;
import javax.swing.*;
public class List2 
{
    public static void main(String [] args)
    {
        LinkedList<Integer>ls=new LinkedList<Integer>(); // it shows link list holds integer type of data
        int val=0;
        while(true)
        {
            try
            {
                val=Integer.parseInt(JOptionPane.showInputDialog(null,"value"));
            }
            catch(Exception e)
            {
                continue;
            }
            if(val==0)
                break;
            ls.add(val);
        }
        JOptionPane.showMessageDialog(null,"Data:\n"+ls);
        int i=0,n=ls.size();
        String str="Data\n";
        while(i<n)
        {
            str=str+" "+ls.get(i);
            i++;
        }
        JOptionPane.showMessageDialog(null, str);
    }
}