package day06;
import java.util.Scanner;
public class ScannerCapturingMultipleWord {
    public static void main(String[] args) {
        // Task 4
        // use nextLine to ask your bio
        // whats your name
        // which city you live in , including state , Tyson, VA
        // What is your street address
        Scanner blabla=new Scanner(System.in);

        System.out.println("What is your name?");
        String name= blabla.nextLine();
        System.out.println("Your have entered: "+name);

        System.out.println("Which city and state you live in?");
        String cityAndState= blabla.nextLine();
        System.out.println("Your entered City and State: "+ cityAndState);

        System.out.println("What is your strees adress? ");
        String streetAddress= blabla.nextLine();
        System.out.println("Your street address: "+streetAddress);





    }
}
