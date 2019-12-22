package day27;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Multi_Dim_3D {
    public static void main(String[] args) {
        //2D Array: Contains 1D dementional Array
        int [][]arr2D={{1,2,3},{4,5,6}};
        // 3D Array: Contains 2D dementional Array
        int [][][] arr3D={  { {1,2,3},{4,5,6}} , { {7,8,9},{10,11,12}} };

        //print 9:
        System.out.println(arr3D[1][0][2]);//==>9
        //print:3
        System.out.println(arr3D[0][0][2]);//==>3
        //print:{1,2,3}
        System.out.println(arr3D[0][0]);//retun 1D Array  [I@6acbcfc0
        System.out.println(Arrays.toString(arr3D[0][0]));//==>[1, 2, 3]
       //print : {10,11,12}
        System.out.println(Arrays.toString(arr3D[1][1]));//==>[10, 11, 12]
        //print:{{7,8,9},{10,11,12}}
        System.out.println(Arrays.toString(arr3D[1]));//[[I@5f184fc6, [I@3feba861]
        System.out.println(Arrays.deepToString(arr3D[1]));//[[7, 8, 9], [10, 11, 12]]
        //print:All arr3D Array
        System.out.println(Arrays.deepToString(arr3D));//[[[1, 2, 3], [4, 5, 6]], [[7, 8, 9], [10, 11, 12]]]




    }
}
