import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
class Server6 extends Thread
{
    ServerSocket ss;
    LinkedList cls,mls;
    String msg;
    Socket s;
    DataOutputStream dos;
    BufferedReader br;
    
    Server6()
    {
        super();
        try
        {
            ss=new ServerSocket(3030);
            mls=new LinkedList();//msg
            cls=new LinkedList();//client list
            br=new BufferedReader(new InputStreamReader(System.in));
          
        }catch(Exception e){}
        while(true)
        {
            try
            {
                s=ss.accept();
                cls.add(new con(s));
                start();
            }catch(Exception e){}
        }
    }
    public void run()
    {
    
        int p=0,n=0,i=0;
        while(true)
        {
            //n=mls.size();
            System.out.println("Enter Message:");
            try 
            {
                msg=br.readLine();
            } catch (IOException e) {}
        
                con cref=null;
                int j=0,k=cls.size();
                while(j<k)
                {
                    try
                    {
                        cref=(con)cls.get(j);
                        cref.dos.writeUTF(msg);
                    }catch(Exception e){}
                    j++;
                    if(msg.equals("bye"))
                    {
                        System.exit(0);
                    }
                }
                try
                {
                    Thread.sleep(1000);
                }catch(Exception e){}
            
        }
    }
    public static void main(String[] args) 
    {
        Server6 s=new Server6();
    }
}
class con
{
    DataOutputStream dos;
    con(Socket s)
    {
        try
        {
            dos=new DataOutputStream(s.getOutputStream());
        }catch(Exception e){}
    }
}