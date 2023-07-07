package mar23.mar6;
//finally
import java.util.Scanner;
public class ExceptionDemo4
{
    public static void main(String[] args)
    {
        int num =0;
        Scanner sc =new Scanner(System.in);
        try
        {
            num= sc.nextInt();
        }
        finally
        {
            sc.close();
            System.out.println("Resource closed");
        }
        System.out.println(num);
    }
}
//output 1:15
//        Resource closed
//        15
//output 2:hi
//Resource closed
//Exception in thread "main" java.util.InputMismatchException