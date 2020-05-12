package day01; //

import java.util.Scanner;

public class Main {
    // class is the most fundamental building block of your source code

    // This is the place you program start running
    public static void main(String[] args) {// Main Method
        // This is called comment and it always start with double slash "//"
        //and compiler will IGNORE THIS!!
        // I am going to say Hello
        //Java is case sensitive language
        //System  and system are very different thing in java!
        System.out.println("Hello World");

        Scanner scan=new Scanner(System.in);
        System.out.println("input your age");
        int age= scan.nextInt();
      //  System.out.println("input your name");
        String name=scan.next();
        System.out.println("your age :"+age+"  your name is :"+name);

    }
}
