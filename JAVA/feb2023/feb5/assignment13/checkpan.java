package feb23.feb5.assignment13;
//6) Write a program to implement Pangram Checking with at least inbuilt methods being used.
public class checkpan
{
    public static void main(String[] args)
    {
        boolean flag = true;
        String s1 = "THE QUICK BROWN FOX JUMPS OVER LAZY DOG".replace(" ","");
        for(char ch='A';ch<='Z';ch++)
        {
            if(!s1.contains(String.valueOf(ch)))
            {
                flag=false;
                break;
            }
        }
        if(flag==true)
    {
        System.out.println("It's pangram");
    }
        else
        {
            System.out.println("it's not pangram");
        }
    }

}
