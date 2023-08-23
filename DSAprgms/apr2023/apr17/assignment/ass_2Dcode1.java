package apr2023.apr17.assignment;

import java.util.Scanner;
//Time Complexity = O(m*n)
// SPace Complexity =O(1)
public class ass_2Dcode1
{
    public static void main(String[] args)
    {
        int m,n;
        Scanner  sc = new Scanner(System.in);
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
        int positive =0,negative =0,zero=0,odd=0,even=0;
        for ( i = 0; i < m; i++)
        {
            for (j = 0; j < n; j++)
            {
                if(arr[i][j]>0 || arr[i][j]==0)positive++;
                if(arr[i][j]<0)negative++;
                if(arr[i][j]==0)zero++;
                if((arr[i][j]%2)==0)even++;
                if((arr[i][j]%2)!=0)odd++;
            }
        }
        System.out.println("Number of positives = " + positive);
        System.out.println("Number of negatives = " + negative);
        System.out.println("Number of odds = " + odd);
        System.out.println("Number of evens = " + even);
        System.out.println("Number of zeroes = " + zero);
    }
}
//output:
//        Number of positives = 7
//        Number of negatives = 5
//        Number of odds = 4
//        Number of evens = 8
//        Number of zeroes = 3