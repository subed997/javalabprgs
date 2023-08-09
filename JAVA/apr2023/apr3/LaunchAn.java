package apr23.apr3;

//functional interface
@FunctionalInterface
interface Demo
{
    void disp();
//    void disp2();
}
//this is parent class
@Deprecated
class Plane
{
    public void planeFliesAtGoodHeight()
    {
        System.out.println("Plane is flying");
    }
}
//this is child class or subclass
class CargoPlane extends Plane
{
    //overriden method from parent class
    @Override
    public void planeFliesAtGoodHeight()
    {
        System.out.println("CargoPlane files low");
    }
}
public class LaunchAn
{
    public static void main(String[] args)
    {
        //object of child class
        Plane cp =new CargoPlane();
        cp.planeFliesAtGoodHeight();
    }
}
