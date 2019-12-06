package day05;
import javax.net.ssl.HandshakeCompletedListener;
import java.util.Scanner;
public class TheScannerWay {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("What is your name:");
        String name=input.nextLine();
        System.out.println("Your Name is "+name);
        System.out.println("What is your Birth year:");
        int birthYear=input.nextInt();
        int age=2019-birthYear;
        System.out.println("Your age is:"+age);
        System.out.println("What is your height?");
        double height=input.nextDouble();
        System.out.println("your height is: "+height);

    }
}
