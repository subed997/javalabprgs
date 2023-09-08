package apr2023.apr17;


import java.util.Scanner;

public class prefixSum1basedCode
{
    static  int[][] sum;
    public static void numMatrix(int matrix[][])
    {
        int m = matrix.length; int n= matrix[0].length;
        sum= new int[m+1][n+1];// sum[i][j] is sum of all elements inside the rectangle [0,0,i,j]
        for (int i = 1; i <=m; i++)
        {
            for (int j = 1; j <=n; j++)
            {
                sum[i][j]= sum[i-1][j]+sum[i][j-1]-sum[i-1][j-1]+matrix[i-1][j-1];
            }
        }
    }
    public static int sumRegion(int r1,int c1,int c2,int r2)
    {
        r1++;c1++;r2++;c2++;// Since our `sum` starts by 1 so we need to increase r1, c1, r2, c2 by 1
        return sum[r2][c2]-sum[r2][c1-1]-sum[r1-1][c2]+sum[r1-1][c1-1];
    }
    public static void main(String[] args)
    {
        int m,n;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of rows : ");
        m = sc.nextInt();
        System.out.println("enter the number of column : ");
        n= sc.nextInt();
        int arr[][]=new int [m][n];
        int i,j;
        System.out.println("enter elements in matrix");
        for ( i = 0; i < m; i++)
        {
            for ( j = 0; j < n; j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int r1,c1,r2,c2;
        System.out.println("enter the value of r1 coordinate :");
        r1=sc.nextInt();
        System.out.println("enter the value of c1 coordinate :");
        c1=sc.nextInt();
        System.out.println("enter the value of r2 coordinate :");
        r2= sc.nextInt();
        System.out.println("enter the value of c2 coordinate :");
        c2=sc.nextInt();
        numMatrix(arr);
        System.out.println("The sum of the elements of given rectangle is : "+sumRegion(r1,c1,r2,c2));
    }

}
