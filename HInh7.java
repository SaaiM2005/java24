
//HIRERACHICAL INHERITANCE

import javax.swing.*;
import java.util.*;
class Array7 //SUPER CLASS
{
    int[]arr;
    Array7()
    {   
        arr=new int[5];
    }
    void set(int pos,int d)
    {
        arr[pos]=d;
    }
    int get(int pos)
    {
        return arr[pos];
    }
    public String toString()
    {
        return "\nDATA:\n"+Arrays.toString(arr);
    }
}
//----------------------------------------------------
class Stack7 extends Array7
{
    int top;
    Stack7()
    {
        super();
        top=-1;
    }
    void push(int d)
    {
        if(top==arr.length-1)
        {
            JOptionPane.showMessageDialog(null,"OVERFLOW!");
            return ;
        }
        set(++top,d);
    }
    void pop()
    {
        if(top==-1)
        {
            JOptionPane.showMessageDialog(null, "UNDERFLOW!!");
            return ;
        }
        top--;
    }
    public String toString()
    {
        String s="STACK";
        if(top==-1)
        {
            s=s+" EMPTY";
        }
        else
        {
            for(int i=top;i>=0;i--)
            {
                s=s+" "+get(i);
            }
        }
        return s;
    }
    void display()
    {
        JOptionPane.showMessageDialog(null,toString());
    }
    void menu()
    {
        String[] options = new String[]{"PUSH", "POP", "DISPLAY", "EXIT"};
        while (true)
        {
            int choice = JOptionPane.showOptionDialog(null, "CHOOSE ONE", "STACK", JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, 0);

            if (choice == 3) // EXIT
            {
                break;
            }

            switch (choice)
            {
                case 0: // PUSH
                    try {
                     String dataInput = JOptionPane.showInputDialog(null, "Enter Data");
                        if (dataInput != null) {
                            int data = Integer.parseInt(dataInput);
                            push(data);
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Invalid Input! Please enter a valid integer.");
                    }
                    break;

                case 1: // POP
                    pop();
                    break;
                case 2: // DISPLAY
                    display();
                    break;
            }   
        }
    }
}
//---------------------------------------------------
class Queue7 extends Array7
{
    int fr,rr;
    Queue7()
    {
        super();
        rr=-1;
        fr=0;
    }
    void insert(int d)
    {
        if(rr==arr.length-1)
        {
            JOptionPane.showMessageDialog(null,"OVERFLOW!");
            return ;
        }
        set(++rr,d);
    }
    void remove()
    {
        if(rr<fr)
        {
            JOptionPane.showMessageDialog(null, "UNDERFLOW!!");
            return ;
        }
        fr++;
    }
    public String toString()
    {
        String s="QUEUE";
        if(rr<fr)
        {
            s=s+"EMPTY";
        }
        else
        {
            for(int i=fr;i<=rr;i++)
            {
                s=s+" "+get(i);
            }
        }
        return s;
    }
    void display()
    {
        JOptionPane.showMessageDialog(null,toString());
    }
    void menu()
    {
        String[] options = new String[]{"INSERT", "REMOVE", "DISPLAY", "EXIT"};
        while (true)
        {
            int choice = JOptionPane.showOptionDialog(null, "CHOOSE ONE", "QUEUE", JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, 0);

            if (choice == 3) // EXIT
            {
                break;
            }

            switch (choice)
            {
                case 0: // PUSH
                    try {
                     String dataInput = JOptionPane.showInputDialog(null, "Enter Data");
                        if (dataInput != null) {
                            int data = Integer.parseInt(dataInput);
                            insert(data);
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Invalid Input! Please enter a valid integer.");
                    }
                    break;

                case 1: // POP
                    remove();
                    break;
                case 2: // DISPLAY
                    display();
                    break;
            }   
        }
    }
}
//--------------------------FINAL CALL----------------------------




public class HInh7
{
    public static void main(String[] args) {
        /*Stack7 a=new Stack7();
        a.menu();

        Queue7 b=new Queue7();
        b.menu();
    }*/
    String[]option=new String[]{"STACK","QUEUE","EXIT"};
    int opt=JOptionPane.showOptionDialog(null, "CHOOSE ONE", "DATA STRUCTURE", JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option, 0);
    if(opt==2)
    {
        return ;
    }
    //Array7 ref=null;
    if(opt==0)
        (new Stack7()).menu();
    else
        (new Queue7()).menu();
    
    } 
}