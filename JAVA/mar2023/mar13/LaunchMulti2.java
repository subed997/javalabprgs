package mar23.mar13;

public class LaunchMulti2
{
    public static void main(String[] args)
    {
        System.out.println("Main thread");
        System.out.println("Before changing");
        String name = Thread.currentThread().getName();
        System.out.println("Name of the main thread is "+name);
        System.out.println("Priority of main thread is "+Thread.currentThread().getPriority());

        Thread t= Thread.currentThread();
        t.setName("Pw");
        t.setPriority(1);

        System.out.println("After changing");
        String name1 = Thread.currentThread().getName();
        System.out.println("Name of the main thread is "+name1);
        System.out.println("Priority of main thread is "+Thread.currentThread().getPriority());
    }
}
