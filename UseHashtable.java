import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

import mypkg.Account;
import mypkg.Util;
public class UseHashtable 
{
    Hashtable<Integer,Account>b;
    Account obj;    
    UseHashtable()
    {
        obj=null;
        b=new Hashtable<Integer,Account>();
    }
    void add()//ADDITION
    {
        int no=Util.iInput("ACCOUNT NO:");
        if(b.containsKey(no)==true)
        {
            System.out.println("RECORD EXISTS");
            return;
        }
        obj=new Account();
        obj.setData(no);
        b.put(no,obj);
        Util.display("RECORD ADDED");
    }
    void mod()//MODIFICATION 
    {
        int no=Util.iInput("ACCOUNT NO:");
        if(b.containsKey(no)==false)
        {
            System.out.println("RECORD NOT EXISTS");
            return;
        }
        obj=b.get(no);//RETRIVES VALUE ASSOCIATED WITH THE KEY
        obj.setData(no);//REFERNCE NI CHANGES KELE KI TE PERMANANT HOTAT
        Util.display("RECORD MODIFIED");
    }
    void del()//DELETION 
    {
        int no=Util.iInput("ACCOUNT NO:");
        if(b.containsKey(no)==false)
        {
            System.out.println("RECORD NOT EXISTS");
            return;
        }
        b.remove(no);
        Util.display("RECORD DELETED");
    }
    void display()
    {
        Set<Integer>s=b.keySet();
        Iterator<Integer>a=s.iterator();
        while (a.hasNext()) 
        {
            obj=b.get(a.next());
            obj.display();    
        }
    }
    void menu()
    {
        String[]options=new String[]{"ADD","MODIFY","DELETE","DISPLAY","EXIT"};
        while(true)
        {
            int opt=Util.oInput("CHOOSE ONE","ACCOUNT",options);
            if(opt==4)
            {
                break;
            }
            switch(opt)
            {
                case 0:
                    add();
                    break;
                case 1:
                    mod();
                    break;
                case 2:
                    del();
                    break;
                case 3:
                    display();
            }
        }
    }
    public static void main(String[] args) 
    {
        UseHashtable p=new UseHashtable();
        p.menu();    
    }
    }

