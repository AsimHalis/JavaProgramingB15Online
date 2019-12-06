package day18;
import java.util.Scanner;
public class GiveMe5$10$ {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Give me 5 or 10!!");
        int x=scan.nextInt();
       while( !(x==5 || x==10) ){
            System.out.println("Not the bill I am Looking For");
            System.out.println("Please Give me 5$ or 10$");
            x=scan.nextInt();
        }
        System.out.println("The Happy Ending!! Got the money");


    }
}
