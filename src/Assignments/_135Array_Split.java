package Assignments;
import java.util.*;
public class _135Array_Split {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        String[] newStr = sentence.split(" ");
        System.out.println(sentence);
        System.out.println(sentence.length());
        System.out.println(Arrays.toString(newStr));
        for (int i = 0; i <newStr.length ; i++) {
            System.out.println(newStr[i]);
        }

    }
}

