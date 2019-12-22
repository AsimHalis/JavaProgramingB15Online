package day29;

import java.util.Arrays;

public class FillingUpArrayValue {
    public static void main(String[] args) {
        int[] numbers=new int [100];
    System.out.println("Before filling up array \n"+Arrays.toString(numbers));
                           //[0, 0, 0, 0,......]
       /// numbers[0]=1;
       // numbers[1]=2;
       // System.out.print(Arrays.toString(numbers));//[1, 2, 3, 0,......]
        for (int x = 0; x <numbers.length ; x++) {
            numbers[x]=x+1;
        }
        System.out.println("After filling up \n"+Arrays.toString(numbers));
        //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,..]
    }
}
