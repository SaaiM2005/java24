//ADDITION ,MULTIPLICATION,SUBSTRACTION USING REFRENCE VARIABLES
import javax.swing.*;
import java.util.*;
public class Matrix6
{
    int [][]x;
    Matrix6()
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
    void add(Matrix6 a,Matrix6 b)
    {
        int i=0,j=0;
        while(i<3)
        {
            j=0;
            while(j<3)
            {
                x[i][j]=a.x[i][j]+b.x[i][j];
                j++;
            }
            i++;
        }
    }
    void sub(Matrix6 a,Matrix6 b)
    {
        int i=0,j=0;
        while(i<3)
        {
            j=0;
            while(j<3)
            {
                x[i][j]=a.x[i][j]-b.x[i][j];
                j++;
            }
            i++;
        }
    }
    void mul(Matrix6 a,Matrix6 b)
    {
        int i=0,j=0,k=0;
        while(i<3)
        {
            j=0;
            while(j<3)
            {
                x[i][j]=0;
                for(k=0;k<3;k++)
                {
                    x[i][j]+=(a.x[i][k]*b.x[k][j]);
                }
                j++;
            }
            i++;

        }
    }
    public static void main(String [] args)
    {
        Matrix6 a=new Matrix6();
        Matrix6 b=new Matrix6();
        Matrix6 c=new Matrix6();
        a.setData();
        a.display();
        b.setData();
        b.display();
        c.add(a, b);
        c.display();
    }
}

/*class :Result1
Fields:-
    int rno;
    int[]mrk
    no of elements
    total , avg , marks modificat
*/
