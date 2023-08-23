package apr2023.apr17.assignment;
//Time Complexity = O(m*n)
// SPace Complexity =O(1)
import java.util.Scanner;

public class ass_2Dcode2
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
        System.out.println("Elements above secondary diagonals are as follows : ");
        for (i = 0; i < m; i++)
        {
            for (j = 0; j < n; j++)
            {
                if(i+j<m-1)
                    System.out.print(arr[i][j]+" ");
            }
        }
    }
}
