import javax.swing.*;
import java.util.*;
public class Student1
{
    int no;
    String nm;
    double mrk;
    Student1()
    {
        no=0;
        nm=new String();
        mrk=0.0;
    }
    Student1(int a,String b,double c)
    {
        no=a;
        nm=b;
        mrk=c;
    }
    int getNo()
    {
        return no;
    }
    double getMarks()
    {
        return mrk;
    }
    String getName()
    {
        return nm;
    }
    public String toString()
    {
        String s="ROLL NO:"+no+"\nNAME:"+nm+"\nMARKS:"+mrk;
        return s;
    }
    void setData(int no)
    {
        this.no=no;
        try
        {
            nm=JOptionPane.showInputDialog(null,"NAME:");
            mrk=Double.parseDouble(JOptionPane.showInputDialog(null,"MARKS"));
        }catch(Exception e){}
    }
    void setData()
    {
        try
        {
            no=Integer.parseInt(JOptionPane.showInputDialog(null,"ROLL NO"));
            nm=JOptionPane.showInputDialog(null,"NAME");
            mrk=Double.parseDouble(JOptionPane.showInputDialog(null,"MARKS"));
        }catch(Exception e){}
    }
    void display()
    {
        JOptionPane.showMessageDialog(null,toString());
    }
    public static void main(String[] args) 
    {
    /*  ------FIRST MAIN------
        Student1 a=new Student1();
        a.setData(101);
        a.display();
    */
    
        Student1 b=null ;//B IS A REFERNCE VARIABLE REFERS TO Student1
        b=new Student1(6,"RAVI",9.2);
        b.display();
        b.setData(6);
        b.display();
        Student1[]c=new Student1[5];
        int i=0;
        while(i<c.length)
        {
            c[i]=new Student1();
            c[i].setData(i+1);
            i++;
        }
        for(i=0;i<5;i++)
        {
            c[i].display();
        }
    }
}