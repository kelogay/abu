/*Write a program to accept a sentences using StringBuffer.Count total number of sentences,words and characters*/

public class Q9 {
    public static void main(String args[]) {
        StringBuffer s = new StringBuffer("Hello World.");

        int Count = 0;
        int word = 1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                Count++;
            }
            if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {
                word++;
            }
        }
        System.out.println("Total Character Are - > " + Count);
        System.out.println("Total Words Are - > " + word);
    }
}
