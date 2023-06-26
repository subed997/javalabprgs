package feb23.feb20;
class Aeroplane2
{
    public void takeOff()
    {
        System.out.println("Aeroplane is taking off");
    }
    public void fly()
    {
        System.out.println("Aeroplane is flying");
    }

}
class CargoPlane2 extends Aeroplane2
{
    public void takeOff()
    {
        System.out.println("CargoPlane requires long runway");
    }
    public void fly()
    {
        System.out.println("CargoPlane flies at lower height");
    }
}
class PassengerPlane2 extends Aeroplane2
{
    public void takeOff()
    {
        System.out.println("PassengerPlane requires medium size runway");
    }
    public void fly()
    {
        System.out.println("PassengerPlane flies at medium height");
    }
}
class FighterPlane2 extends Aeroplane2
{
    public void takeOff()
    {
        System.out.println("FighterPlane requires small size runway");
    }
    public void fly()
    {
        System.out.println("FighterPlane flies at high height");
    }
}
class Airport
{
    public void poly(Aeroplane2 ref)
    {
        ref.takeOff();
        ref.fly();
        System.out.println("-------------------------------");
    }
}
public class LaunchPoly1
{
    public static void main(String[] args)
    {
        CargoPlane2 cp= new CargoPlane2();
        PassengerPlane2 pp = new PassengerPlane2();
        FighterPlane2 fp = new FighterPlane2();
        Airport a= new Airport();
        a.poly(cp);
        a.poly(pp);
        a.poly(fp);

//        cp.takeOff();
//        cp.fly();

//        pp.takeOff();
//        pp.fly();

//        fp.fly();
//        fp.fly();
    }
}
