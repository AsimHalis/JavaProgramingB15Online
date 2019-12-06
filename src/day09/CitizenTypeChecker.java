package day09;

import java.util.Scanner;
 /*Task 2
         Create a class called CitizenTypeChecker with main method
        Create a variable called cityzenType as String
        And create a variable with age
        If the age  is more than 65 , assign value of  cityzenType to Senior
         If not , assign value of  cityzenType to Not-Senior
  */

public class CitizenTypeChecker {
    public static void main(String[] args) {
        Scanner citizen=new Scanner(System.in);
        System.out.println("Enter the age");
        String citizenType;
            int age=citizen.nextInt();
        if(age>65) {
            citizenType="Senior";
             }
  else {
          citizenType="Not-Senior";
        }
        System.out.println("The citizen age is "+age+" ,and he/she is a "+citizenType);
    }
}
