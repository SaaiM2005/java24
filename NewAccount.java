import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

import mypkg.Account;
import mypkg.Util;
class NewAccount{

    //HashSet <Integer> a;
    Hashtable <Integer,Account> b ;
    Account obj;
    NewAccount()
    {
        obj = null;
        b=new Hashtable <Integer,Account> ();
    
    }
    void add()
    {
        int no=Util.iInput("Account No:");
        if(b.containsKey(no)==true)
        {
            System.out.println("RECORD EXISTS");
            return;
        }

        obj=new Account();
        obj.setData(no);
        b.put(no,obj);  //adds to Hashmap
    }
    void display()
    {
        Iterator<Map.Entry< Integer,Account>> it = b.entrySet().iterator();
while (it.hasNext()) {
    Map.Entry< Integer,Account> c = it.next();
    obj=c.getValue();
    obj.display();

}
     }
     void mod()
    {
        int no=Util.iInput("Account No:");
        if(b.containsKey(no)==false)
        {
            Util.display("RECORD NOT FOUND");
            return;
        }
        obj=b.get(no);
        
        obj.setData(no);
        

     
      
         //adds to Hashmap
    }
    void del()
    {
        int no=Util.iInput("Account No:");
        if(b.containsKey(no)==false)
        {
            Util.display("RECORD NOT FOUND");
            return;
        }
        b.remove(no); //adds to Hashmap
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


