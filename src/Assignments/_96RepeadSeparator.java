package Assignments;
import java.util.Scanner;
public class _96RepeadSeparator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input1 = scan.next();
        String input2 = scan.next();
        int input3 = scan.nextInt();

        for (int i = 0; i < input3-1; i++) {
            System.out.print(input1);

            for (int j = input3 - 2; j < input3 - 1; j++) {
                System.out.print(input2);
            }
        }
            for (int k = 0; k <1 ; k++) {
                System.out.print(input1);

            }

        }

    }
