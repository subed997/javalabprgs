package feb23.feb9;
// Shadowing Problem
class Student5
{
    private int age;
    private String name;
    public void setData1(int a)
    {
        age=a;
    }
    public void setData2()
    {
        name ="Ubaid";
    }
    public void show()
    {
        System.out.println(age+" "+name);
    }
}
public class Demo6
{
    public static void main(String[] args)
    {
        Student5 obj= new Student5();
        Student5 obj1 = new Student5();
        obj.setData1(18);
        obj1.setData1(25);
        obj.show();
        obj1.show();
    }
}
