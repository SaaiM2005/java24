import javax.swing.*;
import java.io.*;
public class Static2 
{
    static int no;
    static BufferedReader br;
    static
    {
        try
        {
            br=new BufferedReader(new InputStreamReader(System.in));
        }catch(Exception e){}
    }
    static void input()
    {
        try
        {   
            no=Integer.parseInt(JOptionPane.showInputDialog(null,"DATA"));
        }catch(Exception e){}
    }
    static void display()
    {
        JOptionPane.showMessageDialog(null,"NO:"+no);
    }
    public static void main(String[]args)
    {
        input();
        display();
    }

}
