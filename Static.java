import java.io.*;
public class Static
{
    static int no;
    static BufferedReader br;
    static
    {
        try
        {
            br=new BufferedReader(new InputStreamReader(System.in));
        }catch(Exception e){}
    }
    static void input()
    {
        System.out.println("ENTER NO:");
        try
        {
            no=Integer.parseInt(br.readLine());
        }catch(Exception e){}
    }
    static void display()
    {
        System.out.println("NO:"+no);
    }
    public static void main(String[]args)
    {
        input();
        display();
    }
}
