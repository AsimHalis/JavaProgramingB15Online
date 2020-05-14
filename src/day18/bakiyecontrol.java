package day18;

import java.util.Scanner;

public class bakiyecontrol {
    public static void main(String[] args) {
        String choseOne="1: Total Balance\n"+
                        "2: Withdraw \n"+
                        "3: Make Deposit \n"+
                         "Q: Quit the system";
        System.out.println(choseOne);
        System.out.println("*****************");
        Scanner scn=new Scanner(System.in);
        int balance=2000;
while(true){
    System.out.println("Please chose your operation  ");
    String operatin=scn.next();
    if (operatin.equalsIgnoreCase("q")){
        System.out.println("your operation has ended");
        break;
    }
    else if(operatin.equalsIgnoreCase("1")){
        System.out.println("Your Total balance is : "+ balance);

    }

    else if(operatin.equalsIgnoreCase("2")){
        System.out.println("please enter your withdraw amount:");
        int amount=scn.nextInt();

        if(amount>balance){
            System.out.println("your amount is greader than your balance. YOUR Balanca:"+balance);
        }
        else{
            balance= balance-amount;
            System.out.println("your new balance : " + balance);
        }
    }
    else if(operatin.equalsIgnoreCase("3")){
        System.out.println("please enter your payment amount:");
        int amount=scn.nextInt();

            balance= balance+amount;
            System.out.println("your new balance : " + balance);
        }
    else{
        System.out.println("invalid operation");
       }


    }

}

    }

