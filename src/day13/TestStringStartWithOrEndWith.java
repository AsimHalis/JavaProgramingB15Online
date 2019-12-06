package day13;

import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;

public class TestStringStartWithOrEndWith {
    public static void main(String[] args) {
        String name="Asim";
        System.out.println(name.startsWith("As"));//true
        System.out.println(name.startsWith("as"));//false
        System.out.println(name.startsWith("MAC"));//false
        System.out.println(name.endsWith("im"));//true
        System.out.println(name.endsWith("a"));//false
        System.out.println(name.toUpperCase());//ASIM
        System.out.println(name.toLowerCase());//asim

    }
}
