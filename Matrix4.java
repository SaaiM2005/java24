
//MATRIX OPERATIONS LIKE ADD,SUB,MULTIPLICATION.
import javax.swing.*;
import java.util.*;
class Matrix4 {
    static int[][]x;
    static int[][]y;
    static int[][]z;
    static
    {
        x=new int [3][];
        y=new int [3][];
        z=new int [3][];
        for(int i=0;i<3;i++)
        {
            x[i]=new int[3];
            y[i]=new int[3];
            z[i]=new int[3];
        }
    }
    
    //INT TO STRING
    static String toString(int[][]a)
    {
        String b="MATRIX\n";
        for(int i=0;i<4;i++)
        {
            b=b+Arrays.toString(a[i])+"\n";
        }
        return b;
    }
    
    //DISPLAY
    static void display(String s)
    {
        JOptionPane.showMessageDialog(null,s);
    }
    
    //INPUT
    static void input(int[][]a)
    {
        int i=0,j=0;
        while(i<3)
        {
            try
            {
                a[i][j]=Integer.parseInt(JOptionPane.showInputDialog(null,"DATA"));
            }catch(Exception e){a[i][j]=0;}
            j++;
        }
        i++;
    }
    
    //ADDITION
    static void add()
    {
        int i=0,j=0;
        while(i<3)
        {
            j=0;
            while(j<3)
            {
                z[i][j]=x[i][j]+y[i][j];
                j++;
            }
            i++;
        }
    }

    //SUBSTRACTION
    static void sub()
    {
        int i=0,j=0;
        while(i<3)
        {
            j=0;
            while(j<3)
            {
                z[i][j]=x[i][j]-y[i][j];
                j++;
            }
            i++;
        }
    }

    //MULTIPLICATION
    static void mul()
    {
        int i=0,j=0,k=0;
        while(i<3)
        {
            for(j=0;j<3;j++)
            {
                z[i][j]=0;
                for(k=0;k<3;k++)
                {
                    z[i][j]+=(x[i][k]*y[k][j]);
                }
            }
            i++;
        }
    }

    //MENU
    static void menu()
    {
        String[]option=new String[]{"Input X","Input Y","Output X","Output Y","ADD","SUBSTRACT","MULTIPLY","~RESULT~","EXIT!!"};
        while(true)
        {
            int opt=JOptionPane.showOptionDialog(null,"CHOOSE ONE","MATRIX",JOptionPane.YES_OPTION,JOptionPane.INFORMATION_MESSAGE,null,option,0);
            if(opt==8)
            {
                break;
            }
            switch(opt)
            {
                case 0:
                    input(x);
                    break;
                case 1:
                    input(x);
                    break;
                case 2:
                    display(toString(x));
                    break;
                case 3:
                    display(toString(y));
                    break;
                case 4:
                    add();
                    break;
                case 5:
                    sub();
                    break;
                case 6:
                    mul();
                    break;
                case 7:
                    display(toString(z));        
            }
        }
    }
    public static void main(String[]args)
    {
        menu();
    }
}
