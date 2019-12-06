package day12;

import jdk.swing.interop.SwingInterOpUtils;

public class FizzBuzzNumberCheck {
    public static void main(String[] args) {
        int num=30;
        if(num%15==0){
            System.out.println("FizzBuzz number");
        }
        else if(num%3==0){
            System.out.println("Buzz number");
        }
        else if(num%5==0){
            System.out.println("Fizz number");
        }
        else {
            System.out.println("NOT MY NUMBER");
        }
    }
}
