package day40_OOP_Concept_Encapsulation;

import java.util.Scanner;

public class ATM {
    public void run(Account account) {
        Login login = new Login();
        Scanner scn = new Scanner(System.in);
        System.out.println("Welcome to CanBank");
        System.out.println("**********************");

        int maxlogNumber = 3;
        while (true) {
            if (login.login(account)) {
                System.out.println("Login Successful...");
                break;
            } else {
                System.out.println("Wrong UserName or Password...");
                maxlogNumber--;
                System.out.println("Remaining Login :" + maxlogNumber);
            }
            if (maxlogNumber == 0) {
                System.out.println("Please Try later");
                return;
            }
        }
        System.out.println("**********************");
        String functions = "1.Balanca\n" + "2.Make a payment\n" + "3.WithDraw\n" + "q:Exit the system";
        System.out.println(functions);
        System.out.println("**********************");
        while (true) {
            System.out.println("Chose the one option");
            String option = scn.next();
            if (option.equals("q")) {
                break;

            } else if (option.equals("1")) {
                System.out.println("Your Balance :" + account.getBalance());

            } else if (option.equals("2")) {
                System.out.println("How much you want to Payment");
                int payment = scn.nextInt();
                account.makePayment(payment);


            } else if (option.equals("3")) {
                System.out.println("How much you want to Withdraw");
                int payment = scn.nextInt();
                account.witDraw(payment);

            } else {
                System.out.println("invalid option");
            }

        }
    }
}
