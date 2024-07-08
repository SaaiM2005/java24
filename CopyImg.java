
import java.io.*;

public class CopyImg {
    public static void main(String [] args)throws Exception
    {
        FileInputStream fis = new FileInputStream("Nature.jpeg");
        
        FileOutputStream fos = new FileOutputStream("MyImage.jpeg");
    
        int b =  0;
        while (true)
        {
            b = fis.read();
            
            if (b == -1)
                break;
        
            fos.write(b);
        }
        fis.close();
        fos.close();
    }
}