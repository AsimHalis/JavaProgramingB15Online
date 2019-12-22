package Assignments;
import java.util.Scanner;
public class _103PrintTriangle {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (j = 1; j <= n; j++) {

            for (i = 1; i < j + 1; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
