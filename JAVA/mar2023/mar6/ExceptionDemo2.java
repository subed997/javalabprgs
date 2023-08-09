package mar23.mar6;

public class ExceptionDemo2
{
    public static void main(String[] args)
    {
        int num1 = 6;
        int num2 =2;
        int result = 0;
        int values[] = {4,7,2,9};
        String name = null;
        try
        {
            result =num1/num2;
            System.out.println(values[0]);
            System.out.println(name.length());
        }
        catch (ArithmeticException e)
        {
            System.out.println("Can't divide a number by zero");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("stay in your limit");
        }
        catch (Exception e)
        {
            System.out.println("Something went wrong");
        }
        System.out.println(result);
        System.out.println("Bye");
    }
}
