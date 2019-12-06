package day12;
import java.util.Scanner;
public class warmUp_SeasonFinder {
    public static void main(String[] args) {
        Scanner Season=new Scanner(System.in);
        System.out.println("Enter the Number");
        int month=Season.nextInt();
        if (month>12 || month<1) {
            System.out.println("Invalid month");
        }
            else if (month>=1 && month<=2) {
                System.out.println("It's winter");
            }
            else if (month>=3 && month<=5) {
                System.out.println("It's spring");
            }
            else if (month>=6 && month <=8) {
            System.out.println("It's summer");
        }
            else {
                System.out.println("It's fall");
            }

    }
}
