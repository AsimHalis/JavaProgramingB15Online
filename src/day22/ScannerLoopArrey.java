package day22;
import java.util.Scanner;
public class ScannerLoopArrey {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int [] number=new int[5];
        for (int x = 0; x <number.length ; x++) {
            System.out.println("Enter your number "+(x+1));
            number [x]=scan.nextInt();
        }
        for (int x = 0; x <number.length ; x++) {
            System.out.print(number[x] + " ");
        }

    }
}
