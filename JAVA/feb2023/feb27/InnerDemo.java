package feb23.feb27;
class A2
{
    public void show()
    {
        System.out.println("in show");
    }
    static class B2
    {
        public void display()
        {
            System.out.println("in display");
        }
    }

}
public class InnerDemo
{
    public static void main(String[] args)
    {
        A2 obj = new A2();
        obj.show();

        A2.B2 obj1 =new A2.B2();
        obj1.display();
    }
}
