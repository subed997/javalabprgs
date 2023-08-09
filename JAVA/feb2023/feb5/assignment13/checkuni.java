package feb23.feb5.assignment13;

// 7) Write a program to find if String contains all unique characters.
import java.util.Arrays;
public class checkuni
{
    boolean uniqueCh(String s)
    {
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        for (int i = 0; i < ch.length - 1; i++)
        {
            if (ch[i] != ch[i + 1])
                continue;
            else
                return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        checkuni obj = new checkuni();
        String s1 = "watemelloooon ";
        if (obj.uniqueCh(s1))
            System.out.println("The String " + s1 + " has all unique characters");
        else
            System.out.println("The String " + s1 + " has duplicate characters");
    }
}






