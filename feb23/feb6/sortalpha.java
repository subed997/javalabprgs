package feb23.feb6;

import java.util.Arrays;

public class sortalpha
{
    public static void main(String[] args)
    {
        String s1= "Computer Execution".toLowerCase();
        char []ar1 = s1.toCharArray();
        Arrays.sort(ar1);
        System.out.println(ar1);
    }
}
