package feb23.feb9;
class Student3
{
    private int age;
    private String name;
    public void setData()
    {
        age=18;
        name ="Navin";
    }
    public void show()
    {
        System.out.println(age+" "+name);
    }
}
public class Demo4
{
    public static void main(String[] args)
    {
        Student3 obj=new Student3();
        Student3 obj1= new Student3();
        obj.setData();
        //obj1.setData();
        obj.show();
        obj1.show();

    }
}
