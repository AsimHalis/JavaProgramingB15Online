package day07;

public class Casting {
    public static void main(String[] args) {
        double bigNum=10;
        System.out.println(bigNum);//10.0
        int num=(int) 12.99;
        System.out.println(num);//12

        long num1= 123;
        int num2= (int)num1;
        System.out.println(num2);
    }
}
