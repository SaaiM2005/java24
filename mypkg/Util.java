package mypkg;
import javax.swing.*;
public class Util 
{
    public static void display(String str)
    {
        JOptionPane.showMessageDialog(null,str);
    }
    public static int iInput(String str)
    {
        int val=0;
        try
        {
            val=Integer.parseInt(JOptionPane.showInputDialog(null,str));
        }
        catch(Exception e){}
        return val;
    }
    public static double dInput(String str)
    {
        double val=0.0;
        try 
        {
            val=Double .parseDouble(JOptionPane.showInputDialog(null,str));
        }
        catch(Exception e){}
        return val;
    }
    public static String sInput(String str)
    {
        String s=" ";
        try
        {
            s=JOptionPane.showInputDialog(null,str);
        }
        catch(Exception e){}
        return s;
    }
    public static int oInput(String title,String msg,String [] option)
    {
        int opt=JOptionPane.showOptionDialog(null, msg, title,JOptionPane.YES_OPTION,JOptionPane.INFORMATION_MESSAGE,null,option, 0);
        return opt;
    }
}
