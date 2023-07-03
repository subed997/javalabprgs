package feb23.feb27;
interface Computer
{
    void compileCode();
    default void config()
    {

    }
}
class Laptop implements Computer
{
    public void compileCode()
    {
        System.out.println("You got 5 errors");
    }
}
class Desktop implements Computer
{
    public void compileCode()
    {
        System.out.println("You got 5 errors,faster");
    }
}
class Developer
{
    public void buildApp(Computer obj)
    {
        System.out.println("Building app");
    }
}
public class Main
{
    public static void main(String[] args)
    {
       // Laptop obj= new Laptop();
        Computer obj= new Desktop();
        obj.compileCode();
        Developer dev = new Developer();
        dev.buildApp(obj);


    }
}
