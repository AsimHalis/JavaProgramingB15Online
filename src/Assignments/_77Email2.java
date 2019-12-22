package Assignments;
import java.util.Scanner;
public class _77Email2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        int firstA = email.indexOf("@");
        int firstB = email.indexOf("_");
        int firstC =email.indexOf(".");
String name1=(email.substring(0,1)).toUpperCase();
String name2=(email.substring(firstB+1,firstB+2)).toUpperCase();
        System.out.println("First name: "+name1+email.substring(1,firstB));
        System.out.println("Last name: "+name2+email.substring(firstB + 2, firstA));
        System.out.println("Domain: "+email.substring(firstA + 1,firstC));
        System.out.println("Top-Level Domain: "+email.substring(firstC+1,email.length()));

    }
}
