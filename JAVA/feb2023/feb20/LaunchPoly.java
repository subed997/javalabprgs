package feb23.feb20;
class AeroPlane1
{
    public void takeOff()
    {
        System.out.println("Aeroplane is taking Off");
    }
    public void fly()
    {
        System.out.println("Aeroplane is flying");
    }
}
class CargoPlane1 extends AeroPlane1
{
    public void takeOff()
    {
        System.out.println("CargoPlane requires longer runway");
    }
    public void fly()
    {
        System.out.println("CargoPlane flies at lower height");
    }
}
class PassengerPlane1 extends AeroPlane1
{
    public void takeOff()
    {
        System.out.println("PassengerPlane requires medium runway");
    }
    public void fly()
    {
        System.out.println("PassengerPlane flies at medium height");
    }
}
public class LaunchPoly
{
    public static void main(String[] args)
    {
        CargoPlane1 cp =new CargoPlane1();
        PassengerPlane1 pp= new PassengerPlane1();

        AeroPlane1 ref;
        ref=cp;

        ref.takeOff();
        ref.fly();

        System.out.println("--------------------------------------------");
        ref=pp;

        ref.takeOff();
        ref.fly();
        //pp=cp
    }
}
