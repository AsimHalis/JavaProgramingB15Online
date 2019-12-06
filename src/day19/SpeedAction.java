package day19;
import java.util.Scanner;
public class SpeedAction {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your Star speed");
        int start=scan.nextInt();
        System.out.println("Enter your End speed");
                int endSpeed=scan.nextInt();
        for (start=start; start<endSpeed ; start++) {
            System.out.println("Your Speed= " + start);

        }
    }
}
