package feb23.feb5;

public class Pangram
{
    public static void main(String[] args)
    {
        boolean flag = false;
        String s1 = "THE QUICK BROWN FOX JUMPS OVER LAZY DOG";
        s1= s1.replace(" ","");
        char ch[]= s1.toCharArray();

        int ar[]=new int[26];
        for(int i=0;i<ch.length;i++)
        {
            ar[ch[i]-65]++;
        }
        for (int i=0;i<ar.length;i++)
        {
            if(ar[i]==0)
            {
                System.out.println("It'snot pangram");
                flag= true;
            }
        }
        if(flag==false)
        {
            System.out.println("It's pangram");
        }
    }
}
