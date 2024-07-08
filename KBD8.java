import java.io.*;

public class KBD8 {
    public static void main(String[] args)
    {
        InputStreamReader isr=null;//br and isr are refernce variable
        BufferedReader br= null;
        try{
            isr= new InputStreamReader(System.in);
            br = new BufferedReader(isr);
        }
        catch(Exception e){}
        System.out.println("String:");
        String str = null;
        try
        {
            str= br.readLine();
        }
        catch(Exception e){}
        System.out.println(str);

    } 
}
