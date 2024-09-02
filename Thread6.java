class Shared {
    void table(int n) {
        System.out.println("Table");
        for (int i = 1; i <= 10; i++)
            System.out.println(" " + (n * i));
    }
}

class Sync extends Thread {
    Shared obj;
    int n;

    Sync(Shared obj, int no) {
        super();
        this.obj = obj;
        n = no;
        start();
    }

    public void run() {
        obj.table(n);
    }

}

public class Thread6 {
    public static void main(String[] args) {
        Shared s = new Shared();
        Sync a = new Sync(s, 5);
        Sync b = new Sync(s, 9);
        try {
            a.join();
            b.join();
        } catch (Exception e) {
        }
    }
}

/*
 * Synchronization of Threads :-
 * When two or more threads need access to a shared resource, they need some way to ensure that the resource will be used by only 
 * one thread at a time. The process by which this is achieved is called Synchronization.
 * 
 * Key to Synchronization is the concept of the monitor. A monitor is an object that is used as a mutually exclusive lock.
 * Only one Thread can own a monitor at given time. When a thread acquires a lock, it is said to have entered the Monitor.
 * All other Thread attempting to enter the locked Monitor will be suspended until first thread exits the Monitor.
 * These other thread are said to waiting for the Monitor. A thread that owns a Monitor can reenter the same monitor if it so desire.
 * We ca n
 * We can Synchronize our code in either two ways both involves the use of the Synchronized keyword.
 * 1) Using Synchronized methods.
 * 2) Using Synchronized Statement.
 * 
 * 1) Using Synchronized methods:-
 * Synchronization is easy in java because all objects have there own implicit monitor associated with them. To enter the objects
 * monitor just call a method that has been with the Synchronized keyword. While a thread is inside a Synchronized method, all other
 * thread that tried to call on the same instance have to wait. To Exit the monitor and relinquish control of object to the next 
 * waiting thread, the owner of the monitor simply return form the Synchronized method.
 * 
 * 
 * 
 */