//ARRAYS TO STRING CONVERSION OF MATRIX 
//ITERATOR HAS BEEN USED !!!
//GIVES SUM OF THE ADDED NUMBERS IN THE DIALOGUE BOX!
import java.util.*;
import javax.swing.*;
public class List5
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
        ls.removeFirst();//REMOVES FIRST ELEMENT IN THE LINKED LIST
        JOptionPane.showMessageDialog(null,"Data:\n"+ls);
        
        ls.removeLast();//REMOVES LAST ELEMENT IN THE LINKED LIST
        JOptionPane.showMessageDialog(null,"Data:\n"+ls);
        
        ls.remove(2);//REMOVES 2ND ELEMENT FROM LINKED LIST
        JOptionPane.showMessageDialog(null,"Data:\n"+ls);
    }
}