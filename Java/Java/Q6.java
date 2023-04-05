/*Write a program to create a class having members name and age. 
Derive a class student having percentage. Derive another class teacher having member salary. 
Write a necessary function to initialize read and write data. Use concept of super keyword. */

import java.util.Scanner;

class School {

    String Name;
    int Age;

    School(String Name1, int Age1) {
        Name = Name1;
        Age = Age1;
    }
}

class Student extends School {
    double Percentage;

    Student(String Name1, int Age1, double Percentage1) {
        super(Name1, Age1);

        Percentage = Percentage1;
    }

    public void Display() {
        System.out.println("Name Of The Student Is - > " + Name);
        System.out.println("Age Of The Student Is - > " + Age);
        System.out.println("Percentage Of The Student Is - > " + Percentage);
    }
}

class Teacher extends School {

    int Salary;

    Teacher(String Name1, int Age1, int Salary1) {
        super(Name1, Age1);
        Salary = Salary1;

    }

    public void Display() {
        System.out.println("Name Of The Teacher Is - > " + Name);
        System.out.println("Age Of The Teacher Is - > " + Age);
        System.out.println("Salary Of The Teacher Is - > " + Salary);
    }
}

public class Q6 {
    public static void main(String args[]) {

        Student su;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter Student Name - >");
        String name1 = s.nextLine();

        System.out.println("Enter Student Age - >");
        int age1 = s.nextInt();
        s.nextLine();

        System.out.println("Enter Student Percentage - >");
        double Percentage1 = s.nextDouble();
        s.nextLine();

        su = new Student(name1, age1, Percentage1);
        su.Display();
        s.close();

        Teacher tu;

        Scanner t = new Scanner(System.in);

        System.out.println("Enter Teacher Name - >");
        String name = t.nextLine();

        System.out.println("Enter Teacher Age - >");
        int age = t.nextInt();
        t.nextLine();

        System.out.println("Enter Teacher Salary - >");
        int Salary = t.nextInt();
        t.nextLine();

        tu = new Teacher(name, age, Salary);
        tu.Display();

        t.close();
    }
}
