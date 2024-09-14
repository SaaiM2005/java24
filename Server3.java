import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.ServerSocket;
import java.net.Socket;
 class Server3 
 {
    public static void main(String[] args) throws Exception 
    {
        ServerSocket ss=new ServerSocket(1234);
        System.out.println("Server Started");
        Socket s=ss.accept();
        DataInputStream dis=new DataInputStream(s.getInputStream());
        DataOutputStream dos=new DataOutputStream(s.getOutputStream());
        
        String source=dis.readUTF();//READS SOURCE FILE NAME SEND BY CLIENT
        boolean result=(new File(source)).exists();//FILE EXIST Y/N
        dos.writeBoolean(result);//SENDS TRUE IF FILE FOUND OTHERWISE FALSE
        if(result==false)
        {
            dos.close();
            dis.close();
            s.close();
            return;
        }
        FileInputStream fis=new FileInputStream(source);
        int val=0;//BY DEFAULT INT
        while(true)
        {
            val=fis.read();
            if(val==-1)
            {
                break;
            }
            dos.writeInt(val);
        }
        Thread.sleep(1000);
        fis.close();
        dis.close();
        dos.close();
        s.close();

    }
 }