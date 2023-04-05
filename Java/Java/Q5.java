/*16.Assume a class cricketer is declared. Declare a derived class batsman from cricketer. 
Data member of batsman – total runs, average runs and best performance. 
Member functions – input data, calculate average runs, display data*/

import java.util.*;

class Cricketer {

    String Name;
    int Age;
    String Country;

    public void InputData() {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter Your Name - > ");
        Name = s.nextLine();

        System.out.println("Enter Your Age - > ");
        Age = s.nextInt();
        s.nextLine();

        System.out.println("Enter Your Country - > ");
        Country = s.nextLine();
        s.close();
    }

    public void Display() {
        System.out.println("Name - > " + Name);
        System.out.println("Age - > " + Age);
        System.out.println("Country - > " + Country);
    }

}

class Batsman extends Cricketer {

    int Total_Runs;
    double Average_Runs;
    int Best_Performance;

    public void InputData() {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter The Total Runs - > ");
        Total_Runs = s.nextInt();
        s.nextLine();

        System.out.println("Enter The Best Performance - > ");
        Best_Performance = s.nextInt();
        s.nextLine();
        Average_Runs = Total_Runs / 5.0;

        s.close();
    }

    public void Display() {

        System.out.println("The Total Runs - > " + Total_Runs);
        System.out.println("The Average Runs - > " + Average_Runs);
        System.out.println("The Best Performance - > " + Best_Performance);
    }
}

public class Q5 {

    public static void main(String args[]) {
        Batsman b = new Batsman();

        b.InputData();
        b.Display();
    }

}
