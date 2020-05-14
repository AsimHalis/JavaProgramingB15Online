package day39_Recapp;

public class Methods {
    public static void main(String[] args) {
        name("halis");
        sum1(10,20,30);
        System.out.println("sum2 of 3 numbers = " + sum2(11,22,33));
        multiply(10,20);
        System.out.println("croos the 2 method ="+sum2(10,20,30)+multiply(5,10));
    }
    public static void name(String name){
        System.out.println("your name is :"+name);
    }

    public static void sum1(int a, int b, int c){
        System.out.println("sum1 of 3 numbers = "+ (a+b+c));
    }

    //retun:======================
    public static int sum2(int a, int b, int c) {
        return a+b+c;
    }
    public static int multiply(int a, int b){
        int multply=a*b*4;
      System.out.println("result = "+multply);
        return multply;
      //  System.out.println("after return");  after return can not execute cote
    }

}
