import mypkg.Util;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import mypkg.Account;
class ObjWrite
{
    public static void main(String[] args) throws Exception
    {
        FileOutputStream fos = new FileOutputStream("acc.dat");
        ObjectOutputStream oos= new ObjectOutputStream(fos);
        Account obj=null;
        while (true) 
        {
            int no=Util.iInput("ACCOUNT NO");
            if(no==0)
            {
                break;
            }    
            obj=new Account();
            obj.setData(no);
            oos.writeObject(obj);
        }
        oos.close();
        fos.close();
    }
}