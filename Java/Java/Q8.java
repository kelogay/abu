/*Write a program to accept a sentence and reverse every word from the sentence and display the sentence. */

import java.util.*;

public class Q8 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter The Sentence - >");
        String Sentence = s.nextLine();
        s.close();
        Sentence = "" + Sentence;
        int L = Sentence.length();

        for (int i = L - 1; i >= 0; i--) {
            System.out.print(Sentence.charAt(i));
        }

    }
}
