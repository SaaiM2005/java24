//run with command "set CLASSPATH=D:\java24\"
import mypkg.TBook;

public class UseTBook 
{
    public static void main(String [] args)
    {
        TBook a= new TBook();
        a.setData(101);
        a.display();
    }   
}