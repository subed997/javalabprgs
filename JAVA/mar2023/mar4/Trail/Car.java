package mar23.mar4.Trail;


public class Car
{
    class Engine
    {
        void disp()
        {
            System.out.println("Inner class disp");
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Main method Outer Class");
        // Engine e = new Engine(); CE(Compilation Error)
//        Car c= new Car();
//        Car.Engine e =c.new Engine();
//        e.disp();
        Car.Engine e = new Car().new Engine();
        e.disp();

        new Car().new Engine().disp(); // anonymous calling


    }
}
