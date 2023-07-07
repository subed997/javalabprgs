package mar23.mar6;
// try with resources
import java.util.Scanner;

public class ExceptionDemo5
{
    public static void main(String[] args)
    {
        int num =0;
        // try with resources
        try(Scanner sc = new Scanner(System.in))
        {
            num= sc.nextInt();
        }
        System.out.println(num);
    }
}
// DRY -DO NOT REPEAT YOURSELF