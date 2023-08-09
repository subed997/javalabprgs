package feb23.feb9;
class Student2
{
    private int age;
    private String name;
    public void setData()
    {
        age=18;
        name= "Ubaid";
    }
    public void show()
    {
        System.out.println(age+" "+name);
    }
}
public class Demo3
{
    public static void main(String[] args) {
        Student2 obj= new Student2();
        obj.setData();
        obj.show();
    }
}
