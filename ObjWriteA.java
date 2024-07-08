// HashSet<Integer>a=new HashSet();  
/*
 hashset saves set of keys 
    WE CAN AVOID DUPLICATION OF DATA USING HASHSET 
 */
import mypkg.Util;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;

import mypkg.Account;
class ObjWriteA
{
    public static void main(String[] args) throws Exception
    {
        FileOutputStream fos = new FileOutputStream("acc.dat");
        ObjectOutputStream oos= new ObjectOutputStream(fos);
        HashSet<Integer>a=new HashSet();     // a is object of hashset
        Account obj=null;
        while (true) 
        {
            int no=Util.iInput("ACCOUNT NO");
            if(no==0)
            {
                break;
            }    
            if(a.add(no)==false)//to avoid duplication
            {
                Util.display("RECORD EXISTS");
                continue;
            }
            obj=new Account();
            obj.setData(no);
            oos.writeObject(obj);
        }
        oos.close();
        fos.close();
    }
}