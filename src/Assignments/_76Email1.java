package Assignments;
import java.util.Scanner;
public class _76Email1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        if (email.contains("_")) {
            int firstA = email.indexOf("@");
            int first_ = email.indexOf("_");

            System.out.print(email.substring(first_ + 1, firstA) +"_"+ email.substring(0, first_)+email.substring(firstA,email.length()));
        } else {
            System.out.println(email);
        }
    }
}
