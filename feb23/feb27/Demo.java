package feb23.feb27;
interface A
{
    void show();
}
interface X
{
    void abc();
}
class B implements A,X
{
    public void show()
    {
        System.out.println("in show");
    }
    public void abc()
    {
        System.out.println("in abc");
    }
}
public class Demo
{
    public static void main(String[] args)
    {
        A Obj=new B();
        Obj.show();
        X Obj1 = new B();
        Obj1.abc();
    }
}
