class Shared
{
    int data,flg;
    Shared ()
    {
        flg=0;
    }
    synchronized void setData()
    {
        if(flg==0)
        {
            flg=1;
            try
            {
                wait();
            }
            catch(Exception e){}
        }
        try
        {
            Thread.sleep(1000); //1sec 
        }
        catch(Exception e){}
        data=(int)(Math.random()*100);
        notify();
    }
    synchronized void table ()
    {
        if(flg==1)
            notify();
        else
        {
            flg=1;
        }
        try
        {
            wait();
        }
        catch(Exception e){}
        String s="Table\n";
        for(int i=1;i<=10;i++)
            s=s+" "+(data*i);
        System.out.println(s);
    }
}
class CT1 extends Thread //Consumer
{
    Shared obj;
    CT1(Shared obj)
    {
        super();
        this.obj=obj;
        start();
    } 
    public void run()
    {
        obj.table();
    }
}
class CT2 extends Thread  //Producer
{
    Shared obj;
    CT2(Shared obj)
    {
        super();  
        this.obj=obj;
        start();  
    }
    public void run()
    {
        obj.setData();
    }
}
public class Wait
{
    public static void main(String [] args)
    {
        Shared a=new Shared();
        CT1 b=new CT1(a);
        CT2 c=new CT2(a);
    }
} 
