import javax.swing.*;
import java.util.*;


public class UseAccount1 
{
    int no;
    String nm;
    int bal;
    UseAccount1()
    {
        no=bal=0;
        nm="";//new String();
    }
    public String toString()
    {
        String a="\nA/C No:"+no+"\nName:"+nm+"\nBalance:"+bal;
        return a; 
    }
    void display()
    {
        JOptionPane.showMessageDialog(null, toString());
    }
    void setData(int n)
    {
        no=n;
        try
        {
            nm=JOptionPane.showInputDialog(null,"Name:");
            bal=Integer.parseInt(JOptionPane.showInputDialog(null,"Balance:"));

        }
        catch(Exception e){}

    }
    int getNo(){return no;}
    int getBal(){return bal;}
    String getNm(){ return nm;}
    public static void main(String[]arg )
    {
        
        int no=0;
        LinkedList<UseAccount1>ls = new LinkedList<UseAccount1>();

    
        while(true)
        {
            try
            {
                no=Integer.parseInt(JOptionPane.showInputDialog(null,"Account No:"));
            }
   
            catch(Exception e){continue;}
            if(no==0)
            break;

            UseAccount1 a=new UseAccount1();
            a.setData(no);
            ls.add(a);
    
        }
        int i=0,n=ls.size();
        while(i<n)
        {
            UseAccount1 b=ls.get(i);
            b.display();
            i++;
        }
    }
}