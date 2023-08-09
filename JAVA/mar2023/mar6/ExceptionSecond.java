package mar23.mar6;
//Runtime error or Exception
public class ExceptionSecond
{
    public static void main(String[] args)
    {
        int num1 = 6;
        int num2=0;
        int result = num1/num2;
        System.out.println(result);
        System.out.println("Bye");
    }
}
// OUTPUT:
// Exception in thread "main" java.lang.ArithmeticException: / by zero
