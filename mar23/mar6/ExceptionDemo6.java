package mar23.mar6;
//handling vs ducking
class Demo
{
    public void a()
    {
        System.out.println("in a");
        int value= 9;
        b();
    }
    public void b()
    {
        int num1=9;
        int num2 =0;
        try
        {
            int result = num1 /num2;
        }
        catch(Exception e)
        {
            System.out.println("Error"+ e.getMessage());
        }

    }
}
public class ExceptionDemo6
{
    public static void main(String[] args)
    {
        Demo obj= new Demo();
        obj.a();
    }
}
//OUTPUT:in a
//        Error/ by zero
