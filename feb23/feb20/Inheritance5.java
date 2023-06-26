package feb23.feb20;

class AeroPlane
{
    public void takeoff() // INHERITED
    {
        System.out.println("Aeroplane is taking off");
    }
    public void fly()
    {
        System.out.println("Aeroplane is flying");
    }
}
class CargoPlane extends AeroPlane
{
    public void fly() //OVER RIDDEN METHOD
    {
        System.out.println("CargoPlane flies at lower height");
    }
    public void carryGoods()// SPECIALISED METHOD
    {
        System.out.println("CargoPlane carries goods");
    }
}
class PassengerPlane extends AeroPlane
{
    public void fly() //OVER RIDDEN METHOD
    {
        System.out.println("PassengerPlane fies at minimum height");
    }
    public void carryPassenger() // SPECIALISED METHOD
    {
        System.out.println("PassengerPlane carries Passenger");
    }
}
public class Inheritance5
{
    public static void main(String[] args)
    {
        CargoPlane cp = new CargoPlane();
        cp.takeoff(); // CALLING INHERITED METHOD
        cp.fly(); //  CALLING OVER RIDDEN METHOD

        PassengerPlane pp =new PassengerPlane();
        pp.takeoff();  //CALLING INHERITED METHOD
        pp.fly(); // CALLING OVER RIDDEN METHOD
    }
}
