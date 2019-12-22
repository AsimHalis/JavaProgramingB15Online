package day27;

import java.util.Arrays;

public class MultiDimentiArray {
    public static void main(String[] args) {
        int[] arr1D={1,2,3};
        //2Darray: is an array that contains single dimensional Arrays
                    //   0 1 2   0 1 2
        int[][] arr2D= {{1,2,3},{3,4,5}};
                     //    0       1
        System.out.println(arr2D.length);//2
        System.out.println(Arrays.toString(arr2D[0]));//retun to array==>[1,2,3]
        System.out.println(Arrays.toString(arr2D[1]));//retun to array==>[3,4,5]
        System.out.println(arr1D[0]);//==>1
        System.out.println(arr2D[0]);//==>[I@6acbcfc0
        System.out.println(Arrays.toString(arr2D[0]));//[1, 2, 3]
        System.out.println(arr2D[0][2]);//retun to int value==>3

       // Arrays.deepToString
        System.out.println(Arrays.deepToString(arr2D));//[[1, 2, 3], [3, 4, 5]]


    }
}
