//IMPLEMENTATION OF QUICK SORT
import mypkg.Util;
class QuickSort implements Runnable
{
    static int[]arr;
    int l,r;
    QuickSort()
    {
        arr=new int[10];
        l=0;
        r=9;
    }
    QuickSort(int l,int r)
    {
        this.l=l;
        this.r=r;
    }
    void input()
    {
        int i=0;
        while(i<arr.length)
        {
            arr[i]=Util.iInput("No");
            i++;
        }
    }
    synchronized void quick()
    {
        int k=0;
        if(l<r)
        {
            k=partition();
            Thread th1=new Thread(new QuickSort(l,k-1));
            th1.start();
            try
            {
                th1.join();
            }catch(Exception e){}
            Thread th2=new Thread(new QuickSort(k+1,r));
            th2.start();
            try
            {
                th2.join();
            }catch(Exception e){}
        }
    }
    void pivot()
    {
        if(arr[l]>arr[r])
        {
            int tmp=arr[l];
            arr[l]=arr[r];
            arr[r]=tmp;
        }
    }
    synchronized int partition()
    {
        pivot();
        int i=l,j=r+1,k=arr[l];
        do
        {
            do ++i;while(arr[i]<k);
            do --j;while(arr[j]>k);
            if(i<j)
            {
                int tmp=arr[i];
                arr[i]=arr[j];
                arr[j]=tmp;
            }
        }while(i<j);
        int tmp=arr[l];
        arr[l]=arr[j];
        arr[j]=tmp;
        return j;
    }
    void display()
    {
        String s="Data=\n";
        for(int i=0;i<10;i++)
        {
            s=s+arr[i]+" ";
            System.out.println(s);
        }
    }
    public void run()
    {
        quick();
    }
    public static void main(String[] args)
    {
        QuickSort a=new QuickSort();
        a.input();
        a.display();
        Thread th=new Thread(a);
        th.start();
        try
        {
            th.join();
        }catch(Exception e){}
        a.display();
    }
}
