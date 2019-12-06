package day18;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
public class SmartLockOpener {
    public static void main(String[] args) {
        //smart door lock has password
        //correct password is B15
        //KEEP ASKING UNTIL USER ENTER CORRECT ONE
        Scanner scan=new Scanner(System.in);
        System.out.println("KNOCK KNOCK!!");
        System.out.println("WHAT IS THE PASSWORD? ");
        String password=scan.next();
        while (!(password.equalsIgnoreCase("B15"))){
            System.out.println("WRONG PASSWORD!! TRY AGAIN!!");
            password=scan.next();
        }
        System.out.println("well come home");



    }
}
