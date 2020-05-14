package AAA_InterviewQuestion;

import java.util.Scanner;

public class AmstrongNumber {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("please input the number");
        int number = scn.nextInt();
        System.out.println("please input the digits");
        int digits = scn.nextInt();

        int total = 0;
        int tempNumber = number;
        do {
            int stepValue = tempNumber % 10;
            tempNumber  /=10;
            total += Math.pow(stepValue, digits);
        } while (tempNumber >0);

        if (total == number) {
            System.out.println("this number is Amstrong number");
        }else {
            System.out.println("this number is NOT Amstrong number");
        }
    }
}
