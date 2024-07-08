import java.lang.reflect.Array;
import java.util.Arrays;

import javax.swing.*;
interface Inter2
{
    void setData();
    void display();
}
interface IComp
{
    int total();
    int avg();
}
interface IArray2 extends Inter2,IComp
{
    int size=5;
}
class ArrayImpl implements IArray2 //WHEN WE DEFINE THE DISPLAY FUNCTION THE ERROR IN ArrayImpl VANISHES.
{
    int[]arr;
    ArrayImpl()//CONSTRUCTOR
    {
        arr=new int[size];
    }
    public int total()//TOTAL METHOD
    {
        int tot=arr[0],i=1;
        while(i<size)
        {
            tot+=arr[i++];
        }
        return tot;
    }
    public int avg()//AVG METHOD
    {
        return total()/size;
    }    
    public String toString()
    {
        String s="DATA:\n"+Arrays.toString(arr)+"\nTOTAL:"+total()+"\nAVERAGE:"+avg();
        return s;
    }
    public void setData() {
        for (int i = 0; i < size; i++) {
            String input = JOptionPane.showInputDialog("Enter value for element " + (i + 1));
            try {
                arr[i] = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid integer.");
                i--; // Repeat the current iteration to re-enter the value
            }
        }
    }
    public void display()
    {
        JOptionPane.showMessageDialog(null,toString());
    }
}
public class Intr2Impl
{
    public static void main(String[] args) {
        ArrayImpl a=new ArrayImpl();
        a.setData();
        a.display();

        ArrayImpl b=new ArrayImpl();
        Inter2 c=b;//INTERFACE REFERNCE VARIABLE CAN HOLD ALL THE METHODS THAT IT HAS REFERRED!! 
        c.setData();
        c.display();
        IComp d=b;
        System.out.println("TOTAL:"+d.total());
        System.out.println("AVG:"+d.avg());
    }
}


/* 
    Interface name:- Inter3
    METHODS:-
        void setData();
        void setData(int n);
        void display();
        int getNo();
        int getPrice();
    class Book3 implements Inter3
        price,name    -DEFINE APPROPRIATE CONSTRUCTORS AND IMPLEMENTATION OF Inter3
*/