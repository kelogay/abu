/*Write a menu driven program for : 
1. Input a five digit number 
2. Display in reverse 
3. Display sum of digits
 */

import java.util.Scanner;

public class Q2 {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);

        int Choice;
        int Number = 0;

        do {
            System.out.println("--------------------------");
            System.out.println("1. Input a five digit number.");
            System.out.println("2. Display in reverse.");
            System.out.println("3. Display sum of digits.");
            System.out.println("4. Exit.");
            System.out.println("--------------------------");

            System.out.println("Enter Your Choice:");
            Choice = s.nextInt();

            switch (Choice) {
                case 1:
                    System.out.println("Input Number");
                    Number = s.nextInt();
                    s.nextLine();
                    if (Number < 10000 || Number > 99999) {
                        System.out.println("Enter A Valid Number");
                        Number = 0;
                    } else {
                        System.out.println("Number Input Successfully.");
                    }
                    break;
                case 2:

                    if (Number == 0) {
                        System.out.print("Please Enter A Number First.");
                    } else {
                        int reverseNumber = 0;

                        while (Number > 0) {
                            // reverseNumber = Number % 10;
                            reverseNumber = reverseNumber * 10 + Number % 10;
                            Number = Number / 10;
                        }
                        System.out.println("The Reverse Number Is: " + reverseNumber);
                    }
                    break;

                case 3:
                    if (Number == 0) {
                        System.out.print("Please Enter A Number First.");
                    } else {
                        int sum = 0;
                        while (Number > 0) {
                            sum = sum + Number % 10;
                            Number = Number / 10;
                        }
                        System.out.println("The Sum Of Digit Is: " + sum);
                    }
                case 4:
                    break;
            }

        } while (Choice != 4);
        s.close();
    }
}
