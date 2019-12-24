package day33;

import java.util.Scanner;

public class MethodReturnPractice {
    public static void main(String[] args) {
        System.out.println(built_Email("Asim","Halis"));
        String fullName="Asaf Eren";
        String part1=fullName.split(" ")[0];
        String part2=fullName.split(" ")[1];
        String email=built_Email(part1,part2);
        System.out.println(email);

        String fullName2="Selmin Deniz";
        String []fullNameSplit=fullName2.split(" ");
        String email2=built_Email(fullNameSplit[0],fullNameSplit[1]);
        System.out.println(email2);


    }
public static String built_Email(String firstName,String  lastName){

   return  firstName.charAt(0)+lastName+"@NightWatch.com";

}


}
