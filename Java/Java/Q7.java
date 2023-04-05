/*Write a program that create a class which has attributes like length and breadth. This helps to calculate the area of rectangle and square. 
Another class has methods to calculate area of triangle and circle. Write a program for the above mention situation. */

import java.util.*;

class Rectangle {
    private double L;
    private double B;

    public Rectangle(double L, double B) {
        this.L = L;
        this.B = B;
    }

    public double Method() {
        return L * B;
    }
}

class Square {
    private double S;

    public Square(double S) {
        this.S = S;
    }

    public double method() {
        return S * S;
    }
}

class Triangle {
    private double Base;
    private double Height;

    public Triangle(double Base, double Height) {
        this.Base = Base;
        this.Height = Height;
    }

    public double method() {
        return 0.5 * Base * Height;
    }
}

class Circle {
    private double Radius;
    private final double Pi = 3.14;

    public Circle(double Radius) {
        this.Radius = Radius;
    }

    public double method() {
        return Pi * Radius * Radius;
    }
}

public class Q7 {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter The Length - > ");
        double L = s.nextDouble();

        System.out.println("Enter The Breath - > ");
        double B = s.nextDouble();

        Rectangle r = new Rectangle(L, B);
        System.out.println("The Area of Rectangle is  - > " + r.Method());
        s.close();
        /*----------------------------------------------------------------- */
        Scanner ss = new Scanner(System.in);

        System.out.println("Enter The Sides - > ");
        double S = ss.nextDouble();

        Square sq = new Square(S);
        System.out.println("The Area of Square is  - > " + sq.method());
        ss.close();
        /*----------------------------------------------------------------- */
        Scanner sss = new Scanner(System.in);

        System.out.println("Enter The Base - > ");
        double Ba = sss.nextDouble();

        System.out.println("Enter The height - > ");
        double He = sss.nextDouble();

        Triangle t = new Triangle(Ba, He);
        System.out.println("The Area of Triangle is  - > " + t.method());
        sss.close();
        /*----------------------------------------------------------------- */
        Scanner ssss = new Scanner(System.in);

        System.out.println("Enter The Radius - > ");
        double R = ssss.nextDouble();

        Circle c = new Circle(R);
        System.out.println("The Area of Circle is  - > " + c.method());
        ssss.close();
    }
}
