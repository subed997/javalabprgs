package feb23.feb9;
class Student1
{
    int age;
    String name;
    public void show()
    {
        System.out.println(age+ " "+name);
    }
}
public class Demo2
{
    public static void main(String[] args)
    {
        Student1 obj = new Student1();
        obj.age=18;
        obj.name="John";
        obj.show();
    }
}
