package day06;
import java.util.Scanner;
public class ScannerCapturingOneWord {
    public static void main(String[] args) {
        Scanner blabla = new Scanner(System.in);

        System.out.println("What is your First name ? and your age?");

        String name = blabla.next(); // it will only capture first word (separated by space)
        System.out.println("You have entered First name " + name);
        //String anotherWord = blabla.next();
        //System.out.println("What is your age? ");
        int age = blabla.nextInt();
        System.out.println("You have entered age " + age);
        //System.out.println("Another word is  " + anotherWord);



    }
}
