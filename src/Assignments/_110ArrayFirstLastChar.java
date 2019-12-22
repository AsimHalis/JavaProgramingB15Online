package Assignments;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class _110ArrayFirstLastChar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};

        String last="";
        for (int i = 0; i < 5; i++) {
           last += words[i].substring(0, 1) + words[i].substring(words[i].length() - 1) + " ";
        }
        String[] arr = last.split(" ");
        System.out.print(Arrays.toString(arr));//[ai, dh, iw, l;, jf]
    }
}