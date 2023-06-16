package feb23.feb5.assignment13;
// 4) Write a program to count number of consonants, vowels and special characters in a string
public class consvowspe
{

    public static void main(String[] args)
    {
        String s1="This is my Email ubedulla997@gmail.com";
        int vowels=0,consonant=0,digit=0,specialChar=0;
        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
            {
                ch=Character.toLowerCase(ch);
                if(ch=='a' || ch=='e' || ch=='i'|| ch=='o' || ch=='u')
                    vowels++;
                else
                    consonant++;
            }
            else if(ch>='0'&& ch<='9')
            {
                digit++;
            }
            else
            {
                specialChar++;
            }
        }
        System.out.println("Vowels: "+vowels);
        System.out.println("Consonant: "+consonant);
        System.out.println("Digits: "+digit);
        System.out.println("SpecialChar: "+specialChar);
    }
}
