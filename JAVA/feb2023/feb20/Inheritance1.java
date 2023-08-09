package feb23.feb20;
 class Human //Super class // Base class // Parent class
 {
     int age;
     void sleep()
     {
         age=18;
         System.out.println("Human needs Sleep");
         System.out.println(age);
     }
 }
 class Student extends Human   // Derived class //Child class // sub class
 {

 }
public class Inheritance1
{
    public static void main(String[] args)
    {
        Student st = new Student();
        st.sleep();
    }
}
