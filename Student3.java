
//USE OF COMPARABLE INTERFACE
//THEY ARE USED TO FIND NATURAL ORDERING DATABASE
//JAVA.LANG HAS COMPARABLE INTERFACE
import javax.swing.*;
import java.util.*;
public class Student3 implements Comparable<Student3>
{
    int no;
    String nm;
    Student3()
    {
        no=0;
        nm=new String();
    }
    Student3(int a,String b)
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
    public int compareTo(Student3 a)
    {
        return no-a.no;
    }
    public static void main(String[]args)
    {
        Student3[]k=new Student3[5];
        k[0]=new Student3(15,"AVANI");
        k[1]=new Student3(11,"HARSH");
        k[2]=new Student3(1,"SAI");
        k[3]=new Student3(12,"SOUMITRA");
        k[4]=new Student3(13,"SHREYASH");
        System.out.println(Arrays.toString(k));
        Arrays.sort(k);
        System.out.println(Arrays.toString(k));
    }
}   

