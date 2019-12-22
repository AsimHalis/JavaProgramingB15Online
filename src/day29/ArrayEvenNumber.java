package day29;

import java.util.Arrays;
// task: Even number
public class ArrayEvenNumber {
    public static void main(String[] args) {
        int[] numbers=new int [100];
        System.out.println("Before filling up array \n"+ Arrays.toString(numbers));
        for (int x = 0; x <numbers.length ; x++) {
           numbers [x] =2*x;
        }
        System.out.println(Arrays.toString(numbers));


    }
}
