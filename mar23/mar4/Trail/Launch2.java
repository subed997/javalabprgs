package mar23.mar4.Trail;
class Demo
{
    void disp()
    {
        System.out.println("Single method of a class");
    }
}
public class Launch2
{
    public static void main(String[] args)
    {
//     Demo d=new Demo();
//     d.disp();
        new Demo().disp(); // anonymous object creation(without creating an object of a class we can call its method ONLY if it contains one method in it)
    }
}
