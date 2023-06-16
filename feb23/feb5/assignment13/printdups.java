package feb23.feb5.assignment13;
// 2) Write a program to print Duplicates from the string
public class printdups
{
    public static void main(String[] args)
    {
        String str = "programing";
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            int idx = str.indexOf(ch, i + 1);
            if (idx != -1)
            {
                System.out.print(ch + " ");
            }
        }
    }
}