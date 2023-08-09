package mar23.mar6;

public class ExceptionDemo1
{
    public static void main(String[] args)
    {
        int num1 = 6;
        int num2 =0;
        int result = 0;
        int values[]={4,2,7,9};
        try
        {
            result= num1/num2;
            System.out.println(values[7]);
        }
        catch (Exception e)
        {
            System.out.println("You can't divide the number by zero..."+e);
        }
        System.out.println(result);
        System.out.println("Bye");

    }
}
//OUTPUT:You can't divide the number by zero...java.lang.ArithmeticException: / by zero
//        0
//        Bye
