import java.util.*;
class KBD7
{
    public static void main(String[]args)
    {
        int i=1,val=0,uc=0,lc=0,dc=0,oc=0;
        while(i<=10)
        {
            System.out.println("TYPE CHARACTER:");
            try
            {
                val=System.in.read();// System is class,'in' here is static field of Input stream ,'read'is method of Input stream
                 System.in.skip(5);  //It STOPS THE BUFFER
            }
            catch(Exception e){}
            if(val>=65 && val<=90)
            {
                uc++;
            }
            else
            {
                if(val>=97 && val<=122)
                {
                    lc++;
                }
                else{
                    if(val>=48 && val<=57)
                    {
                        dc++;
                    }
                    else
                    {
                        oc++;
                    }
                }
                
            }
            i++;
        }
        System.out.println("UPPER:"+uc+"\nLOWER:"+lc+"\nDIGIT:"+dc+"\nOTHER:"+oc);
    }
}