package feb23.feb27;
interface  A1
{
    void show();
    default void config()
    {
        System.out.println("in config");
    }
    static void abc()
    {
        System.out.println("in abc");
    }
}
class B1 implements A1
{
    public void show()
    {
        System.out.println("in show");
    }
}
public class Java8Fe
{
    public static void main(String[] args)
    {
        A1.abc();
        A1 obj = new B1();
        obj.config();
        obj.show();
    }
}
