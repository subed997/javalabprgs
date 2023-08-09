public class printabcdefgh 
{

    public static void main(String[] args)
    {
        int n = 5;

        for(int i=0;i<n;i++)
        {
            //A
            for(int j=0;j<n;j++)
            {
                if(j==(n-1)/2  && i+j == (n-1)/2 || i==(n-1)/2 || j>=n-1 && i>0 || j==0 && i>0)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");
            //B
            for(int j=0;j<n;j++)
            {
                if(j==0 || i==0 && j<n-1 || i == (n-1)/2 || i==n-1 && j<n-1 || j==n-1 && i>0 && i<n-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");
            //C
            for(int j=0;j<n;j++)
            {
                if(j==0 && i>0 && i<n-1 || i==0 && j>0 ||i==n-1 && j>0 && j<=n-1 )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");
            //D
            for(int j=0;j<n;j++)
            {
                if(j==0 || i==0 && j<n-1 || i==n-1 && j<n-1 || j==n-1 && i>0 && i<n-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");
            //E
            for(int j=0;j<n;j++)
            {
                if(i==0 || i==(n-1)/2 || j==0 || i==n-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");
            //F
            for(int j=0;j<n;j++)
            {
                if(i==0 || i==(n-1)/2 || j==0)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");
            //G
            for(int j=0;j<n;j++)
            {
                if(i==0 && j>0 ||  j==0 && i>0 && i<n-1|| i==(n-1)/2 && j>(n-1)/2 || j==n-1 && i>(n-1)/2 || j==(n-1)/2 && i>(n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");
            //H
            for(int j=0;j<n;j++)
            {
                if(j==0 || i==(n-1)/2 || j==n-1 )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
   

