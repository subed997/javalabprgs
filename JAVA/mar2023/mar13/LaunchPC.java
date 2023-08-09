package mar23.mar13;
class Queue
{
    int x;
    boolean valueInX=false;
    synchronized void put(int j)
    {
        try
        {
            if(valueInX)
            {
                wait();
            }
            else
            {
                x=j;
                System.out.println("I Produced value x "+x);
                valueInX=true;
                notify();

            }
        }
        catch (Exception e)
        {
            System.out.println("Some Problem");
        }
    }
    synchronized void get()
    {
        try
        {
            if(!valueInX)
            {
                wait();
            }
            else
            {
                System.out.println("I Consumed value x"+x);
                valueInX=false;
                notify();
            }
        }
        catch (Exception e)
        {
            System.out.println("Some Problem");
        }
    }

}
class Producer extends Thread
{
    Queue q;
    Producer(Queue b)
    {
        q=b;
    }
    public void run()
    {
        int i=1;
        while(true)
        {
            q.put(i++);
        }

    }

}
class Consumer extends Thread
{
    Queue q;
    Consumer(Queue a)
    {
        q=a;
    }
    public void run()
    {
        while(true)
        {
            q.get();
        }
    }
}
public class LaunchPC
{
    public static void main(String[] args)
    {
        Queue q= new Queue();
        Producer p = new Producer(q);
        Consumer c= new Consumer(q);
        p.start();
        c.start();

    }
}
