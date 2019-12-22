package day31;

public class Calculator {
    public static void main(String[] args) {
        add(6,23);//Addition result : 29
        add(20,32);//Addition result : 52
        add(5,12);//  Addition result : 17
      add3Numbers(5,23,7);//Addition 3 numbers result : 35.0
      add3Numbers(9,10,25);//Addition 3 numbers result : 44.0

    }
    public static void add(int num1, int num2){
        System.out.println("Addition result : "+ (num1+num2));

    }
    public static void add3Numbers(int num1, int num2, double num3){
        System.out.println("Addition 3 numbers result : "+ (num1+num2+num3));
    }
}
