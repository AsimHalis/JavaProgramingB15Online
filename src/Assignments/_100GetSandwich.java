package Assignments;
import java.util.Scanner;
public class _100GetSandwich {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        if (str.indexOf("bread") != str.lastIndexOf("bread")) {
            System.out.println(str.substring(str.indexOf("bread") + 5, str.lastIndexOf("bread")));
        }
        System.out.println("nothing");



        System.out.println("*******2 way******");
        String between = "nothing";

        if (str.indexOf("bread") != str.lastIndexOf("bread")) {

            between = (str.substring(str.indexOf("bread") + 5, str.lastIndexOf("bread")));
        }
        System.out.println(between);
    }
}