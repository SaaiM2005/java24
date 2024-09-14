import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;
class Client3 
{
    public static void main(String[] args) throws Exception
    {
        Socket s=new Socket("localhost",1234);
        
        DataInputStream dis=new DataInputStream(s.getInputStream());
        DataOutputStream dos=new DataOutputStream(s.getOutputStream());
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER SOURCE FILE NAME:");
        String source=br.readLine();
        dos.writeUTF(source);//WRITE FILE NAME TO SERVER
        boolean result=dis.readBoolean();
        if(result==false)
        {
            System.out.println("FILE NOT FOUND!");
        }
        else
        {
            System.out.println("Enter Destination File name:");
            String destination = br.readLine();
            int val=0;
            FileOutputStream fos=new FileOutputStream(destination);
            while(true)
            {
                val=dis.read();   
                if(val==-1)
                {
                    break; 
                }
                fos.write(val);
            }
            fos.close();
        }
        dis.close();
        dos.close();
        s.close();
        
    }
}