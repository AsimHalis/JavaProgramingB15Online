package Assignments;
import java.util.Scanner;

public class _92Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
  long sumfact=1;
        for (int i = n; i >0; i--) {
            sumfact=sumfact*i;
        }   System.out.println(sumfact);
}
    }
