package Assignments;
import java.util.Arrays;
import java.util.Scanner;
public class _107SliceNumber {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int num3 = scnr.nextInt();
        int[] num1 = {num3};
        String newNumber = Arrays.toString(num1);
       System.out.println(newNumber);
        System.out.println("Enter your number:");
        for (int x = 0; x < newNumber.length()-2; x++) {

            System.out.println(newNumber.substring(x+1, x + 2));
        }
    }
}