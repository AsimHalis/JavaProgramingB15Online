package day17;

public class WhileOnlyOddNumber {
    public static void main(String[] args) {
        int num = 100;
        while (num >= 0) {
            if (num % 2 == 1) {// if(num%0!=0)
                System.out.println(num + " is odd number");
            }
        --num;
        }
    }
}