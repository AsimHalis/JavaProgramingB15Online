package day06;

import java.util.Scanner;

public class MinuteConverttor {

    public static void main(String[] args) {
        Scanner time = new Scanner(System.in);
        System.out.println("Enter the minute you want to convert");
        int minutes = time.nextInt();
        int hoursPart = minutes / 60;
        int minsPart = minutes % 60;
        System.out.println("The minutes " + minutes + " is " + hoursPart + " hours and " + minsPart + " minutes");

    }
}