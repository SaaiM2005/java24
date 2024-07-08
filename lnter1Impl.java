import javax.swing.*;
interface Inter1Impl 
{
    void setData();
    void display();    
}
public class lnter1Impl implements Inter1Impl
{
    int no;
    String nm;
    lnter1Impl()
    {
        no=0;
        nm=new String();
    }
    public void setData()
    {
        try
        {
            no=Integer.parseInt(JOptionPane.showInputDialog(null,"NO:"));
            nm=JOptionPane.showInputDialog(null,"name"); 
        }catch(Exception e){}
    }   
    public String toString()
    {
        return "NO:"+no+"\nNAME:"+nm;
    }
    public void display()
    {
        JOptionPane.showMessageDialog(null,toString());
    }
    public static void main(String[]args)
    {
        lnter1Impl a=new lnter1Impl();
        a.setData();
        a.display();
    }
}
