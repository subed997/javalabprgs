package feb23.feb10;

class Demo
{
    private int a;
    private int b;

//    public Demo()
//    {
//
//    }
    public Demo()
    {
        System.out.println("Zero parameterized constructor bby programmer");
    }
    public Demo(int a, int b)
    {
        this.a =a;
        this.b=b;
    }
    void disp()
    {
        System.out.println(a);
        System.out.println(b);
    }
}
public class Launch2
{
    public static void main(String[] args) {
        Demo d= new Demo();
        d.disp();
        //d.add();

        Demo d2= new Demo(10,20);
        d2.disp();
    }
}
