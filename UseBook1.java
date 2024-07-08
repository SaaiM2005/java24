import java.util.*;
import javax.swing.*;
class Book1 {
    int bno;
    String bnm;
    int bprice;
    Book1()
    {
        bno=bprice=0;
        bnm=new String();
    }
    public String toString()
    {
        String s="\nBOOK DATA:\n"+bno+"\nName:"+bnm+"\nPRICE:"+bprice;
        return s;
    }
    void display()
    {
        JOptionPane.showMessageDialog(null, toString());
    }
    void setData(int n)
    {
        bno=n;
        try
        {  
            bnm=JOptionPane.showInputDialog(null,"NAME");
            bprice=Integer.parseInt(JOptionPane.showInputDialog(null,"PRICE"));

        }catch(Exception e){}
    }
    public class UseBook1
    {
        Book1 bk;
        LinkedList<Book1>ls;
        public UseBook1()
        {
            ls=new LinkedList<Book1>();
            bk=null;
        }
        boolean search(int no)
        {
            int i=0,n=ls.size();
            while(i<n)
            {
                bk=ls.get(i);
                if(bk.bno==no)
                {
                    break;
                }
                i++;
            }
            if(i==n)
            {
                bk=null;
            }
            return(i<n);
        }
//------------------------------------------------------
        void add()
        {
            int no=0;
            try
            {
                no=Integer.parseInt(JOptionPane.showInputDialog(null,"BOOK NO:"));
            }catch(Exception e){return ;}
            if(search(no)==true)
            {
                JOptionPane.showMessageDialog(null, "RECORD EXISTS!!");
                return ;
            }
            bk=new Book1();
            bk.setData(no);
            ls.add(bk);
            JOptionPane.showMessageDialog(null,"ADDED");
        }
//------------------------------------------------------
        void mod()
        {
           int no=0;
            try
            {
                no=Integer.parseInt(JOptionPane.showInputDialog(null,"BOOK NO:"));
            }catch(Exception e){return ;}
            if(search(no)==false)
            {
                JOptionPane.showMessageDialog(null, "RECORD NOT EXISTS!!");
                return ;
            }
            bk.setData(no);
            JOptionPane.showMessageDialog(null,"RECORD MODIFIED");
        }
//------------------------------------------------------
        void del()
        {
           int no=0;
            try
            {
                no=Integer.parseInt(JOptionPane.showInputDialog(null,"BOOK NO:"));
            }catch(Exception e){return ;}
            if(search(no)==false)
            {
                JOptionPane.showMessageDialog(null, "RECORD NOT EXISTS!!");
                return ;
            }
            ls.remove(bk);
            JOptionPane.showMessageDialog(null,"RECORD DELETED!");
        }
    }
}
