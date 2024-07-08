
//USE OF COMPARABLE INTERFACE
//THEY ARE USED TO FIND NATURAL ORDERING DATABASE
//JAVA.LANG HAS COMPARABLE INTERFACE
import javax.swing.*;
import java.util.*;
public class Student4 implements Comparable<Student4>
{
    int no;
    String nm;
    Student4()
    {
        no=0;
        nm=new String();
    }
    Student4(int a,String b)
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
    public int compareTo(Student4 a)
    {
        //return no-a.no;
        return nm.compareTo(a.nm);
    }
    public static void main(String[]args)
    {
        Student4[]k=new Student4[5];
        k[0]=new Student4(15,"AVANI");
        k[1]=new Student4(11,"SOUMITRA");
        k[2]=new Student4(1,"SAI");
        k[3]=new Student4(12,"HARSH");
        k[4]=new Student4(13,"SHREYASH");
        System.out.println(Arrays.toString(k));
        Arrays.sort(k);
        System.out.println(Arrays.toString(k));
    }


}   

