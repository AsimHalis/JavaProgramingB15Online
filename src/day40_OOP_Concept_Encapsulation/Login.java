package day40_OOP_Concept_Encapsulation;

import java.util.Scanner;

public class Login {
    public boolean login(Account account){
        Scanner scn=new Scanner(System.in);

        System.out.println("User Name : ");
        String username=scn.nextLine();
        System.out.println("Password : ");
        String password=scn.nextLine();

        if (account.getUsername().equals(username)&&account.getPassword().equals(password)){
            return true;
        }else {
            return false;
        }


    }
}
