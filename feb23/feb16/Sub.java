package feb23.feb16;

import feb23.feb4.scanner;

import java.util.Scanner;

public class Sub {
    public static void main(String[] args)
    {
        // 2D REGULAR ARRAY
//        int ar[] = new int[5];
//        Scanner sc= new Scanner(System.in);
//        for (int i = 0; i < ar.length; i++)
//        {
//            System.out.println("Please enter the marks of Students");
//           ar[i]=sc.nextInt();
//        }
//        System.out.println("Marks of students  are below");
//
//        for (int i = 0; i < ar.length; i++)
//        {
//            System.out.print(ar[i]+" ");
//        }

        // 2D JAGGED ARRAY
            int [][] ar = new int[3][];
            ar[0] = new int[3];
            ar[1] = new int[2];
            ar[2] = new int[4];

            Scanner sc= new Scanner(System.in);

        for (int i = 0; i < ar.length; i++)
        {
            for (int j = 0; j < ar[i].length; j++)
            {
                System.out.println("Please enter marks of Class "+i+ " student "+j);
                ar[i][j]=sc.nextInt();
            }
        }

        System.out.println("Marks of students  are below");
        for (int i = 0; i < ar.length; i++)
        {
            for (int j = 0; j < ar[i].length; j++)
            {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }

    }
}
