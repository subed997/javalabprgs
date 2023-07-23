package apr23.apr1;
import java.util.*;
class Student implements Comparable<Student>
{
    int marks;
    int age;
    String name;

    public Student(int marks, int age, String name)
    {
        this.marks = marks;
        this.age = age;
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public String toString()
    {
        return " "+ marks + " - " +age+ "-"+name;
    }
    public int compareTo(Student st)
    {
        if(this.age> st.age)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}
//class Alpha implements Comparator<Student>
//{
//    public int compare(Student a, Student b)
//    {
//        if(a.marks>b.marks)
//        {
//            return 1;
//        }
//        else
//        {
//            return -1;
//        }
//    }
//}
public class LaunchSorting
{
    public static void main(String[] args)
    {
        Student st1= new Student(45,18,"Rohan");
        Student st2= new Student(50,17,"Rohit");
        Student st3= new Student(25,22,"Ramesh");


//        Alpha a = new Alpha();

//        Comparator<Student> cm = (Student a, Student b)->
//            {
//                if(a.marks>b.marks)
//                {
//                    return 1;
//                }
//                else
//                {
//                    return -1;
//                }
//            };

        List<Student> list = new ArrayList<Student>();
        list.add(st1);
        list.add(st2);
        list.add(st3);


        //Collections.sort(list);
//        Collections.sort(list,cm);
        Collections.sort(list);
        System.out.println(list);
    }

}
