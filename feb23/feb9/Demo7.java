package feb23.feb9;
class Student6
{
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = "Ubaid";
    }

    public void show()
    {
        System.out.println(age+" "+name);
    }
}
public class Demo7
{
    public static void main(String[] args)
    {
        Student6 obj=new Student6();
        Student6 obj1 =new Student6();
        obj.setAge(18);
        obj1.setAge(25);
        obj.setName("Ubaid");
        obj1.setName("Yubaid");
       obj.show();;
       obj1.show();
    }
}
