import java.io.*;
import java.util.*;
public class Matrix1
{
    public static void main(String[]args)
    {
        int[][]x=null;//holds refernce to one-D array
        x=new int [3][];
        for(int i=0;i<3;i++)
        {
            x[i]=new int[3];    
        }
        BufferedReader br=null;
        int i=0,j=0;
        try
        {
            br=new BufferedReader(new InputStreamReader(System.in));

        }catch(Exception e){}
        System.out.println("MATRIX DATA:");
        while(i<3)
        {
            j=0;
            while(j<3)
            {
                System.out.println("x["+i+"]["+j+"]:");
                try
                {
                    x[i][j]=Integer.parseInt(br.readLine());
                }catch(Exception e)
                {
                    continue;
                }
                j++;

            }
            i++;
        }
        String str="MATRIX\n"+Arrays.toString(x[0])+"\n"+Arrays.toString(x[1])+"\n"+Arrays.toString(x[2]);
        System.out.println(str);
    }   

}