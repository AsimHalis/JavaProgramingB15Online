package day24;

import java.util.Arrays;

public class ArrayEquality {
    public static void main(String[] args) {
        int[]score1={2,5,6,7,8,9,34};
        int[] score2={22,45,67,3,54,12};
        int[] score3={2,5,6,7,8,9,34};
        int[] score4={5,2,6,7,9,8,34};
        boolean isS1S2Equals= Arrays.equals(score1,score2);
        System.out.println(isS1S2Equals);//false
        boolean isS1S3Equals= Arrays.equals(score1,score3);
        System.out.println(isS1S3Equals);//true
        boolean isS1S4Equals= Arrays.equals(score1,score4);
        System.out.println(isS1S4Equals);//false!!

    }
}
