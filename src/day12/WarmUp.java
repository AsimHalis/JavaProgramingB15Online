package day12;
import  java.util.Scanner;
public class WarmUp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Weather=scan.next();
        if (Weather.equals("Sunny")) {
            System.out.println(Weather + " weather");
        }
         else if (Weather.equals("Rainy")) {
                System.out.println(Weather + " weather");
        }
        else if (Weather.equals("Cloudy")) {
            System.out.println(Weather + " weather");
        }
        else if (Weather.equals("Snowy")) {
            System.out.println(Weather + " weather");
        }

        else {
        System.out.println("Rain or shine just keep coding anyway");
        }
    }
}
