//BINARY, OCTAL,HEXADECIMAL STRINGS OF ANY RANDOM NUMBER
public class App8
{
    public static void main(String[]args)
    {
        int n=(int)(Math.random()*100);
        System.out.println("No:"+n);
        
        String str=Integer.toBinaryString(n);//BINARY
        System.out.println("BINARY STRING:"+str);
        
        str=Integer.toOctalString(n);//OCTAL
        System.out.println("OCTAL STRING:"+str);

        str=Integer.toHexString(n);//HEXA
        System.out.println("HEX STRING:"+str);

        str=Integer.toString(n);//TO STRING AGAIN
        System.out.println("STRING:"+str);
    }
}
