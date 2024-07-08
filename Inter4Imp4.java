import javax.swing.*;
import java.util.*;
interface Int1
{
    void setData();
    void display();
}
interface Int2
{
    int total();
    int average();
}
interface Int3
{
    int findMin();
    int findMax();
} 
interface Int4 extends Int2,Int3
{
    int size=5;
}
public class Inter4Imp4 implements Int1,Int4
{
    int [] arr;
    Inter4Imp4()
    {
        arr=new int[size];
    }
    public int total()
    {
        int i=1,tot=arr[0];
        while(i<size)
        {
            tot+=arr[i];
            i++;
        }
        return tot;
    }
    public int average()
    {
        return total()/size;
    }
    public int findMax()
    {
        int max=arr[0],i=1;
        while(i<size)
        {
            if(arr[i]>max)
                max=arr[i];
            i++;
        }
        return max;
    }
    public int findMin()
    {
        int min=arr[0],i=1;
        while(i<size)
        {
            if(arr[i]<min)
                min=arr[i];
            i++;
        }
        return min;
    }
    public void setData()
    {
        int i=0;
        while(i<size)
        {
            try
            {
                arr[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Data:"));
                i++;
            }
            catch(Exception e){}
        } 
    }
    public String toString()
    {
        String s="\n Data:"+Arrays.toString(arr)+"\nTotal:"+total()+"\nAverage:"+average()+"\n Max Value:"+findMax()+"\n Min Value:"+findMin();
        return s;
    }
    public void display()
    {
        JOptionPane.showMessageDialog(null,toString());
    }
    public static void main(String [] args)
    {
        Inter4Imp4 a=new Inter4Imp4();
        a.setData();
        a.display();
    }
}