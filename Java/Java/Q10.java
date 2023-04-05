import java.util.Scanner;

/*Write a program that generates an exception, 
if the string inputted have more than 8 characters. */

public class Q10 {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Sting - > ");
        String Name = s.nextLine();

        s.close();

        try {
            if (Name.length() > 8) {
                throw new Exception("The Length Is More Then 8 Character");
            }

            else {
                System.out.println("This Is The String - >" + Name);
            }
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
