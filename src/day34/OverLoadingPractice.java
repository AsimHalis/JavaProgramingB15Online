package day34;

public class OverLoadingPractice {
    public static void main(String[] args) {
        add(15);
        add(15, 34);
        add(25,45,60);
        add(10L,24L);//if you not enter L it will int

    }

    public static void add(int num) {
        System.out.println(num + 100);
    }

    public static void add(int a, int b) {
        System.out.println(a + b+" calling add(int a, int b)");
    }

    public static void add(int a, int b, int c) {
        System.out.println(a + b + c+" calling add(int a, int b,int c)");
    }
    public static void add(long a, long b){
        System.out.println(a+b+" calling add(long a, long b)");
   }
}