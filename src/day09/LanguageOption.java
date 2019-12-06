package day09;
import java.util.Scanner;
public class LanguageOption {
    public static void main(String[] args) {

        System.out.println("Welcome to Cybertek call center");
        System.out.println("Please enter your Language Option from 1-7");
        Scanner Language=new Scanner(System.in);
        int languageOption=Language.nextInt();
        String greeting="";
        if(languageOption==1){
            greeting="Hello";
        }
        else if(languageOption==2){
            greeting="Salam";
        }
        else if(languageOption==3){
            greeting="Hola";
        }
        else if(languageOption==4){
            greeting="Privet";
        }
        else if(languageOption==5){
            greeting="Merhaba";
        }
        else if(languageOption==6){
            greeting="Szia";
        }
       else if(languageOption==7){
            greeting="Bonjour";
        }
                  else {
            greeting = "Unknown";
        }
        //greeting = greeting + " , SDET";
        System.out.println(greeting+", SDET");


    }

}
