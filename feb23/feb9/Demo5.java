package feb23.feb9;
class Student4
{
    private int age;
    private String name;
    public void setData()
    {
        age= 18;
        name="ubaid";
    }
    public void show()
    {
        System.out.println(age+" "+name);
    }
}
public class Demo5
{
    public static void main(String[] args)
    {
        Student4 obj = new Student4();
        Student4 obj1 = new Student4();
        obj.setData();
        obj1.setData();
        obj.show();
        obj1.show();
    }
}
