//PROGRAM TO INPUT DATA FROM KEYBOARD
import java.util.*;//PACKAGE NAME
public class KBD1
{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);//in is byte stream class variable
        System.out.println("STRING:");
        String str=s.next();//WAITS FOR INPUT
        System.out.println(str);
    }
}