package feb23.feb27;
interface Car2
{
    void drive();
}
public class LambdaDemo
{
    public static void main(String[] args)
    {
        Car2 obj=()-> System.out.println("Driving...");
        obj.drive();
    }
}
