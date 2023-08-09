package feb23.feb27;
interface  Car1
{
    void drive();
}
public class AIC
{
    public static void main(String[] args)
    {
        Car1 obj= new Car1()
        {
            @Override
            public void drive()
            {
                System.out.println("Driving...");
            }
        };
        obj.drive();
    }
}
