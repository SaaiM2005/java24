package mypkg;
import java.io.*;
import mypkg.Util;

public class Account implements Serializable
{
    int no;
    String nm;
    double bal;
    boolean state;
    public Account()
    {
        no=0;
        bal=0.0;
        state=true;
    }
    public String toString()
    {
        String s="\nAccount No:"+no+"\nName:"+nm+"\nBalance:"+bal+"\nState:"+state;
        return s;
    }
    public void display()
    {
        Util.display(toString());
    }
    public void setData(int n)
    {
        no=n;
        nm=Util.sInput("Name:");
        bal=Util.dInput("Balance:");
        state=true;
    }
    public int getNo()
    {
        return no;
    }
    public String  getName()
    {
        return nm;
    }
    public double getBalane()
    {
        return bal;
    }
    public boolean getState()
    {
        return state;
    }
    public void delete()
    {
        state=false;
    }
}
