import java.util.*;
import javax.swing.*;
public class Student2
{
    int no;
    String nm;
    double mrk;
    Student2()   //it is constructor....
    {
        no=0;
        nm=new String();
        mrk=0.0;
    }
    Student2(int a,String b,double c)  //it is parameterised constructor...  
    {
        no=a;
        nm=b;
        mrk=c;
    }
    // int getNo()
    // {
    //     return no;
    // }
    // double getMarks()
    // {
    //     return mrk;
    // }
    // String getName()
    // {
    //     return nm;
    // }
    public String toString()
    {
        String s="ROLL NO:"+no+"\nNAME:"+nm+"\nMARKS:"+mrk;
        return s;
    }
    void setData(int no)
    {
        this.no=no;  //this is reference veriable toSting....
        try
        {
            //Double.parseDouble String input parse as double..
            nm=JOptionPane.showInputDialog(null,"NAME:");
            mrk=Double.parseDouble(JOptionPane.showInputDialog(null,"MARKS"));
        }
        catch(Exception e){}
    }
    void setData()
    {
        try{
            no=Integer.parseInt(JOptionPane.showInputDialog(null,"Roll No:"));
            nm=JOptionPane.showInputDialog(null,"name");
            mrk=Double.parseDouble(JOptionPane.showInputDialog(null,"Marks"));
            
        }
        catch(Exception e){}
    }

    void display()
    {
        JOptionPane.showMessageDialog(null, toString());
    }

    public static void main(String [] args)
    {
        // Student1 a=new Student1();     //new is for creating new obj && Student1(); calls for constructor...
        // a.setData(101);
        // a.display();

        // Student1 b = null; /// b is referance variable referce to object of type Student1 and no constructor is called to allocate memory...
        // b=new Student1(6,"Ravi",9.2);  //this calls to para constructor..
        // b.display();                           
        // b.setData();
        // b.display();


        Student1[]c = new Student1[2]; //array of class type Student1
        int i=0;
        while(i<c.length)
        {
            c[i]=new Student1();
            c[i].setData(i+1);
            i++;
        }
        for(i=0;i<c.length;i++)
        {
            c[i].display();
        }
        System.out.println(Arrays.toString(c));  //converts to string
    }
}

//SAME PROGRAM HAVING BOOK AND PRICE 

//getter ka vaparlet