import javax.swing.*;
import java.util.*;
public class Matrix5 
{
    int [][]x;
    Matrix5()
    {
        x=new int[3][];
        x[0]=new int [3];
        x[1]=new int[3];
        x[2]=new int[3];
    }
    public String toString()
    {
        String s="\n Matrix\n"+Arrays.toString(x[0])+"\n"+Arrays.toString(x[1])+"\n"+Arrays.toString(x[2])+"\n";
        return s;
    }
    void display()
    {
        JOptionPane.showInternalMessageDialog(null,toString());
    }
    void setData()
    {
        int i=0,j=0;
        while(i<3)
        {
            j=0;
            while(j<3)
            {
                try
                {
                    x[i][j]=Integer.parseInt(JOptionPane.showInputDialog(null,"x["+i+"]["+j+"]:"));
                }
                catch(Exception e){continue;}
                j++;
            }
            i++;
        }
    }
    public static void main(String [] args)
    {
        Matrix5 a=new Matrix5();
        a.setData();
        a.display();
    }
}