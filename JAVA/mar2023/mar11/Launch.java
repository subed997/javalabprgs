package mar23.mar11;

import java.util.Scanner;
class MyException extends  Exception
{

}
class Facebook
{
    String s1="syed ubedulla";
    int a= 123169;
    String s2;
    int b;

    public void input()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your username");
        s2=sc.nextLine();
        System.out.println("Enter your password");
        b=sc.nextInt();
    }
    public void validation() throws MyException {
        if ((s1.equalsIgnoreCase(s2)) && (a == b))
        {
            System.out.println("Welcome to your account");
        }
        else
        {
            MyException me = new MyException();
            throw me;
        }
    }
}
class FBCompany
{
    public void checking()
    {
        Facebook fb = new Facebook();
        fb.input();
        try {
            fb.validation();
        } catch (MyException e) {
            fb.input();
            try {
                fb.validation();
            } catch (MyException se) {
                fb.input();
                try {
                    fb.validation();
                } catch (MyException te) {
                    System.out.println("This is not your account bye....");
                }
            }

        }
    }
}
public class Launch
{
    public static void main(String[] args)
    {
       FBCompany fbc = new FBCompany();
       fbc.checking();
    }
}
