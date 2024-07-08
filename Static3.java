import java.util.*;
import javax.swing.*;
import java.io.*;
class Static3
{
    static int[]x;
    static
    {
        x=new int[5];
    }
    static void input()
    {
        for(int i=0;i<5;i++)
        {
            try
            {
                x[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"DATA"));
            }catch(Exception e){}
        }
    }
    static void display()
    {
        JOptionPane.showMessageDialog(null,Arrays.toString(x));
    }
    public static void main(String[]args)
    {
        input();
        display();
    }
}
