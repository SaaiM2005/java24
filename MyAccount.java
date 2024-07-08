import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

import mypkg.Account;
import mypkg.Util;
class MyAccount {

    HashSet <Integer> a;
    Map <Integer,Account> b ;
    Account obj;
    MyAccount()
    {
        obj = null;
        a=new HashSet<Integer>();
        b=new HashMap <Integer,Account> ();
    
    }
    void add()
    {
        int no=Util.iInput("Account No:");
        if(a.add(no)==false)
        {
            Util.display("Record Exist");
            return ;
        }
        obj=new Account();
        obj.setData(no);
        b.put(no,obj);  //adds to Hashmap
    }
    void display()
    {
        Iterator<Integer>c=a.iterator();
        while(c.hasNext())
        {
            int no=c.next();
            obj=b.get(no);
            obj.display();
            
        }
     }
     void mod()
    {
        int no=Util.iInput("Account No:");
        if(a.contains(no)==false)
        {
            Util.display("RECORD NOT FOUND");
            return;
        }
        obj=b.get(no);
        obj.display();
        obj.setData(no);
        

     
      
         //adds to Hashmap
    }
    void del()
    {
        int no=Util.iInput("Account No:");
        if(a.contains(no)==false)
        {
            Util.display("RECORD NOT FOUND");
            return;
        }
        b.remove(no);
        a.remove(no);//

     
      
         //adds to Hashmap
    }
public static void main(String [] args)throws Exception
{
    MyAccount p =new MyAccount();
    p.add();
    p.add();
    p.add();
    p.display();
    p.mod();
    p.display();
    p.del();
    p.display();
    }

}


