package feb23.feb14;


class Student
{
    private String name;
    private int age;

    public void setName (String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }

    public void setAge (int age)
    {
        this.age =age;
    }
    public int getAge()
    {
        return age;
    }
}
public class LaunchEncap
{
    public static void main(String[] args)
    {
        Student st = new Student();
        st.setAge(18);
        st.setName("Rahul");
        System.out.println(st.getAge());
        System.out.println(st.getName());

        Student st1 = new Student();
        st1.setAge(19);
        st1.setName("Rohit");
        System.out.println(st1.getAge());
        System.out.println(st1.getName());
    }
}
