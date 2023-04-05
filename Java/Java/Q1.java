/*2. Write a program to find greatest number from 3 numbers. Use switch cases for following options : 
(1) Using nested if. (2) Using logical operators. (3) Without using above both.*/

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter The First Number: ");
        int a = s.nextInt();

        System.out.println("Enter The Second Number: ");
        int b = s.nextInt();
        s.nextLine();

        System.out.println("Enter The Third Number: ");
        int c = s.nextInt();
        s.nextLine();

        System.out.println("-----------------------------------------------");
        System.out.println("1. Nested If");
        System.out.println("2. Logical Operator");
        System.out.println("3. Without Both");
        System.out.println("4. Exit");
        System.out.println("-----------------------------------------------");

        System.out.println("Enter The Choice: ");
        int ch = s.nextInt();

        switch (ch) {
            case 1:
                if (a > b) {
                    System.out.println(+a + " Is Greater Number");
                } else if (b > c) {
                    System.out.println(+b + " Is Greater Number");
                } else {
                    System.out.println(+c + " Is Greater Number");
                }
                break;

            case 2:

                if (a > b && a > c) {
                    System.out.println(+a + " Is Greater Number");
                } else if (b > a && b > c) {
                    System.out.println(+b + " Is Greater Number");
                } else {
                    System.out.println(+c + " Is Greater Number");
                }
                break;

            case 3:
                int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
                System.out.println(+max + " Is Greater Number");
                break;

            case 4:
                break;
        }

        s.close();

    }
}
