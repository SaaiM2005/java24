import java.io.*;
import mypkg.Util;
public class RPData
{
    public static void main(String [] args)
    {
        FileInputStream fis=null;
        DataInputStream dis=null;
        try
        {
            fis=new FileInputStream("stu.dat");
            dis=new DataInputStream(fis);
        }
        catch(Exception e){}
        int no=0;
        String nm="";
        Double mrk=0.0;
        while(true)
        {
            try
            {
                no=dis.readInt();
                nm=dis.readUTF();
                mrk=dis.readDouble();
            }
            catch(Exception e){break;}
            String s="\nRoll No"+no+"\n Name:"+nm+"\n MArks: "+mrk;
            Util.display(s);
            try
            {
                fis.close();
                dis.close();
            }
            catch(Exception e){}
        }
    }

}