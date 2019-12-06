package day12;

import jdk.swing.interop.SwingInterOpUtils;

public class ignoreCase {
    public static void main(String[] args) {
        String userName = "abc123";
        boolean userNameCorrect = userName.equals("ABC123");//false
        System.out.println(userNameCorrect);
        boolean userNameCorrect2 = userName.equalsIgnoreCase("ABC123");//true
        System.out.println(userNameCorrect2);
        System.out.println("******************");

        String name = "HalisCan";
        //Iwant to store the result of checking name into a variable
        boolean nameCorrect = name.equalsIgnoreCase("hAlisCAN");//TRUE
        System.out.println(nameCorrect);
        System.out.println(name.equalsIgnoreCase("hALiScAn"));//true
        System.out.println(name.equalsIgnoreCase("abc"));//false
    }
}