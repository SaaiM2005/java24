import java.io.*;
class KBD9
{
    public static void main(String[]args)
    {
        InputStreamReader isr=null;
        BufferedReader br=null;
        try
        {
            isr=new InputStreamReader(System.in);
            br=new BufferedReader(isr);
        }catch(Exception e){}
        int no=0;
        System.out.println("ENTER NO:");
        try
        {
            no=Integer.parseInt(br.readLine());
            // parseInt method is used to parse (or convert) a string representation of an integer into an actual integer value
        }catch(Exception e)
        {
            System.out.println("INAVLID INPUT.");
            return;
        }
        System.out.println("NO:"+no);
    }
}