package may2023.may1;

import java.util.Scanner;

public class fibonacciFind
{
    public static int factorialFinding(int n)
    {
        int result = 0;
        // 1. Base case condition
        if(n<=1)
        {
            return n;
        }
        // 2. Recursive function call
        else
        {
            result = factorialFinding(n-1)+factorialFinding(n-2);
        }
        return result;
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the nth number in fibonacci series: ");
        int n = sc.nextInt();
        int result = factorialFinding(n);
        System.out.println("The result of nth fibonacci number is: "+result);
    }
}
