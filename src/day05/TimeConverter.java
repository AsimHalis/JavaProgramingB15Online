package day05;
import java.util.Scanner;
public class TimeConverter {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("How many hours you work in a day?");
        int hour=input.nextInt();
        int minutes = hour*60*7;
        System.out.println("You works = "+minutes +" minutes in weekly");
    }
}
