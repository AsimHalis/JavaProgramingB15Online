package day20;
//import java.util.Scanner;
public class SumOfEvenOddSeparately {
    public static void main(String[] args) {
       // Scanner scan=new Scanner(System.in);
        int sumOfEven=0;
        int sumOfOdd=0;
        for (int x = 10; x <=100 ; x++) {
            if(x%2==0){
             sumOfEven=sumOfEven+x;
            }
            else{
                sumOfOdd=sumOfOdd+x;
            }


        }
        System.out.println("sumOfOdd = "+ sumOfOdd);
        System.out.println("sumOfEven = "+sumOfEven);
    }
}
