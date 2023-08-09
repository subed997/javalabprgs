package feb23.feb20;
abstract class Aeroplane3
{
   // abstract int age;
    abstract void takeOff();
    abstract void fly();
    public void landing()
    {
        System.out.println("Aeroplane is landing");
    }
}
class CargoPlane3 extends Aeroplane3
{
    public void takeOff()
    {
        System.out.println("CargoPlane requires long runway");
    }
    public void fly()
    {
        System.out.println("CargoPlane flies at lower height");
    }
    public void alert()
    {
        System.out.println("Alert...");
    }
}
class PassengerPlane3 extends Aeroplane3
{
    public void takeOff()
    {
        System.out.println("PassengerPlane  requires medium runway");
    }
    public void fly()
    {
        System.out.println("PassengerPlane flies at medium height");
    }
}
public class LaunchAbs
{
    public static void main(String[] args)
    {
        Aeroplane3 ref1 = new CargoPlane3();
        ref1.takeOff();
        ref1.fly();
        ref1.landing();
        ((CargoPlane3) ref1).alert();

        Aeroplane3 ref2 = new PassengerPlane3();
        ref2.takeOff();
        ref2.fly();
        ref2.landing();

        //Aeroplane3 ref = new Aeroplane3();
    }
}
