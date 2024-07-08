import java.util.*;
import javax.swing.*;
public class Matrix3 
{
    static int [][]x;
    static
    {
        x=new int[3][];
        x[0]=new int[3];
        x[1]=new int[3];
        x[2]=new int[3];
    }
    static void input()
    {
        int i=0,j=0;
        while(i<3)
        {
            j=0;
            while(j<3)
            {
                try
                {
                    x[i][j]=Integer.parseInt(JOptionPane.showInputDialog(null,"x["+i+"]["+j+"]"));
                }
                catch(Exception e){}
                j++;
            }
            i++;
        }
    }
    static void display()
    {
        String s="Matrix\n"+Arrays.toString(x[0])+"\n"+Arrays.toString(x[1])+"\n"+Arrays.toString(x[2]);
        JOptionPane.showMessageDialog(null, s);
    }
    public static void main(String [] args)
    {
        input();
        display();
    }

}
