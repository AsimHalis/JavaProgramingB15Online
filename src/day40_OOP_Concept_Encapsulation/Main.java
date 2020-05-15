package day40_OOP_Concept_Encapsulation;

public class Main {
    public static void main(String[] args) {
        //OOP ATM Program
        //Login class: it will check the user login
        //Account Class:it will make Account transactions
        //ATM Class: Run the ATM

                ATM atm=new ATM();
                Account account=new Account("HalisCan","12345",20000);
                    atm.run(account);
        System.out.println("Exiting the Program...");


    }
}
