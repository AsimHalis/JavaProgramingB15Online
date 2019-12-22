package Assignments;
import java.util.Arrays;
import  java.util.Scanner;
public class _120ArrayMaxLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inputr = new Scanner(System.in);
        String[] words = new String[5];

        for (int i = 0; i < 5; i++) {
            words[i] = inputr.nextLine();
        }
        int maxlengt = words[0].length();
        String maxWorld=words[0];
        for (int i = 0; i <5   ; i++) {
            if (maxlengt < words[i].length()) {
                maxlengt = words[i].length();
                maxWorld=words[i];
            }
        }
        System.out.println(maxlengt);
        System.out.println(maxWorld);
    }
}