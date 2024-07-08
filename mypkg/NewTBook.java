//comand to path "set CLASSPATH=d:\java24;"
//comand to compile "javac NewTBook.java"
package mypkg;

import mypkg.Util;
import mypkg.DataIO;
import mypkg.TBook;
import java.io.*;

public class NewTBook extends TBook implements Serializable,DataIO 
{
    int price;
    boolean state;
    public NewTBook()
    {
        super();
        price=0;
        state=true;
    }
    public boolean getState()
    {
        return state;
    }
    public void delete()
    {
        state=false;
    }
    public int getPrice()
    {
        return price;
    }
    public String toString()
    {
        String s=super.toString()+"\nPrice:"+price+"\nState:"+state;
        return s;
    }
    public void display()
    {
        Util.display(toString());
    }
    public void setData(int n)
    {
        super.setData(n);
        price=Util.iInput("Price:");
        state=true;
    }
}
