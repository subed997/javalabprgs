package mar23.mar13;

import java.util.Scanner;

public class LaunchMulti1
{
    public static void main(String[] args)
    {
        System.out.println("Calculation task started");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int num1 = sc.nextInt();
        System.out.println("Enter the 2nd number");
        int num2= sc.nextInt();
        int res = num1+num2;
        System.out.println(res);
        System.out.println("Calculation task ended");
        System.out.println("***********************************************");

        System.out.println("Printing * task started");
        for(int i=0;i<4;i++)
        {
            System.out.println("*");
        }
        System.out.println("Printing * task ended");
        System.out.println("***********************************************");

        System.out.println("Displaying important message  task started");
        for(int i=0;i<3;i++)
        {
            System.out.println("Focus is the important to master skills");
        }
        System.out.println("Displaying important message  task ended");
    }
}
