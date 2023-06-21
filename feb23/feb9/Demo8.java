package feb23.feb9;
class Student7
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
        this.name = "Navin";
    }
    public void show()
    {
        System.out.println(age+" "+name);
    }
}
public class Demo8
{
    public static void main(String[] args)
    {
        Student7 obj= new Student7();
        Student7 obj1= new Student7();
        obj.setAge(18);
        obj1.setAge(25);
        obj.setName("Navin");
        obj1.setName("Kiran");
        int stud1Age = obj.getAge();
        String stud1Name = obj.getName();
        System.out.println(stud1Age);

    }
}
