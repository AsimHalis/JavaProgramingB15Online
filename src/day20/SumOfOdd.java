package day20;

public class SumOfOdd {
    public static void main(String[] args) {
       int count=0;
        int sum=0;
        for (int x = 10; x <=100 ; x++) {
      if (x%2==1){
         //System.out.println(x);
          sum=sum+x;
      }
++count;
        }
        System.out.println("sum of Odd number = "+sum);
        System.out.println("count of odd number = "+count);
    }
}
