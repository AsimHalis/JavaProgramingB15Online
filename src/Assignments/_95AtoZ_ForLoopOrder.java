package Assignments;
import  java.util.Scanner;
public class _95AtoZ_ForLoopOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char start = scan.next().charAt(0);
        char end = scan.next().charAt(0);
        int star2 = start;
        int end2 = end;
        // System.out.println(star2);
        // System.out.println(end2);
        for (int i = star2; i <= end2; i++) {
            char as = start;
            System.out.println(start);
            ++start;
        }

        System.out.println("*********SECOND WAY********* ");
        char start3 = scan.next().charAt(0);
        char end3 = scan.next().charAt(0);
        for (char x = start3; x <= end3; x++) {
                 System.out.println(x);
        }
    }
}