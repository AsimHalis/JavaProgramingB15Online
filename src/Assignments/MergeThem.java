package Assignments;
import java.util.Scanner;
public class MergeThem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        int lastCharIndex = word1.length() - 1;
        if (word1.length()==3&&word2.length()==3) {
            for (int x = 0; x < 3; ++x) {
                System.out.print(word1.charAt(x));
                System.out.print(word2.charAt(x));
            }
        } else {
            System.out.println("cannot merge");
        }

    }
}