package feb23.feb5.assignment13;

import java.util.Arrays;

// 5) Write a program to implement Anagram Checking with at least inbuilt methods being used.
public class checkana
{
    public static void main(String[] args)
    {
        String s1= "School Master".replace(" ","");
        String s2= "the Classroom".replace(" ","");
        char []ar1 = s1.toLowerCase().toCharArray();
        char []ar2 = s2.toLowerCase().toCharArray();
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        if(Arrays.equals(ar1,ar2))
        {
            System.out.println("It's an Anagram");
        }
        else
        {
            System.out.println("It's not an Anagram");
        }


    }
}
