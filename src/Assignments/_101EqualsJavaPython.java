package Assignments;
import java.util.Scanner;
public class _101EqualsJavaPython {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        int countOfJava = 0;
        int countOfPython = 0;
        int lengthSentence = sentence.length();

        for (int x = 0; x < lengthSentence - 3; x++) {
           if (sentence.substring(x, x + 4).equals("java")) {
                System.out.println(sentence.substring(x, x + 4));
                ++countOfJava;
           }
        }
        System.out.println("count of java = " + countOfJava);
        System.out.println("**************");
        System.out.println(sentence.length());
        for (int y = 0; y < lengthSentence-5 ; y++) {
           if (sentence.substring(y, y + 6).equals("python")) {
                System.out.println(sentence.substring(y, y + 6));
                ++countOfPython;
            }
       }
        System.out.println("count of python = " + countOfPython);

        if (countOfJava == countOfPython) {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}