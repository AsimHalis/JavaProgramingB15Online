package day04;
import java.util.Scanner;
public class ScannerIntro {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your name please:");
        String Name=input.nextLine(); // if you write code like input.nextLine() you can inout more than 1 world!!!
        System.out.println("You have entered : " + Name);
        System.out.println("Enter your age please:");
        int age=input.nextInt();
        System.out.println("You have entered : " + age);

    }
}
