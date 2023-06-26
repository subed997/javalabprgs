package feb23.feb20;

class Demo1
{
     int a,b;
     public Demo1()
     {
         System.out.println("Parent class constructor");
     }
     public Demo1(int x,int y)
     {
         System.out.println("Parent parameterized class constructor");
         a=x;
         b=y;

     }
}
class Demo2 extends Demo1
{
    int m,n;
    public Demo2()
    {
        this(10,20);
        System.out.println("Child class constructor");
    }
    public Demo2(int x ,int y)
    {
        //super
        System.out.println("Child parameterized class constructor");
        m=x;
        n=y;
    }

}
public class ConstructorExe
{
    public static void main(String[] args)
    {
        Demo2 d= new Demo2();
//        Demo2 d2=new Demo2(10,20);

    }
}
