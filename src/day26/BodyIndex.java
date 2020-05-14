package day26;

import java.util.Scanner;

public class BodyIndex {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println("input your weight");
        int weight=scn.nextInt();
        System.out.println("input your length");
        double length=scn.nextDouble();
         double index=weight/(length*length);
        System.out.println("your index :"+index);
    }

}
