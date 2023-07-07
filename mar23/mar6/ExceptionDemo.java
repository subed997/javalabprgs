package mar23.mar6;

public class ExceptionDemo
{
    public static void main(String[] args)
    {
        int num1 = 6; // normal statement
        int num2 =0; // normal statement
        int result = 0;// normal statement
        try
        {
            result = num1/num2;// critical statement
            System.out.println("in try block");
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong..."+e);
        }
        System.out.println(result);
        System.out.println("Bye");
    }
}
// OUTPUT: java.lang.ArithmeticException: / by zero
