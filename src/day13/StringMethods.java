package day13;

import jdk.swing.interop.SwingInterOpUtils;

public class StringMethods {
    public static void main(String[] args) {
        //String actions that we already know so far
        //equals
        String s1 = "Hello";
        System.out.println(s1.equals("abc"));//FALSE
        System.out.println(s1.equalsIgnoreCase("HELLO"));//TRUE
        System.out.println(s1);//Hello
        System.out.println(s1.toUpperCase());//HELLO
        System.out.println(s1.toLowerCase());//hello

        String name = "Asim H. Can";
        System.out.println(name);
        System.out.println("MY name is :" + name.toLowerCase());
        System.out.println("MY name is :" + name.toUpperCase());
        System.out.println(name.equalsIgnoreCase("ASIM H. CAN"));
        //in order to get how many character we have inside String
        //we can use length methot
        System.out.println(s1.length());
        System.out.println(name.length());

        int lengthOfs1 = s1.length();

        if (lengthOfs1 > 4) {
            System.out.println(" More than 4 character");
        } else {
            System.out.println("NOT MORE THAN 4");
        }
    }
}