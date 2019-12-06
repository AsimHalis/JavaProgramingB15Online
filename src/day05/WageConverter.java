package day05;
import java.util.Scanner;
public class WageConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many hours you work in a day?");
        int hour = input.nextInt();
        System.out.println("How much your hourly wage?");
        int range = input.nextInt();
        int salary = hour * range * 5 * 54;
        System.out.println("your salary =" + salary);
    }
}