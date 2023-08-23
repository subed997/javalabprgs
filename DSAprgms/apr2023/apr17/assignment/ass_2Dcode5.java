package apr2023.apr17.assignment;
//Time Complexity = O(m*n)
// SPace Complexity =O(1)
import java.util.Scanner;

public class ass_2Dcode5
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
        System.out.println("The elements  of the middle row and middle column are as follows : ");

        for(i = 0 ; i < m ; i++)System.out.print(arr[i][m/2] + "  ");
        for(j = 0 ; j < m ; j++){
            if(j == m/2)continue;
            System.out.print(arr[m/2][j] + " ");
            }
        }
    }

//output:The elements  of the middle row and middle column are as follows :
//        3  5  5  6  37  7 6 4 3