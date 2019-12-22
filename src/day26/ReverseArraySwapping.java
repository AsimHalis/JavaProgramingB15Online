package day26;

import java.util.Arrays;

public class ReverseArraySwapping {
    public static void main(String[] args) {
        int [] myNumber=new int[] {5,1,21,2,13,6,8};
        int size=myNumber.length;
        int lastIndex=size-1;
        int middleIndex=size/2;
        System.out.println(Arrays.toString(myNumber));

       // System.out.println(myNumber[0]+"-----"+myNumber[lastIndex]);//5----8
     //   System.out.println(myNumber[1]+"-----"+myNumber[lastIndex-1]);//1---6
        for (int x = 0; x <middleIndex ; x++) {
            int temp=myNumber[x];
            myNumber [x]=myNumber[lastIndex-x];
            myNumber[lastIndex-x]=temp;
        }
        System.out.println(Arrays.toString(myNumber));
    }
}
