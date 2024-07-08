import java.util.*;
class KBD6
{
    public static void main(String[]args)
    {
        int[]x=null;
        x=new int [5];
        Scanner s=new Scanner(System.in);
        int i=0;
        while(i<x.length)
        {
            System.out.println("x["+i+"]:");
            x[i]=s.nextInt();
            i++;
        }
        System.out.println(Arrays.toString(x));
        Arrays.sort(x);
        System.out.println(Arrays.toString(x));
    }
}

//OUTPUT
/*x[0]:
5
x[1]:
6
x[2]:
7
x[3]:
8
x[4]:
3
[5, 6, 7, 8, 3]
[3, 5, 6, 7, 8] */