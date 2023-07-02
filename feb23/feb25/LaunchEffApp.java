package feb23.feb25;

import java.util.Scanner;

abstract class Shape
{
    float area;
    abstract public void input();
    abstract public void compute();
    public void disp()
    {
        System.out.println("The area is : "+area);
    }
}
class Rectangle1 extends Shape
{
    float length;
    float breadth;
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

}
class Square1 extends Shape
{
    float length;
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

}
class Circle1 extends Shape
{
    float radius;
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
}
class Geometry
{
    public void poly(Shape ref)
    {
        ref.input();
        ref.compute();
        ref.disp();
    }
}

public class LaunchEffApp
{
    public static void main(String[] args)
    {
        Rectangle1 rec = new Rectangle1();
        Square1 sq = new Square1();
        Circle1 c = new Circle1();
        Geometry g = new Geometry();
        g.poly(rec);
        g.poly(sq);
        g.poly(c);
    }

}
