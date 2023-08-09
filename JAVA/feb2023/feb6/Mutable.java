package feb23.feb6;

//public class Mutable
//{
//    public static void main(String[] args)
//    {
//        StringBuffer sb = new StringBuffer("Virat");
//        System.out.println(sb);
//        StringBuffer sb="";//invalid
//        sb.append("kohli");
//        System.out.println(sb);
//        StringBuilder sb = new StringBuilder("Virat");
//        System.out.println(sb);
//        StringBuffer sb ="";invalid
//        sb.append("Kohli");
//        System.out.println(sb);
//        final int a=10;
//        a=20;
//        System.out.println(a);
//      StringBuffer sb = new StringBuffer("Virat");
//      sb.append("Kohli");
//      System.out.println(sb);
//      sb= new StringBuffer("Sachin");
//      System.out.println(sb);
//        StringBuilder sb=new StringBuilder();
//        System.out.println(sb.capacity());
//        sb.append("abcdefghijklmnop");
//        System.out.println(sb.capacity());
//        sb.append("s");
//        System.out.println(sb.capacity());//how many character you can add
//        System.out.println(sb.length());//how mancy character r present
//        StringBuffer sb2=new StringBuffer("Sachin");
//        System.out.println(sb2);
//        System.out.println(sb2.capacity());
//        System.out.println(sb2.charAt(1));
//        sb2.setCharAt(1, 'A'); //SAachin or SAchin
//        System.out.println(sb2);
//        StringBuilder sb=new StringBuilder(150);
//        System.out.println(sb.capacity());
//        sb.append("java");
//        System.out.println(sb);
//        sb.trimToSize();
//        System.out.println(sb.capacity());
//        StringBuilder sb=new StringBuilder("pwjava");
//        System.out.println(sb);
//        System.out.println(sb.reverse());
//        StringBuilder sb=new StringBuilder("PWSKILLS");
//        System.out.println(sb);
//        System.out.println(sb.reverse());
public class Mutable
{
    public static void main(String[] args)
    {
        String s1= "Think Twice";
        String s2= "";
        String sarr[]=s1.split(" ");
        for(String elem :sarr)
        {
            for(int i=elem.length()-1;i>=0;i--)
            {
                s2= s2+elem.charAt(i);
            }
            s2=s2+" ";
        }
        System.out.println("Before reversing : "+s1);
        System.out.println("After reversing : "+s2);
    }
}

