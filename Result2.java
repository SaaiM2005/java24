import javax.swing.*;
import java.util.*;
class Result2 {
    int rno;
    Vector<Integer>mrk;// dynamic array that can grow or shrink in size as needed
    Result2()
    {
        rno=0;
        mrk=new Vector<Integer>();
    }
    int total()
    {
        int tot=0,i=0,n=mrk.size();
        while(i<n)
        {
            tot=tot+(mrk.get(i)).intValue();
            i++;
        }
        return tot;
    }
    int average()
    {
        return total()/mrk.size();
    }
    public String toString()
    {
        return "ROLL NO:"+rno+"\nMARKS:\n"+mrk+"\nTOTAL:"+total()+"\nAVERAGE:"+average();
    }
    void display()
    {
        JOptionPane.showMessageDialog(null, toString());
    }
    void setData(int n)
    {
        rno=n;
        int val=0;
        while(true)
        {
            try
            {
                val=Integer.parseInt(JOptionPane.showInputDialog(null,"MARKS"));
            }catch(Exception e){continue;}
            if(val==0)
            {
                break;
            }
            mrk.add(val);
        }
    }
    
    boolean  isMore(int val)
    {
        return total()>val;
    }
    boolean  isLess(int val)
    {
        return total()<val;
    }
    boolean  isMore(Result2 k)
    {
        return total()>k.total();
    }
    boolean  isLess(Result2 k)
    {
        return total()<k.total();
    }
    public static void main(String[]args)
    {
        Result2 a=new Result2();
        a.setData(101);
        a.display();
        Result2 b=new Result2();
        b.setData(102);
        b.display();
        if(a.isMore(b))
        {
            JOptionPane.showMessageDialog(null, a.toString());
        }
        else
        JOptionPane.showMessageDialog(null, b.toString());

        
    }
}
