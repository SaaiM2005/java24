
//USE OF COMPARABLE INTERFACE
//THEY ARE USED TO FIND NATURAL ORDERING DATABASE
//JAVA.LANG HAS COMPARABLE INTERFACE

//IF 2 NAMES SAME WE HAVE METHOD IN THIS CODE
import javax.swing.*;
import java.util.*;
public class Student5 implements Comparable<Student5>
{
    int no;
    String nm;
    Student5()
    {
        no=0;
        nm=new String();
    }
    Student5(int a,String b)
    {
        no=a;
        nm=b;
    }
    public String toString()
    {
        return "\nNO:"+no+"\nNAME:"+nm;
    }
    void display()
    {
        System.out.println(toString());
    }
    //IF SAME NAMES ARE OBTAINED
    public int compareTo(Student5 a)
    {
       int val=nm.compareTo(a.nm);
       if(val==0)
       {
        return no-a.no;
       }
       return val;
    }
    public static void main(String[]args)
    {
        Student5[]k=new Student5[5];
        k[0]=new Student5(15,"AVANI");
        k[1]=new Student5(11,"SOUMITRA");
        k[2]=new Student5(1,"SAI");
        k[3]=new Student5(12,"SOUMITRA");
        k[4]=new Student5(13,"SHREYASH");
        System.out.println(Arrays.toString(k));
        Arrays.sort(k);
        System.out.println(Arrays.toString(k));
    }
} 


