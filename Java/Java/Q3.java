/*Create a class employee which have data members like empno, emp name, city, salary. Write a menu driven program for:
    a. For inputting emp information 
	b. For displaying all emp information 
	c. For searching the emp who staying in Valsad. 
	d. For displaying all emp who have earned salary >=5000 
	e. Exit 
 */

import java.util.Scanner;

class Employee {
    private int empId;
    private String empName;
    private String empCity;
    private double empSalary;

    Employee(int empId, String empName, String empCity, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empCity = empCity;
        this.empSalary = empSalary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpCity() {
        return empCity;
    }

    public void setEmpCity(String empCity) {
        this.empCity = empCity;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(Double empSalary) {
        this.empSalary = empSalary;
    }

    public void Display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Employee City: " + empCity);
        System.out.println("Employee Salary: " + empSalary);
    }
}

public class Q3 {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);

        int Choice = 0;
        int numEmployee = 0;
        Employee[] e = new Employee[2];

        do {

            System.out.println("----------------------------");
            System.out.println("1. Input employee information");
            System.out.println("2. Display all employee information");
            System.out.println("3. Search employees in Valsad");
            System.out.println("4. Display employees with salary >= 5000");
            System.out.println("5. Exit");
            System.out.println("----------------------------");

            System.out.println("Enter Your Choice:");
            Choice = s.nextInt();

            switch (Choice) {
                case 1:
                    if (numEmployee < 2) {
                        System.out.println("Enter The Id: ");
                        int empId = s.nextInt();
                        s.nextLine();

                        System.out.println("Enter The Name: ");
                        String empName = s.nextLine();

                        System.out.println("Enter The City: ");
                        String empCity = s.nextLine();

                        System.out.println("Enter The Salary: ");
                        double empSalary = s.nextDouble();
                        s.nextLine();

                        e[numEmployee] = new Employee(empId, empName, empCity, empSalary);
                        numEmployee++;

                        System.out.println("Successfully Added.");
                    } else {
                        System.out.println("Cannot Add More Information");
                    }
                    break;

                case 2:
                    System.out.println("Employee Information.");
                    for (int i = 0; i < numEmployee; i++) {
                        e[i].Display();
                    }
                    break;

                case 3:
                    System.out.println("Employees in Valsad.");
                    for (int j = 0; j < numEmployee; j++) {
                        if (e[j].getEmpCity().equalsIgnoreCase("Valsad")) {
                            e[j].Display();
                        }
                    }
                    break;

                case 4:
                    System.out.println("employees with salary >= 5000");
                    for (int q = 0; q < numEmployee; q++) {
                        if (e[q].getEmpSalary() >= 5000) {
                            e[q].Display();
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting the Program.");
                    break;

            }
        } while (Choice != 5);

        s.close();
    }
}
