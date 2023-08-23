package apr2023.apr17.assignment;

import java.util.Scanner;

public class ass_2Dcode4
{
    public static void main(String[] args)
    {
        int m,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows");
        m= sc.nextInt();
        System.out.println("enter the columns");
        n= sc.nextInt();
        int arr[][] = new int[m][n];

        int i,j;
        System.out.println("Enter the elements in a matrix");
        for (i = 0; i < m; i++)
        {
            for (j = 0; j < n; j++)
            {
                arr[i][j]= sc.nextInt();
            }
        }
        int maximum = -100000008;
        for (i = 0; i < m; i++)
        {
            for (j = 0; j < n; j++)
            {
                if(maximum < arr[i][j])maximum = arr[i][j];
            }
        }
        System.out.println("The maximum element in this matrix is : " + maximum);
    }
}
