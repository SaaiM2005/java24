import java.io.*;
public class KBD14
{
    public static void main(String[]args)
    {
        BufferedReader br=null;
        try
        {
            br=new BufferedReader(new InputStreamReader(System.in));
        }catch(Exception e){}
        int no=0;
        String str="";
        System.out.println("ENTER NO:");
        try
        {
            str=br.readLine();

        }catch(Exception e){}
        try
        {
            no=Integer.parseInt(str);
        }catch(Exception e)
        {
            System.out.println("INVALID INPUT.");
            return ;
        }
        System.out.println("LENGTH:"+str.length());        
    }
}