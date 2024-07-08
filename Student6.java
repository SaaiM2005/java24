//MARKS WISE SORTING IS OBTAINED
import javax.swing.*;
import java.util.*;
public class Student6 implements Comparable<Student6>,Comparator<Student6>
{
    int no;
    String nm;
    double mrk;
    Student6()
    {
        no=0;
        nm=new String();
        mrk=0.0;
    }
    Student6(int a,String b,double c)
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
    public int compareTo(Student6 a)//THIS METHOD IS OF COMPARABLE
    {
       return no-a.no; //no minus a.no  
    }
    public int compare(Student6 a,Student6 b)
    {
       /*  if(a.mrk>b.mrk)
        {
            return 0;
        }
        else
        {
            return 1;
        }
        */
        //int d=(int)(b.mrk-a.mrk);//MARKS ARE OBTAINED IN DESCENDING ORDER         //HYA STEP MADHE TYPECASTING KELAY MARKS CH INTO INTEGER
        //return d;
        Double p=new Double(a.mrk);
        Double q=new Double(b.mrk);
        return p.compareTo(q);
    }
    public static void main(String[]args)
    {
        Student6[]k=new Student6[5];
        k[0]=new Student6(15,"AVANI",12);
        k[1]=new Student6(11,"SOUMITRA",23);
        k[2]=new Student6(1,"SAI",99);
        k[3]=new Student6(12,"SOUMITRA",16);
        k[4]=new Student6(13,"SHREYASH",67);
       // System.out.println(Arrays.toString(k));
        //Arrays.sort(k);//COMPARABLE INTERFACE
        System.out.println(Arrays.toString(k));//ROLL NO WISE SORTING IS OBTAINED

        Arrays.sort(k,new Student6());
        System.out.println(Arrays.toString(k));
    
    }
} 


