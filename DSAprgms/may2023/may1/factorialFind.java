package may2023.may1;

import java.util.Scanner;

public class factorialFind
{
    public static long factorialFinding(int n)
    {
        // function definition
        long result = n;
        // Base case condition
        if(n==0|| n==1)
        {
            return 1;
        }
        // Recursive calls
        else
        {
            result=result*factorialFinding(n-1);
        }
        return result;
    }
    public static void main(String[] args)
    {
      Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number whose factorial you want to find out: ");
        int n= sc.nextInt();
        // function calling
        long result= factorialFinding(n);
        System.out.println("Factorial of a given number entered by the user is: "+result);
    }
}
