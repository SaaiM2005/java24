package mypkg;
import  java.io.*;
import mypkg.Util;
import mypkg.DataIO;
public class TBook implements Serializable,DataIO
{
    int no;
    String nm;
    public TBook()
    {
        no=0;
        nm=new String();
    }
    public String toString()
    {
        String s="Book Data\nId:"+no+"\nName:"+nm;
        return s;
    }
    public void display()
    {
        Util.display(toString());
    }
    public void setData(int n)
    {
        no=n;
        nm=Util.sInput("BOOk Name:");
    }
    public int getNo(){return no;}
    public String getname(){return nm;}
}