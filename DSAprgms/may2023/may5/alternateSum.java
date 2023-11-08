package may2023.may5;
//Alternate sign like 1-2+3-4+5-6 for 6
import java.util.Scanner;
public class alternateSum
{
    // function definition
    public static int sum(int n)
    {
        // base case condition
        if(n==0)
        {
            return 0;
        }
        // recursive function call
        // if num is even
        if(n%2==0)
        {
            return sum(n-1)-n;
        }
        // if num is odd
        else
        {
            return sum(n-1)+n;
        }
    }
    public static void main(String[] args)
    {
        int num=0;
        System.out.println("Enter element : ");
        Scanner sc = new Scanner(System.in);
        num= sc.nextInt();
        // function calling
        int result= sum(num);
        System.out.println("The alternate sign sum is:"+result);
    }
}
