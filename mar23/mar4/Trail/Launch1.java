package mar23.mar4.Trail;
interface Calc
{
    void disp();
}
public class Launch1
{
    public static void main(String[] args)
    {
        Calc c= new Calc()
        {
            @Override
            public void disp()
            {
                System.out.println("Hello disp method");
            }
        };//anonymous invoke
        Calc cal=()-> System.out.println("Hello");
        cal.disp();
    }
}
