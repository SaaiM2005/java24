class Thrd2 extends Thread 
{
    int cnt;
    String tnm;
    Thrd2(String nm,int val)
    {
        super(nm);  //NAMING THE THREAD
        cnt=val;
        tnm=nm;
    }
    public void run()
    {
        int i=1;
        while(i<=cnt)
        {
            System.out.println( tnm + " "+ i);
            try
            {
                Thread.sleep(1000);
            }catch(Exception e){}
            i++;
        }
    }
}
public class Thread2
{
    public static void main(String[] args) {
        System.out.println("Main Starts");
        Thrd2 A=new Thrd2("A",3);
        Thrd2 B=new Thrd2("A",3);
        Thrd2 C=new Thrd2("A",3);
    
        A.start();
        B.start();
        C.start();
        System.out.println("Main Ends");
    }
}