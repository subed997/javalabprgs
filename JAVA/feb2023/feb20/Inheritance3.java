package feb23.feb20;
class Animal
{
    public void eat()
    {
        System.out.println("Animal east everyday");
    }
    public void age(int x)
    {
        System.out.println("Animal age is");
    }
}
class Tiger extends Animal
{
    public void eat()
    {
        System.out.println("Tiger hunts and eats");
    }
//    public int age(int x)
//    {
//        return 10;
//    }
    public void age(int x)
    {

    }
}
public class Inheritance3
{
    public static void main(String[] args)
    {
        Tiger t = new Tiger();
        t.eat();

    }
}
