package day09;

import java.util.Scanner;

public class LanguageOptionWith_Switch {
    public static void main(String[] args) {

        System.out.println("Welcome to Cybertek call center");
        System.out.println("Please enter your Language Option from 1-7");
        Scanner Language = new Scanner(System.in);
        int languageOption = Language.nextInt();
        String greeting = "";
        switch(languageOption){
            case 1:
            greeting = "Hello";
            break;
            case 2:
            greeting = "Salam";
            break;
            case 3:
            greeting = "Hola";
            break;
            case 4:
            greeting = "Privet";
            break;
            case 5:
            greeting = "Merhaba";
            break;
            case 6:
            greeting = "Szia";
            break;
            case 7:
            greeting = "Bonjour";
            break;
            default:
            greeting = "Unknown";
        }
        //greeting = greeting + " , SDET";
        System.out.println(greeting + ", SDET");


    }
}