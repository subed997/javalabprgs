package feb23.feb27;
@FunctionalInterface
interface Car
{
    void drive(int avg,int topSpeed);
}
public class AnnoyDemo
{
    public static void main(String[] args)
    {
        Car Obj =(avg, topSpeed) -> System.out.println("Running with average speed : "+avg+" topSpeed is : "+topSpeed);
        Obj.drive(40,140);
    }
}
