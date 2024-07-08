//ARRAYS TO STRING CONVERSION OF MATRIX 
//ITERATOR HAS BEEN USED !!!
//GIVES SUM OF THE ADDED NUMBERS IN THE DIALOGUE BOX!
import java.util.*;
import javax.swing.*;
public class List4
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
        Iterator <Integer> it=ls.iterator();//ITERATOR THROUGH ONLY WE CAN GO IN FORWARD DIRECTION
        str="DATA:\n";
        while(it.hasNext())
        {
            str=str+" "+it.next();
        }
        JOptionPane.showMessageDialog(null,str);
        int tot=0;
        for(i=0;i<n;i++)
        {
            tot+=(ls.get(i)).intValue();//CONVERTS INTEGER CLASS OBJECTS TO int VALUE
        }
        str="DATA:\n"+ls+"\nTOTAL:"+tot;
        JOptionPane.showMessageDialog(null,str);
    }
}