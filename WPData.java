import java.io.*;
import mypkg.Util;
class WPData
{
    public static void main(String[]args)throws Exception
    {
        FileOutputStream fos = new FileOutputStream("stu.dat");
        DataOutputStream dos=new DataOutputStream(fos);
        int no;
        String nm="";
        double mrk =0.0;
        while(true)
        {
            no=Util.iInput("ROLL NO:");
            if(no==0)
            {
                break;
            }
            nm=Util.sInput("NAME");
            mrk=Util.dInput("MARKS");
            dos.write(no);
            dos.writeUTF(nm);//UTF STANDS FOR UNIVERSAL TEXT FORMAT
            dos.writeDouble(mrk);
        }
        dos.close();
        fos.close();
    }
}