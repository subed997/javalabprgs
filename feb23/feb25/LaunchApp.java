package feb23.feb25;

import java.util.Scanner;

class Rectangle
{
    float length;
    float breadth;
    float area;

    public void input()
    {
        System.out.println("Calculation of Rectangle app");
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter the length of the Rectangle");
        length = scan.nextFloat();
        System.out.println("Please enter the breadth of the Rectangle ");
        breadth = scan.nextFloat();
    }
    public void compute()
    {
        area= length * breadth;
    }
    public void disp()
    {
        System.out.println("The area of the Rectangle is :" +area);
    }
}
class Square
{
    float length;
    float area;

    public void input()
    {
        System.out.println("The Calculation of Square");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the length :");
        length = scan.nextFloat();
    }
    public void compute()
    {
        area= length*length;
    }
    public void disp()
    {
        System.out.println("The area of the Square :"+area);
    }
}
class Circle
{
    float radius;
    float area;
     public void input()
     {
         System.out.println("The calculation of area ofd Circle :");
         Scanner scan = new Scanner(System.in);
         System.out.println("Please enter the radius");
         radius = scan.nextFloat();
     }
     public void compute()
     {
         area = 3.14f * radius * radius;
     }
     public void disp()
     {
         System.out.println("The area of the circle is :"+area);
     }
}
public class LaunchApp
{
    public static void main(String[] args)
    {
        Rectangle  rec = new Rectangle();
        rec.input();
        rec.compute();
        rec.disp();

        Square sq= new Square();
        sq.input();
        sq.compute();
        sq.disp();

        Circle c= new Circle();
        c.input();
        c.compute();
        c.disp(); 
    }
}
