package day27;

import java.util.Arrays;

public class MultiDimentionArrayLoop {
    public static void main(String[] args) {
        int[][] numbers ={{1,2,3},{4,5,6},{7,8,9},{10,12,13,14}};
        for (int i = 0; i <numbers.length ; i++) {

            System.out.println(Arrays.toString(numbers[i]));//[1, 2, 3]
//                                                            [4, 5, 6]
//                                                            [7, 8, 9]
//                                                       [10, 12, 13, 14]

        }
        System.out.println(numbers[3][3]);//=>14

    }
}
