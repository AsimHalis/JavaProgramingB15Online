package day33;

public class MethodSumOf1toX {
    public static void main(String[] args) {
        System.out.println(sum1ToX(10));
        System.out.println(sum1ToX(15));
    }
    public static int sum1ToX(int X){
        int sum=0;
        for (int i = 1; i <=X ; i++) {
           sum=sum+i;

        }

        return sum;
    }



}
