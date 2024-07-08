import java.io.*;
class RChar {
   public static void main(String[] args)throws Exception
    {
        File f=new File("abc.txt");
        if(f.exists()==false)
        {
            System.out.println("FILE NOT FOUND");
            return ;
        }
        FileReader fr=new FileReader(f);//here u can provide file name or file class object
        int val=0;
        while (true) 
        {
            val=fr.read();
            if(val==-1)
            {
                break;
            }    
            System.out.print((char)val);
        }    
        fr.close();
    } 
}
