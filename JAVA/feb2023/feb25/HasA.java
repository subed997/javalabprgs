package feb23.feb25;
//class Car
//{
//    private Engine eng;
////    public Car(Engine eng)
////    {
////        this.eng=eng;
////    }
//    public void setEng(Engine eng)
//    {
//        this.eng=eng;
//    }
//    public void Start()
//    {
//        eng.engineStart();
//    }
//}
//class Engine
//{
//    public void engineStart()
//    {
//        System.out.println("Car Started");
//    }
//}
class Student
{
    private Heart h;
//    public Student(Heart h)
//    {
//        this.h=h;
//    }
    public void setH(Heart h)
    {
        this.h=h;
    }
    public void call()
    {
        h.heartBeat();
    }
}
class Heart
{
    public void heartBeat()
    {
        System.out.println("Heart is important");
    }
}
public class HasA
{
    public static void main(String[] args)
    {
        Heart h= new Heart();
        Student s= new Student();
        s.setH(h);
        s.call();
//        Engine e= new Engine();
//        Car c= new Car();   // Constructor Injection
//        c.setEng(e);
//        c.Start();
    }
}
