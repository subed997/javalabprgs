package mar23.mar6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo3
{
    public static void main(String[] args)
    {
        int num=0;
        Scanner sc= new Scanner(System.in);
        try
        {
            num= sc.nextInt();
        }
        catch(InputMismatchException e)
        {
            System.out.println("Please enter a number");
        }
        System.out.println(num);
    }
}
//Output 1:12
//        12
//Output 2:hi
//        Please enter a number
//        0
