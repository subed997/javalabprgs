package mar23.mar6;
//handling vs ducking
class Demo1
{
    public void a() throws Exception
    {
        System.out.println("in a");
        int value = 9;
        b();
    }
    public void b() throws Exception
    {
        int num1 = 9;
        int num2 = 0;
        int result =num1/num2;
        System.out.println(result);
    }
}
public class ExceptionDemo7
{
    public static void main(String[] args)
    {
        Demo1 obj = new Demo1();
        try
        {
            obj.a();
        }
        catch (Exception e)
        {
            System.out.println("Error");
        }
    }
}
//OUTPUT:in a
//        Error
