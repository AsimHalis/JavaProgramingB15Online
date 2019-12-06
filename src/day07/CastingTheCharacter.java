package day07;

import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;

public class CastingTheCharacter {
    public static void main(String[] args) {
        char grade='B';
        System.out.println(grade);//B
        int letterInNumber='B';
        System.out.println(letterInNumber);//66
//======================
        char myFirstChar=100;
        System.out.println(myFirstChar);//d
        int letterA='a';
        System.out.println(letterA);//97
        System.out.println(letterA+1);//98
        System.out.println(""+letterA+1);//971
    }
}
