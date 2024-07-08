//MARKS WISE SORTING IS OBTAINED
import javax.swing.*;
import java.util.*;
public class Student7 implements Comparable<Student7>,Comparator<Student7>
{
    int no;
    String nm;
    double mrk;
    Student7()
    {
        no=0;
        nm=new String();
        mrk=0.0;
    }
    Student7(int a,String b,double c)
    {
        no=a;
        nm=b;
        mrk=c;
    }
    public String toString()
    {
        String s= "\nNO:"+no+"\nNAME:"+nm+"\nMARKS:"+mrk;
        return s;
    }
    void display()
    {
        System.out.println(toString());
    }
    //IF SAME NAMES ARE OBTAINED
    public int compareTo(Student7 a)//THIS METHOD IS OF COMPARABLE
    {
       return no-a.no; //no minus a.no  
    }
    public int compare(Student7 a,Student7 b)//THIS METHOD IS FOR COMPARATOR
    {
        Double p=new Double(a.mrk);
        Double q=new Double(b.mrk);
        return p.compareTo(q);
    }

    public static Comparator<Student7>ByName=new Comparator<Student7>()
    {
        public int compare(Student7 a,Student7 b)
        {
            return (a.nm).compareTo(b.nm);
        }
    };
    public static Comparator <Student7>ByNameNo=new Comparator<Student7>() {
        public int compare(Student7 a,Student7 b)
        {
            int val=(a.nm).compareTo(b.nm);
            if(val==0)
            {
                return (a.no-b.no);
            }
            else
            {
                return val;
            }
        }
    };
    public static void main(String[]args)
    {
        Student7[]k=new Student7[5];
        k[0]=new Student7(15,"AVANI",12);
        k[1]=new Student7(11,"BIPIN",23);
        k[2]=new Student7(1,"SAI",99);
        k[3]=new Student7(12,"PRATIK",16);
        k[4]=new Student7(13,"SHREYASH",67);
       // System.out.println(Arrays.toString(k));
        //Arrays.sort(k);//COMPARABLE INTERFACE
        System.out.println(Arrays.toString(k));//ROLL NO WISE SORTING IS OBTAINED

        Arrays.sort(k,Student7.ByName);
        System.out.println(Arrays.toString(k));

        Arrays.sort(k,Student7.ByNameNo);
        System.out.println(Arrays.toString(k));

    
    }
} 


