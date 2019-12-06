package day09;
import java.util.Scanner;
public class EvenOddNumbers {
    public static void main(String[] args) {
        Scanner number=new Scanner(System.in);
        System.out.println("Enter your number");
        int num=number.nextInt();
        if(num%2==0){
            System.out.println("This is even number");
        }
        else{
            System.out.println("This is odd number");
        }

    }
}
