package mar23.mar6;
class MyException extends Exception
{
    public MyException()
    {

    }
    public MyException(String msg)
    {
        super(msg);
    }
}
public class ExceptionDemo9
{
    public static void main(String[] args)
    {
        int num1 =6;
        int num2 = -2;
        try
        {
            if(num2<0)
            {
                MyException e = new MyException("Negative Number");
                throw e;
            }
            else
            {
                int result = num1/ num2;
                System.out.println(result);
            }
        }
        catch(Exception e)
        {
            System.out.println("Enter a valid number "+e);
        }
    }
}
// OUTPUT: Enter a valid number mar23.mar6.MyException: Negative Number
